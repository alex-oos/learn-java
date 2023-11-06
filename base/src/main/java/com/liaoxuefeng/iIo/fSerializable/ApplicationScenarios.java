package com.liaoxuefeng.iIo.fSerializable;

import com.alibaba.fastjson2.JSONObject;
import com.liaoxuefeng.iIo.fSerializable.enity.User;

/**
 * <P>
 * 序列化和反序列化的应用场景：
 * 1、json序列化和反序列化 主要使用的fastjson
 * 2、网络传输 xml
 * </p>
 *
 * @author Alex
 * @since 2023/10/28 下午5:45
 */
public class ApplicationScenarios {

    /**
     * JSON的序列化与反序列化
     * JSON的序列化指的就是将JavaBean对象转化为JSON格式的字符串
     * JSON的反序列化指的就是将JSON格式的字符串转化为JavaBean对象
     */

    public static void jsonScenarios() {

        User user = new User("序列化", 23);
        JSONObject jsonObject = JSONObject.from(user);
        System.out.println("序列化后：  " + jsonObject);

        // 反序列化：将json字符串转换为java对象
        String jsonString = jsonObject.toJSONString();
        User user1 = JSONObject.parseObject(jsonString, User.class);
        System.out.println("反序列化： " + user1);

    }


    public static void main(String[] args) {

        jsonScenarios();
    }


}
