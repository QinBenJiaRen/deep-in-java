package Problems.Easy;

import java.util.Stack;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/7 9:38
 * @Version 1.0
 */
public class LeetCode_20 {

    public static void main(String[] args) {
        String s = "([])";
        while (s.contains("[]") || s.contains("{}") || s.contains("()")) {
            s = s.replace("[]", "").replace("{}", "").replace("()", "");
        }
        System.out.println("".equals(s));
    }

    public boolean isValid(String s) {
        if ("".equals(s)) {
            return false;
        }
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if ('(' == c) {
                stack.push(')');
            } else if ('[' == c) {
                stack.push(']');
            } else if ('{' == c) {
                stack.push('}');
            }else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
