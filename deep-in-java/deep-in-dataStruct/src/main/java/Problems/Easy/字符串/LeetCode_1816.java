package Problems.Easy.字符串;

/**
 * @Description https://leetcode-cn.com/problems/truncate-sentence/
 * @Author jia_h
 * @Date 2021/12/6 15:15
 * @Version 1.0
 */
public class LeetCode_1816 {

    public static void main(String[] args) {

    }

    public static String truncateSentence(String s, int k) {
        if (null == s) {
            return null;
        }
        String[] strs = s.split(" ");
        if (strs.length <= k) {
            return s;
        } else {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < k; i++) {
                builder.append(strs[i]);
                if (i != k - 1) {
                    builder.append(" ");
                }
            }
            return builder.toString();
        }
    }
}
