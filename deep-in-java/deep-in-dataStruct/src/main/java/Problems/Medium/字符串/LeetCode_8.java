package Problems.Medium.字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 字符串转换整数（atoi）https://leetcode-cn.com/problems/string-to-integer-atoi/
 * @Author jia_h
 * @Date 2021/7/6 13:54
 * @Version 1.0
 */
public class LeetCode_8 {

    public static void main(String[] args) {


    }

    /**
     * DFA (有限状态机）
     * */
    public int myAtoi_1(String str) {
        Automaton automaton = new Automaton();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            automaton.get(str.charAt(i));
        }
        return (int) (automaton.sign * automaton.ans);
    }

    /**
     * 暴力求解
     * */
    public static int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        if (!Character.isDigit(str.charAt(0)) && str.charAt(0) != '-' && str.charAt(0) != '+') {
            return 0;
        }
        long res = 0L;
        // 判断是否为负数
        boolean neg = str.charAt(0) == '-';
        // 判断首位是否为数字，如果为符号，则从第1位开始；如果为数字，则从第0位开始
        int i = !Character.isDigit(str.charAt(0)) ? 1 : 0;
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            // 隐式类型转换
            res = res * 10 + (str.charAt(i) - '0');
            // 正数
            if (!neg && res > Integer.MAX_VALUE) {
                res = Integer.MAX_VALUE;
                break;
            }
            // 负数
            if (neg && res > 1L + Integer.MAX_VALUE) {
                res = 1L + Integer.MAX_VALUE;
            }
            i++;
        }
        return neg ? (int) -res : (int) res;
    }


    /**
     *
     * */
    class Automaton {
        public int sign = 1;
        public long ans = 0L;
        private String state = "start";
        // 自动机状态图
        /**
         *           ''          +/-         number          other
         * start     start       signed      in_number       end
         * signed    end         end         in_number       end
         * in_number end         end         in_number       end
         * end       end         end         end             end
         * */
        private Map<String, String[]> table = new HashMap<String, String[]>() {{
            put("start", new String[]{"start", "signed", "in_number", "end"});
            put("signed", new String[]{"end", "end", "in_number", "end"});
            put("in_number", new String[]{"end", "end", "in_number", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }};

        public void get(char c) {
            state = table.get(state)[get_col(c)];
            if ("in_number".equals(state)) {
                ans = ans * 10 + c - '0';
                ans = sign == 1 ? Math.min(ans, Integer.MAX_VALUE) : Math.min(ans, -(long)Integer.MIN_VALUE);
            } else if ("signed".equals(state)){
                sign = c == '+' ? 1 : -1;
            }
        }

        private int get_col(char c) {
            if (c == ' ') {
                return 0;
            } else if (c == '+' || c == '-') {
                return 1;
            } else if (Character.isDigit(c)){
                return 2;
            }
            return 3;
        }
    }

}
