package Problems.Easy.数组;

import java.util.Arrays;

/**
 * @Description 数组中重复的数字 https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * @Author jia_h
 * @Date 2021/8/5 17:07
 * @Version 1.0
 */
public class Offer_03 {

    /**
     * 排序后寻找
     * */
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] == nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }
}
