package Problems.Easy.栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description 最小栈
 * @Author jia_h
 * @Date 2021/4/25 9:24
 * @Version 1.0
 */
public class LeetCode_155 {

    /**
     * url:https://leetcode-cn.com/problems/min-stack/
     * */
    public static void main(String[] args) {

    }

    public class MinStack{

        private Deque<Integer> xStack;
        private Deque<Integer> minStack;

        public MinStack() {
            xStack = new LinkedList<>();
            minStack = new LinkedList<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            xStack.push(x);
            minStack.push(Math.min(x, minStack.peek()));
        }

        public void pop() {
            xStack.pop();
            minStack.pop();
        }

        public int top() {
            return xStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }


}
