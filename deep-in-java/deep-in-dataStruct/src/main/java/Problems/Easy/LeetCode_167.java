package Problems.Easy;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @Description 两数之和 II - 输入有序数组
 * @Author jia_h
 * @Date 2021/2/18 9:32
 * @Version 1.0
 */
public class LeetCode_167 {

    /**
     * url:https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
     */
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] res = twoSum(nums, 9);
        System.out.println(res);
        Date date = new Date();
        System.out.println(System.currentTimeMillis()/1000);

    }

    /**
     * 双指针
     */
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if (numbers == null) {
            return res;
        }

        int n = numbers.length;
        for (int left = 0, right = n - 1; left < right; left++, right--) {
            int a = numbers[left];
            int b = numbers[right];
            int c = a + b;
            if (c == target) {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            } else if (c > target) {
                left--;
            } else if (c < target) {
                right++;
            }
        }
        return res;
    }

    /**
     * 二分查找
     */
    public static int[] twoSum_2(int[] numbers, int target) {
        return null;
    }
}
