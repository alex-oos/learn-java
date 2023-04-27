package cn.leetcode.old.day2;


import java.util.Arrays;

/**
 * @author: TangKaiZe
 * @since: 2021/7/13 下午 12:10
 * <p>
 * 给两个有序的数组，进行拼接，最后返回一个新的数组
 * </p>
 */
public class Code3 {

    /**
     * @param array1
     * @param array2
     * @return
     */
    public static int[] function(int[] array1, int[] array2) {

        int lena = array1.length;
        int lenb = array2.length;
        int[] c = new int[lena + lenb];
        int i = 0, j = 0, k = 0;
        while (i < lena && j < lenb) {
            if (array1[i] < array2[j]) {
                c[k++] = array1[i++];
            } else {
                c[k++] = array2[j++];
            }
        }
        while (i < lena) {
            c[k++] = array1[i++];
        }
        while (j < lenb) {
            c[k++] = array2[j++];
        }
        return c;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 2, 4, 9};
        int[] array2 = {3, 5, 6};
        System.out.println("function(array1,array2) = " + Arrays.toString(function(array1, array2)));
    }

}
