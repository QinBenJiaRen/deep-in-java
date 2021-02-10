package Problems.Easy;

import java.util.Arrays;

/**
 * @Description 两数之和
 * @Author jia_h
 * @Date 2021/2/8 14:09
 * @Version 1.0
 */
public class LeetCode_1 {

    /**
     * url:https://leetcode-cn.com/problems/two-sum/
     */
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3};
        int[] res = twoSum(nums, 6);
        System.out.println(res);

    }

    /**
     * 二分查找
     * */
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] copy = Arrays.copyOf(nums, n);
        int[] res = new int[2];
        Arrays.sort(nums);
        int a = 0, b = 0;
        for (int left = 0, right = n - 1; left < right; left++, right--) {
            a = nums[left];
            b = nums[right];
            int c = a + b;
            if (a + b == target) {
                res[0] = a;
                res[1] = b;
                break;
            } else if (c > target) {
                left--;
            } else if (c < target) {
                right++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (res[0] == copy[i]) {
                res[0] = i;
                break;
            }
        }

        if (a != b) {
            for (int i = 0; i < n; i++) {
                if (res[1] == copy[i]) {
                    res[1] = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (res[1] == copy[i] && i != res[0]) {
                    res[1] = i;
                    break;
                }
            }
        }
        return res;
    }
}
