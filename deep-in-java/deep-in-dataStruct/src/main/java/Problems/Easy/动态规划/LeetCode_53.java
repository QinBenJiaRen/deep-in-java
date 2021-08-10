package Problems.Easy.动态规划;

/**
 * @Description 最大子序和 https://leetcode-cn.com/problems/maximum-subarray/
 * @Author jia_h
 * @Date 2021/8/10 11:46
 * @Version 1.0
 */
public class LeetCode_53 {

    /**
     * 同剑指offer第42题
     * */
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(pre, maxAns);
        }
        return maxAns;
    }
}
