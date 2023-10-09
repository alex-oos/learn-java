package qa.tools.utils;


import cn.hutool.json.JSONUtil;
import com.springboot.utils.HuHttpUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * @author Alex
 * @date 2021/12/15 10:42 上午
 * <P>
 * 钉钉机器人
 * </p>
 */
@Slf4j
public class DingDingWarnUtil {


    public static boolean sendMsg(String content) {

        String url = "https://oapi.dingtalk.com/robot/send?access_token=a445fb691e4e2e421fb4f430c17c17da0460e50a3b34927ae5ed341d10e1a68a";
        HashMap<String, Object> map = new HashMap<>();
        map.put("msgtype", "text");
        HashMap<String, Object> temp = new HashMap<>();
        temp.put("content", "检测服务:" + content);
        map.put("text", temp);
        System.out.println(JSONUtil.toJsonStr(map));
        String body = JSONUtil.toJsonStr(map);
        String reponse = HuHttpUtil.doPost(url, body);

        boolean ifSuccess = JSONUtil.parseObj(reponse).get("errmsg").toString().equals("ok");
        return ifSuccess;
    }

    public static void main(String[] args) {

        boolean isSuccess = DingDingWarnUtil.sendMsg("服务已经宕机，请查看1");
        if (isSuccess) {
            log.info("发送成功");
        } else {
            log.info("发送失败");
        }

    }

}
