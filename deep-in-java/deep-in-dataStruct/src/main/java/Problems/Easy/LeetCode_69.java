package Problems.Easy;

import java.util.Map;

/**
 * 69. Sqrt(x)
 * Implement int sqrt(int x).
 * <p>
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * <p>
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 * <p>
 * Example 1:
 * <p>
 * Input: 4
 * Output: 2
 * Example 2:
 * <p>
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since
 * the decimal part is truncated, 2 is returned.
 */
public class LeetCode_69 {

    public static void main(String[] args) {
        System.out.println(mySqrt(8));

        //System.out.println(Math.sqrt(8));
    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int start = 1;
        int end = x;
        int ans = 0;
        while (start <= end) {
            // 防止int类型数据超出范围
            int mid = start + (end - start) / 2;
            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
