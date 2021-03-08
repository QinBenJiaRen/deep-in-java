package Problems.Easy.数组;

/**
 * @Description 最长连续递增序列
 * @Author jia_h
 * @Date 2021/2/27 14:57
 * @Version 1.0
 */
public class LeetCode_674 {

    /**
     * url:https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/
     */
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        int res = findLengthOfLCIS(nums);
        System.out.println(res);
    }

    public static int findLengthOfLCIS(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int n = nums.length, left = 0;
        int maxLength = 0;
        int temp = 1;
        for (int i = 0; i < n - 1; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            if (a < b) {
                temp++;
            } else if (a == b) {
                temp = temp;
            } else if (a > b) {
                if (temp >= maxLength) {
                    maxLength = temp;
                    temp = 0;
                }
            }
        }
        return maxLength;
    }
}
