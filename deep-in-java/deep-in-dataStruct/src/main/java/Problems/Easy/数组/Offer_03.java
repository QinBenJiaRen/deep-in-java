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
    
    /**
     * 原地排序 , 将每个数字nums[i]放到对应的位置i上
     * 详细过程见《剑🈯️Offer》第二版第39页
     */
    public int findRepeatNumber_1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                } else {
                    int tmp = nums[i];
                    nums[i] = nums[tmp];
                    nums[tmp] = tmp;
                }
            }
        }
        return -1;
    }
}
