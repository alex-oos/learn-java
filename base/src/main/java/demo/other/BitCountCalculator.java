package demo.other;

import java.math.BigInteger;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/1 下午3:11
 */
public class BitCountCalculator {

    public static void main(String[] args) {

        int num = 100; // 替换为你要计算位数的整数
        System.out.println("Integer.toBinaryString(num) = " + Integer.toBinaryString(num));
        int bitCount = countBits(num);
        System.out.println("整数 " + num + " 的位数是: " + bitCount);
        boolean b = checkBitbyRange("100", 0, 3, 63);
        System.out.println("b = " + b);
        boolean c = function(100, 0, 3, 63);
        System.out.println("c = " + c);

    }

    public static int countBits(int num) {

        int count = 0;
        while (num != 0) {
            // 使用位操作检查最低位是否为1
            if ((num & 1) == 1) {
                count++;
            }
            // 右移整数，继续检查下一位
            num >>>= 1; // 使用 >>> 以处理负数
        }
        return count;
    }

    public static boolean checkBitbyRange(String ltype, int begin, int end, int max) {

        boolean flag = false;
        String bitStr;
        BigInteger intType = new BigInteger(ltype);
        int i = intType.bitCount();

        if (!(intType.equals(new BigInteger("0")))) {
            // 将其转换为2进制的数据
            bitStr = intType.toString(2);
            if (-1 != max && bitStr.length() > max + 1) {
                return flag;
            } else {
                for (int numbit = begin; numbit <= end; numbit++) {
                    if ((bitStr.length() - 1 - numbit) >= 0) {
                        if (('1' == bitStr.charAt(bitStr.length() - 1 - numbit))) {
                            flag = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }

            }
        }
        return flag;
    }

    public static boolean function(int ltype, int startBit, int endBit, int max) {

        if (startBit < 0 || endBit > 31 || startBit > endBit) {
            throw new IllegalArgumentException("Invalid bit range specified.");
        }

        int mask = 0;
        for (int i = startBit; i <= endBit; i++) {
            mask |= (1 << i);
        }

        return (ltype & mask) != 0;

    }


}
