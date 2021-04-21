package Problems.Easy.字符串;

/**
 * @Description 实现strStr()
 * @Author jia_h
 * @Date 2021/4/21 9:26
 * @Version 1.0
 */
public class LeetCode_28 {

    /**
     * url:https://leetcode-cn.com/problems/implement-strstr/
     * */
    public static void main(String[] args) {

    }

    //暴力求解
    public int strStr(String haystack, String needle) {
        if ("".equals(needle) || null == needle) {
            return 0;
        }
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i + m <= n; i++) {
            boolean flag = true;
            for(int j = 0; j < m; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
