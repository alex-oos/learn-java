package com.springboot.utils;

import cn.hutool.core.date.DateTime;
import cn.hutool.crypto.KeyUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.signers.AlgorithmUtil;
import cn.hutool.jwt.signers.JWTSigner;
import cn.hutool.jwt.signers.JWTSignerUtil;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author LiJiang
 * @since 2021/6/24 11:32
 */

public class HuJwtUtils {

    // 设置过期时间
    public static final long EXPIRE = 1000 * 60 * 60 * 24;


    /**
     * 生成token信息
     *
     * @param id
     * @param nickname
     * @return
     */
    public static String getJwtToken(String id, String nickname) {

        String signerId = "rs256";
        JWTSigner signer = JWTSignerUtil.createSigner(signerId,
                // 随机生成密钥对，此处用户可自行读取`KeyPair`、公钥或私钥生成`JWTSigner`
                KeyUtil.generateKeyPair(AlgorithmUtil.getAlgorithm(signerId)));

        String jwtToken = JWT.create()
                .setPayload("id", id)
                .setPayload("nickname", nickname)
                .setSigner(signer)
                .setIssuedAt(new Date())
                .setExpiresAt(DateTime.of(System.currentTimeMillis() + EXPIRE))
                .sign();

        return jwtToken;
    }

    /**
     * 判断token是否存在与有效
     *
     * @param jwtToken
     * @return
     */
    public static boolean checkToken(String jwtToken) {

        if (StringUtils.isEmpty(jwtToken)) {
            return false;
        }
        try {
            long exp = (Long) JWT.of(jwtToken).getPayload("exp");

            System.out.println("DateTime.of(exp) = " + DateTime.of(exp));

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 判断token是否存在与有效
     *
     * @param request
     * @return
     */
    public static boolean checkToken(HttpServletRequest request) {

        try {
            String jwtToken = request.getHeader("token");
            if (StringUtils.isEmpty(jwtToken)) {
                return false;
            }
            long exp = (Long) JWT.of(jwtToken).getPayload("exp");
            System.out.println("过期时间是 = " + DateTime.of(exp));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 根据token获取会员id
     *
     * @param request
     * @return
     */
    public static String getMemberIdByJwtToken(HttpServletRequest request) {

        String jwtToken = request.getHeader("token");
        if (StringUtils.isEmpty(jwtToken)) {
            return "";
        }
        Object id = JWT.of(jwtToken).getPayload("id");

        return (String) id;
    }

 /*   public static void main(String[] args) {
        String jwtToken = HuJwtUtils.getJwtToken("1", "lijiang");
        boolean token = HuJwtUtils.checkToken(jwtToken);
    }*/
}
