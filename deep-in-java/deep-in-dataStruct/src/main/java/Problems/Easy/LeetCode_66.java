package Problems.Easy;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/19 9:28
 * @Version 1.0
 */
public class LeetCode_66 {

    /**
     * url:https://leetcode-cn.com/problems/plus-one/
     * */
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}
