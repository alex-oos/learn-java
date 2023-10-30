package com.liaoxuefeng.iIo.fSerializable;

import com.alibaba.fastjson2.JSONObject;

/**
 * <P></p>
 *
 * @author lijiang
 * @since 2023/10/28 下午5:45
 */
public class ApplicationScenarios {

    /**
     * 序列化和反序列化的应用场景：
     * 1、json序列化和反序列化 主要使用的fastjson
     * 2、网络传输 xml
     */

    public static void function() {
        // 序列化：将java 对象转化为json字符串
        // 先将java对象转换为json对象，在将json对象转换为json字符串
        User user = new User("序列化", 23);
        JSONObject jsonObject = JSONObject.from(user);
        System.out.println("序列化后：  " + jsonObject);

        // 反序列化：将json字符串转换为java对象
        String jsonString = jsonObject.toJSONString();
        User user1 = JSONObject.parseObject(jsonString, User.class);
        System.out.println("反序列化： " + user1);


    }

    public static void main(String[] args) {

        function();
    }


}
