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

    /**
     * 每个单词的最后都跟随一个空格，因此可以通过统计空格与句子结尾的数目来统计单词个数count。当count==k时，将当前的下标记录到end。
     * 时间复杂度: O(N)
     * 空间复杂度: O(1)
     * */
    public static String truncateSentence1(String s, int k) {
        if (null == s) {
            return s;
        }
        int n = s.length();
        int end = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (end == n || s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    end = i;
                    break;
                }
            }
        }
        return s.substring(0, end);
    }
}
