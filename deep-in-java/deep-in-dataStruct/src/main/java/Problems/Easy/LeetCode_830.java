package Problems.Easy;

import java.util.*;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/5 9:34
 * @Version 1.0
 */
public class LeetCode_830 {

    /**
     * In a string s of lowercase letters, these letters form consecutive groups of the same character.
     * <p>
     * For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".
     * <p>
     * A group is identified by an interval [start, end], where start and end denote the start and
     * end indices (inclusive) of the group. In the above example, "xxxx" has the interval [3,6].
     * <p>
     * A group is considered large if it has 3 or more characters.
     * <p>
     * Return the intervals of every large group sorted in increasing order by start index.
     * <p>
     *  
     * <p>
     * Example 1:
     * <p>
     * Input: s = "abbxxxxzzy"
     * Output: [[3,6]]
     * Explanation: "xxxx" is the only large group with start index 3 and end index 6.
     * Example 2:
     * <p>
     * Input: s = "abc"
     * Output: []
     * Explanation: We have groups "a", "b", and "c", none of which are large groups.
     * Example 3:
     * <p>
     * Input: s = "abcdddeeeeaabbbcd"
     * Output: [[3,5],[6,9],[12,14]]
     * Explanation: The large groups are "ddd", "eeee", and "bbb".
     * Example 4:
     * <p>
     * Input: s = "aba"
     * Output: []
     * <p>
     * 链接：https://leetcode-cn.com/problems/positions-of-large-groups
     */

    public static void main(String[] args) {

        String s = "abbxxxxzzy";

        largeGroupPositions(s);
    }

    public static List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (s.length() < 3) {
            return null;
        }

        int startIndex = 0;
        int length = s.length();
        while (startIndex < length) {
            int count = 0;
            while (startIndex + count < length && s.charAt(startIndex) == s.charAt(startIndex + count)) {
                count++;
            }

            if (count >= 3) {
                result.add(Arrays.asList(startIndex, startIndex + count - 1));
            }
            startIndex = startIndex + count;
        }

        return result;
    }


}
