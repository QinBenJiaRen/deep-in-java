package Problems.Easy;

/**
 * @Description 整数反转
 * @Author jia_h
 * @Date 2021/4/26 10:12
 * @Version 1.0
 */
public class LeetCode_7 {

    /**
     * url:https://leetcode-cn.com/problems/reverse-integer/
     */
    public static void main(String[] args) {

        int n = 1534236469;
        int res = reverse(n);
        System.out.println(res);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    public static int reverse(int x) {
        String str = x + "";
        int n = str.length();
        boolean nes = str.charAt(0) == '-' ? true : false;
        int start = str.charAt(0) == '-' ? 1 : 0;
        long res = 0L;
        for (int i = n - 1; i >= start; i--) {
            Character c = str.charAt(i);
            res = res * 10 + c - '0';
            if (res >= Integer.MAX_VALUE) {
                return 0;
            }
        }
        return nes ? -(int) res : (int) res;
    }

    /**
     * Integer.MAX_VALUE = 2147483647
     * Integer.MIN_VALUE = -2147483648
     * */
    public int reverse_1(int x) {
        int res = 0;
        while (x != 0) {
            int tmp = x % 10;
            if (res > 214748364 || (res == 214748364 && tmp > 7)) {
                return 0;
            }
            if (res < -214748364 || (res == -214748364 && tmp < -8)) {
                return 0;
            }
            res = res * 10 + tmp;
            x /= 10;
        }
        return res;
    }
}
