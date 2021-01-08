package Problems.Hard;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/8 10:19
 * @Version 1.0
 */
public class LeetCode_239 {

    /**
     * url: https://leetcode-cn.com/problems/sliding-window-maximum/
     * */

    public static void main(String[] args) {

    }

    /**
     * 暴力求解
     * 可以解决，但是会超时
     * */
    private static int[] maxSlidingWindow(int[] nums, int k) {

        int[] res = new int[nums.length - k + 1];
        for (int  i = 0; i < nums.length - k + 1; i++) {
            Integer max = Integer.MIN_VALUE;
            for (int j = i; j < k; j++) {
                int number = nums[j];
                if (max < number) {
                    max = number;
                }
            }
            res[i] = max;
        }
        return res;
    }
}
