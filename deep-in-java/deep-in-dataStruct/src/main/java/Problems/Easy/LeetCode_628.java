package Problems.Easy;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/20 13:30
 * @Version 1.0
 */
public class LeetCode_628 {

    /**
     * url: https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
     */

    public static void main(String[] args) {

    }

    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }
}
