package Problems.Easy;

public class LeetCode_58 {

    /**
     * https://leetcode-cn.com/problems/length-of-last-word/
     * */

    public static void main(String[] args) {

    }

    public static int lengthOfLastWord(String s) {
        if (s == null) {
            return 0;
        }
        String[] strs = s.split(" ");
        if (strs.length == 0) {
            return 0;
        }
        return strs[strs.length - 1].length();
    }

    /**
     * 1. "Hello World"
     * 2. "Hello World "
     * */
    public static int lengthOfLastWord_1(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end <= 0) {
            return 0;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end -  start;
    }

}
