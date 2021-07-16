package Problems.Medium.字符串;

import java.util.*;

/**
 * @Description 无重复字符的最长子串
 * @Author jia_h
 * @Date 2021/4/28 17:18
 * @Version 1.0
 */
public class LeetCode_3 {

    public static void main(String[] args) {

        String s = "abcabcaa";
        int rs = lengthOfLongestSubstring(s);
        System.out.println(rs);

    }

    /**
     *
     * */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        int n = s.length();
        /**
         *  使用LinkedList可以更加直观看出滑动过程, 但是效率不高;
         *  使用Set,滑动过程不直观，元素出入顺序会乱，但是效率比较高
         * */
        List<Character> list = new LinkedList<>();
        // left 右指针开始移动位置-1，相当于还没有开始移动
        int left = -1, res = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                System.out.println(list.toString());
                // 左指针向右移动，删除第一个字符
                list.remove(0);
            }
            while (left + 1 < n && !list.contains(s.charAt(left + 1))) {
                // 不断的移动右指针
                list.add(s.charAt(left + 1));
                ++left;
            }
            // 第 i 个到 left 字符的是一个无重复的字符串
            res = Math.max(res, left - i + 1);
        }
        return res;
    }


}
