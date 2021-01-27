package Problems.Easy;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/27 15:57
 * @Version 1.0
 */
public class LeetCode_231 {

    /**
     * url:https://leetcode-cn.com/problems/power-of-two/
     * */
    public static void main(String[] args) {

    }

    /**
     * 时间复杂度为O(logN)
     * */
    public boolean isPowerOfTwo_1(int n) {
        if (n < 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    /**
     * 位运算,时间复杂度O(1)
     * */
    public boolean isPowerOfTwo_2(int n) {
        if (n < 0) {
            return false;
        }
        long x =  (long)n;
        return (x & (-x)) == x;
    }
}
