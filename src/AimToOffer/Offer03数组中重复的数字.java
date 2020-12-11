package AimToOffer;

import java.util.HashSet;

/**
 * 找出数组中重复的数字。

 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * 限制：
 * 2 <= n <= 10000
 */

public class Offer03数组中重复的数字 {
    /**
     * 原地交换
     * @param nums
     * @return
     */
    public int findRepeatNumber2(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i])
                return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }



    /**
     * 哈希表
     * @param nums
     * @return
     */
    public int findRepeatNumber1(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (hashSet.contains(num))
                return num;
            else
                hashSet.add(num);
        }
        return -1;
    }

}
