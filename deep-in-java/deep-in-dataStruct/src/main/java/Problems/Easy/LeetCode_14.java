package Problems.Easy;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/18 9:41
 * @Version 1.0
 */
public class LeetCode_14 {

    /**
     * url:https://leetcode-cn.com/problems/longest-common-prefix/
     */

    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //不放在循环里里声明，用于字符串截取
            int j = 0;
            for (; j < res.length() && j < strs[i].length(); j++) {
                if (res.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            res = res.substring(0, j);
            if ("".equals(res)) {
                return "";
            }
        }
        return res;
    }
}
