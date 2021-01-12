package Problems.Easy;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/12 9:28
 * @Version 1.0
 */
public class LeetCode_977 {

    /**
     * url:https://leetcode-cn.com/problems/squares-of-a-sorted-array/
     * */
    public static void main(String[] args) {
        int[] arr = new int[]{-4,-1,0,3,10};
        sortedSquares(arr);
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }
        Arrays.sort(res);
        return res;
    }
}
