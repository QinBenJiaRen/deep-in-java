package Problems.Easy;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/21 9:25
 * @Version 1.0
 */
public class LeetCode_9 {

    /**
     * url:https://leetcode-cn.com/problems/palindrome-number/
     */
    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String str = String.valueOf(x);
        StringBuilder builer = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            Character c = str.charAt(i);
            builer.append(c);
        }
        if (str.equals(builer.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPalindrome_1(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return false;
        }
        String str = String.valueOf(x);
        StringBuilder builder = new StringBuilder(str).reverse();
        if (builder.toString().equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}
