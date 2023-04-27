package cn.leetcode.day1;


import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName https://leetcode.cn/problems/two-sum/ 两数之和
 * @Description
 * @Author Alex
 * @Date 2022/7/22 21:15
 * @Version 1.0
 */
public class Sum {

    /*
    * 方法一：暴力枚举
思路及算法

最容易想到的方法是枚举数组中的每一个数 x，寻找数组中是否存在 target - x。

当我们使用遍历整个数组的方式寻找 target - x 时，需要注意到每一个位于 x 之前的元素都已经和 x 匹配过，因此不需要再进行匹配。而每一个元素不能被使用两次，所以我们只需要在 x 后面的元素中寻找 target - x。

作者：LeetCode-Solution
链接：https://leetcode.cn/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    * */
    public static int[] f (int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    /*
     * 方法二：哈希表法
     * */

    public static int[] f2 (int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<> (len - 1);
        for (int i = 0; i < len; i++) {
            if (hashMap.containsKey (target - nums[i])) {
                return new int[]{hashMap.get (target - nums[i]), i};
            }
            hashMap.put (nums[i], i);
        }
        return new int[0];

    }


    public static void main (String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int target = 10;
        System.out.println ("f(nums,target) = " + Arrays.toString (f (nums, target)));
        System.out.println ("f(nums,5) = " + Arrays.toString (f (nums, 5)));

        System.out.println ("Arrays.toString = " + Arrays.toString (f2 (nums, 5)));

    }


}
