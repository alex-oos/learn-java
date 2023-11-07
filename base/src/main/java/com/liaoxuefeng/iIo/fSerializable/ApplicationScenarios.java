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

    /**
     * json 反序列化的时候，值不需要与对象的属性一一对应，只要json字符串中的key与对象的属性有一个相同即可,不存在的值会被赋值为null
     */
    public static void f() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "测试反序列化");
        jsonObject.put("key", "测试key");
        User user = JSONObject.parseObject(jsonObject.toJSONString(), User.class);
        System.out.println("反序列化： " + user);
    }


    public static void main(String[] args) {

        jsonScenarios();
        f();
    }


}
