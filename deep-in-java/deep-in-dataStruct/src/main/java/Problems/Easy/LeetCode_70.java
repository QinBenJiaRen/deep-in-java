package Problems.Easy;

/**
 * 70. Climbing Stairs
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * */
public class LeetCode_70 {

    public static void main(String[] args) {
        int total = climbStairs(5);
        System.out.println(total);
    }

    /**
     * 动态规划
     * f(n) = f(n-1) + f(n-2) 动态方程 本质：斐波那契数列
     * */
    public static int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }

    /**
     * 递归 + 记忆数组
     * */
    public static int climbStairs2(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }

    public static int helper(int n, int[] memo) {
        if (n <= 1) {
            return 1;
        }
        if (memo[n] > 0 ) return memo[n];

        return memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
    }

    /**
     *
     * */
    public static int climbStairs3(int n) {
        if (n <= 1) return 1;
        int a = 1;
        int b = 1;
        while (n-- > 0) {
            b += a;
            a = b - a;
        }
        return a;
    }


}
