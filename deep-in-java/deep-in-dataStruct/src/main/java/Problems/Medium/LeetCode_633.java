package Problems.Medium;

/**
 * @Description 平方数之和
 * @Author jia_h
 * @Date 2021/4/28 16:53
 * @Version 1.0
 */
public class LeetCode_633 {

    /**
     * url:https://leetcode-cn.com/problems/sum-of-square-numbers/
     * */
    public static void main(String[] args) {

    }

    /**
     * 暴力求解法
     * */
    public boolean judgeSquareSum(int c) {
        for (long i = 0; i * i <= c; i++) {
            double a = Math.sqrt(c - i * i);
            if (a == (int) a) {
                return true;
            }
        }
        return false;
    }
}
