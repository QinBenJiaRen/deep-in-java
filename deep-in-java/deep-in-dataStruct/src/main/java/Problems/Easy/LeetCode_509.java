package Problems.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/4 17:28
 * @Version 1.0
 */
public class LeetCode_509 {

    /**
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
     * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2), for n > 1.
     * Given n, calculate F(n).
     *
     * Example 1:
     *
     * Input: n = 2
     * Output: 1
     * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
     * Example 2:
     *
     * Input: n = 3
     * Output: 2
     * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
     * Example 3:
     *
     * Input: n = 4
     * Output: 3
     * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
     *
     * */

    /**
     * 解法1：直接递归
     * 时间复杂度为O(n^2)
     * */
    public int solution_fib_1(int n) {
        if (n <= 1) {
            return 1;
        }

        return solution_fib_1(n - 1) + solution_fib_1(n - 2);
    }

    /**
     * 解法2：带记忆的递归
     * 时间复杂度为O(n),减少了重复计算
     * */
    public int solution_fib_2(int n) {
        return solution_fib_2(n, new HashMap<Integer, Integer>(16));
    }

    public int solution_fib_2(int n, Map<Integer, Integer> map) {
        if (n <= 1) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int res = solution_fib_2(n - 1, map) + solution_fib_2(n - 2, map);
        return res;
    }

    /**
     * 解法3：滚动数组方法
     * */
    public int solution_fib_3(int n) {
        int first = 0;
        int second = 1;
        while (n-- > 0) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return first;
    }
}
