package Problems.Easy.字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 罗马数字转整数
 * @Author jia_h
 * @Date 2021/4/22 9:39
 * @Version 1.0
 */
public class LeetCode_13 {

    /**
     * url:https://leetcode-cn.com/problems/roman-to-integer/
     * */
    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        if ("".equals(s) || null == s) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map.put('A', 4);
        map.put('B', 9);
        map.put('c', 40);
        map.put('d', 90);
        map.put('E', 400);
        map.put('F', 900);
        s = s.replace("IV", "A").replace("IX", "B").replace("XL", "c")
                .replace("XC", "d").replace("CD", "E").replace("CM", "F");
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += map.get(s.charAt(i));
        }
        return sum;
    }
}
