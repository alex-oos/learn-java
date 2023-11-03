package com.liaoxuefeng.bObject.bCoreClass.dUtil;

import java.util.UUID;

/**
 * <P>
 * UUID是Universally Unique Identifier的缩写，它是一个128位的全局唯一标识符，
 * 通常由32字节的字符串表示，java中通过UUID类来进行生成。
 * UUID是由一组32位数的16进制数字所构成，这些数字包含了与网卡、时间、生成一个唯一值
 * </p>
 *
 * @author alex
 * @since 2023/11/3 上午9:57
 */
public class UUIDUtil {

    public static void main(String[] args) {

        String string = UUID.randomUUID().toString();
        System.out.println("string = " + string);
        String string1 = UUID.fromString(string).toString();
        System.out.println("string1 = " + string1);
        System.out.println("UUID.randomUUID().toString() = " + UUID.randomUUID());
        long mostSignificantBits = UUID.randomUUID().getMostSignificantBits();
        System.out.println("mostSignificantBits = " + mostSignificantBits);

        long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
        System.out.println("leastSignificantBits = " + leastSignificantBits);
    }

}
