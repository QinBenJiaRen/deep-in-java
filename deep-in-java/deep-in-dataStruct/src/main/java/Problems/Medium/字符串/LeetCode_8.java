package Problems.Medium.字符串;

/**
 * @Description 字符串转换整数（atoi）https://leetcode-cn.com/problems/string-to-integer-atoi/
 * @Author jia_h
 * @Date 2021/7/6 13:54
 * @Version 1.0
 */
public class LeetCode_8 {

    public static void main(String[] args) {

        String str = "42";
        int res = myAtoi(str);
        System.out.println(res);
    }

    /**
     * 暴力求解
     * */
    public static int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        if (!Character.isDigit(str.charAt(0)) && str.charAt(0) != '-' && str.charAt(0) != '+') {
            return 0;
        }
        long res = 0L;
        // 判断是否为负数
        boolean neg = str.charAt(0) == '-';
        // 判断首位是否为数字，如果为符号，则从第1位开始；如果为数字，则从第0位开始
        int i = !Character.isDigit(str.charAt(0)) ? 1 : 0;
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            res = res * 10 + (str.charAt(i) - '0');
            // 正数
            if (!neg && res > Integer.MAX_VALUE) {
                res = Integer.MAX_VALUE;
                break;
            }
            // 负数
            if (neg && res > 1L + Integer.MAX_VALUE) {
                res = 1L + Integer.MAX_VALUE;
            }
            i++;
        }
        return neg ? (int) -res : (int) res;
    }
}
