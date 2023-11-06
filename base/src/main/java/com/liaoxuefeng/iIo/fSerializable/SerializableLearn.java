package com.liaoxuefeng.iIo.fSerializable;


import com.liaoxuefeng.iIo.fSerializable.enity.User;

import java.io.*;

/**
 * <p>
 * 序列化和反序列化介绍：
 * </p>
 *
 * @author ALex
 * @since 2021/6/25 16:55
 */
public class SerializableLearn {

    public static void main(String[] args) throws Exception {
        // 初始化对象
        User user = new User();
        user.setName("yaomy");
        user.setAge(23);
        System.out.println(user);
        // 序列化对象到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("template"));
        oos.writeObject(user);
        oos.close();
        // 反序列化
        File file = new File("template");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        User newUser = (User) ois.readObject();
        System.out.println(newUser.toString());
    }

}
