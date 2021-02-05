package Problems.Easy;

import javax.swing.plaf.synth.SynthUI;

/**
 * @Description 反转字符串
 * @Author jia_h
 * @Date 2021/2/5 9:38
 * @Version 1.0
 */
public class LeetCode_344 {

    /**
     * url:https://leetcode-cn.com/problems/reverse-string/
     */
    public static void main(String[] args) {
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString_2(chars);
    }

    /**
     * 有额外的数组空间来保存结果
     */
    public static void reverseString(char[] chars) {
        char[] newChars = new char[chars.length];
        for (int i = chars.length; i > 0; i--) {
            newChars[chars.length - i] = chars[i - 1];
        }
        System.out.println(newChars);
    }

    /**
     * 无额外的数组空间来保存中间结果
     */
    public static void reverseString_2(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
        System.out.println(s);
    }
}
