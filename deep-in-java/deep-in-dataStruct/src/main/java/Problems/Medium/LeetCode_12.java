package Problems.Medium;

/**
 * @Description 整数转罗马数字 (https://leetcode-cn.com/problems/integer-to-roman/)
 * @Author jia_h
 * @Date 2021/7/12 17:59
 * @Version 1.0
 */
public class LeetCode_12 {

    public static void main(String[] args) {
        int num = 3;
        String res = intToRoman(num);
        System.out.println(res);
    }

    public static String intToRoman(int num) {
        int[] nums = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            String symbol = symbols[i];
            while (num >= val) {
                num -= val;
                builder.append(symbol);
            }
            if (num == 0) {
                break;
            }
        }
        return builder.toString();
    }
}
