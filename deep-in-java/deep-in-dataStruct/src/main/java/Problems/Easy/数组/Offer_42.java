package Problems.Easy.数组;

import java.util.UUID;

/**
 * @Description 连续子数组的最大和 https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 * @Author jia_h
 * @Date 2021/8/7 17:51
 * @Version 1.0
 */
public class Offer_42 {

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }


    /**
     * 前缀和
     * */
    public int subArraySum(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        sum[0] = 0;
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        for (int j = 0; j < sum.length; j++) {
            System.out.println(sum[j]);
        }
        return 0;
    }


}
