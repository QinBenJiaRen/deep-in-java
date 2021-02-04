package Problems.Easy;

import java.awt.font.NumericShaper;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 子数组最大平均数
 * @Author jia_h
 * @Date 2021/2/4 9:53
 * @Version 1.0
 */
public class LeetCode_643 {

    /**
     * url:https://leetcode-cn.com/problems/maximum-average-subarray-i/
     * */
    public static void main(String[] args) {
        int[] nums = new int[] {-1};
        findMaxAverage(nums, 1);
    }

    //暴力求解
    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        double max = -Double.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            double res = 0;
            for (int j = i; j < k+i; j++) {
                res += nums[j];
            }
            if (res >= max) {
                max = res;
            }
        }
        double d = max / k;
        return d;
    }
}
