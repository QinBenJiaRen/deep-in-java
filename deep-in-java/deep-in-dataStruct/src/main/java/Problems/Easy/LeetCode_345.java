package Problems.Easy;

/**
 * @Description 反转字符串中的元音字母
 * @Author jia_h
 * @Date 2021/2/7 14:52
 * @Version 1.0
 */
public class LeetCode_345 {

    /**
     * url:https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
     */
    public static void main(String[] args) {

        String s = "hello";
        String result = reverseVowels(s);
        System.out.println(result);

    }

    /**
     * 双指针遍历法
     * */
    public static String reverseVowels(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        for (int left = 0, right = n - 1; left < right; left++, right--) {
            char temp1 = s.charAt(left);
            char temp2 = s.charAt(right);
            if (('a' == temp1 || 'e' == temp1 || 'i' == temp1 || 'o' == temp1 || 'u' == temp1 || 'A' == temp1 || 'E' == temp1 || 'I' == temp1 || 'O' == temp1 || 'U' == temp1) &&
                    ('a' == temp2 || 'e' == temp2 || 'i' == temp2 || 'o' == temp2 || 'u' == temp2 || 'A' == temp2 || 'E' == temp2 || 'I' == temp2 || 'O' == temp2 || 'U' == temp2)) {
                chars[left] = temp2;
                chars[right] = temp1;
            } else if (('a' != temp1 || 'e' != temp1 || 'i' != temp1 || 'o' != temp1 || 'u' != temp1 || 'A' != temp1 || 'E' != temp1 || 'I' != temp1 || 'O' != temp1 || 'U' != temp1) &&
                    ('a' == temp2 || 'e' == temp2 || 'i' == temp2 || 'o' == temp2 || 'u' == temp2 || 'A' == temp2 || 'E' == temp2 || 'I' == temp2 || 'O' == temp2 || 'U' == temp2)) {
                right++;
            } else if (('a' == temp1 || 'e' == temp1 || 'i' == temp1 || 'o' == temp1 || 'u' == temp1 || 'A' == temp1 || 'E' == temp1 || 'I' == temp1 || 'O' == temp1 || 'U' == temp1) &&
                    ('a' != temp2 || 'e' != temp2 || 'i' != temp2 || 'o' != temp2 || 'u' != temp2 || 'A' != temp2 || 'E' != temp2 || 'I' != temp2 || 'O' != temp2 || 'U' != temp2)) {
                left--;
            }
        }
        return String.valueOf(chars);
    }
}
