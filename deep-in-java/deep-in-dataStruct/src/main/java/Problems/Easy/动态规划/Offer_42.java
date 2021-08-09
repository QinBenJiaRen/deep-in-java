package Problems.Easy.动态规划;

/**
 * @Description 连续子数组的最大和 https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 * @Author jia_h
 * @Date 2021/8/9 11:39
 * @Version 1.0
 */
public class Offer_42 {

    /**
     * 动态规划
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
