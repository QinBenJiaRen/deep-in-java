package Problems.Easy;

/**
 * 69. Sqrt(x)
 * Implement int sqrt(int x).
 *
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 *
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 *
 * Example 1:
 *
 * Input: 4
 * Output: 2
 * Example 2:
 *
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since
 *              the decimal part is truncated, 2 is returned.
 * */
public class LeetCode_69 {

    public static void main(String[] args) {
        System.out.println(mySqrt(8));

        System.out.println(Math.sqrt(8));
    }

    public static double mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        double mid = 0.0;
        double left = 0;
        double right = x;
        while (left <= right) {
            mid = (left + right) / 2;
            if (x / mid > mid) {
                left = mid;
                //System.out.printf("x={%s}, left={%s}, right={%s}, mid={%s}\n", x, left, right, mid);
            }
            if (x / mid < mid) {
                right = mid;
                //System.out.printf("x={%s}, left={%s}, right={%s}, mid={%s}\n", x, left, right, mid);
            }

            if (Math.abs((x / mid) - mid) <= 0.001) {
                //System.out.printf("x={%s}, left={%s}, right={%s}, mid={%s}\n", x, left, right, mid);
                return mid;
            }
        }
        return mid;
    }
}
