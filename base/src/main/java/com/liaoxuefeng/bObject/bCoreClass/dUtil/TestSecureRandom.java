package com.liaoxuefeng.bObject.bCoreClass.dUtil;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 * @author Alex
 * @Descprition: SecureRandom：生成安全的随机数
 * @since 2020/6/2 15:57
 */
public class TestSecureRandom {

    public static void f() {

        SecureRandom sr = new SecureRandom();
        System.out.println("sr.nextInt(100) = " + sr.nextInt(100));
    }

    public static void f1() {

        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom(); // 获取普通的安全随机数生成器
        }

        byte[] buffer = new byte[6];
        sr.nextBytes(buffer);  // 用安全随机数填充buffer
        System.out.println("Arrays.toString(buffer) = " + Arrays.toString(buffer));
    }

    public static void main(String[] args) {

        f();
        f1();
    }

}
