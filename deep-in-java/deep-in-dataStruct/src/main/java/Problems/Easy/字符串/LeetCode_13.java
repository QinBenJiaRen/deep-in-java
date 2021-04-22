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
     */
    public static void main(String[] args) {

    }

    /**
     * 替换法
     */
    public int romanToInt(String s) {
        if ("".equals(s) || null == s) {
            return 0;
        }
        s = s.replace("IV", "A").replace("IX", "B").replace("XL", "c")
                .replace("XC", "d").replace("CD", "E").replace("CM", "F");
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += getNum(s.charAt(i));
        }
        return sum;
    }

    public int getNum(Character c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            case 'A':
                return 4;
            case 'B':
                return 9;
            case 'c':
                return 40;
            case 'd':
                return 90;
            case 'E':
                return 400;
            case 'F':
                return 900;
            default:
                return 0;
        }
    }

    /**
     * 比较法
     * 如IV=4 I=1 V=5 即前一位比后一位对应的数字小，则I=-1,V=5, 这样处理的结果不变
     * 如VI=5 I=1 V=5 即前一位比后一位对应的数字大，则I=1,V=5
     * */
    public int romanToInt_2(String s) {
        if ("".equals(s) || null == s) {
            return 0;
        }
        int sum = 0;
        int preNum = getNum(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getNum(s.charAt(i));
            if (preNum < num) {
                sum -= preNum;
            }else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }
}
