package Problems.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate Parentheses
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 * 解决方案：递归
 * 给定的数字为n，则会产生2^n种结果，排除掉）开始的部分，
 * */
public class LeetCode_22 {

    public static void main(String[] args) {

        int n = 4;

        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {

        if (n == 0) {
            return null;
        }

        int left = n;
        int right = n;
        List<String> strList = new ArrayList<>();
        generateStr("", left, right, strList);
        return strList;
    }

    public static void generateStr(String str, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(str);
            return;
        }

        if (left > 0) {
            generateStr(str + "(", left - 1, right, result);
        }

        //关键步骤
        if (right > left) {
            generateStr(str + ")", left, right - 1, result);
        }
    }
}
