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
     * */
    public static void main(String[] args) {

        int n = 1534236469;
        int res = reverse(n);
        System.out.println(res);
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
        return nes ? -(int) res : (int)res;
    }
}
