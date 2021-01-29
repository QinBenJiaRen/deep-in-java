package Problems.Easy;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/29 9:45
 * @Version 1.0
 */
public class LeetCode_724 {

    /**
     * url:https://leetcode-cn.com/problems/find-pivot-index/
     * */
    public static void main(String[] args) {

    }

    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (total - result - nums[i] == result) {
                return result;
            }
            result += nums[i];
        }
        return -1;
    }
}
