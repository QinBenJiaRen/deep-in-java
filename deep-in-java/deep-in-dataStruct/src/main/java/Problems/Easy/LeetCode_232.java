package Problems.Easy;

import java.util.Stack;

/**
 * @Description 用栈实现队列
 * @Author jia_h
 * @Date 2021/2/7 15:16
 * @Version 1.0
 */
public class LeetCode_232 {

    /**
     * url:https://leetcode-cn.com/problems/implement-queue-using-stacks/
     * */
    public static void main(String[] args) {

    }

    public class MyQueue{
        /** Initialize your data structure here. */
        private Stack<Integer> popStack;
        private Stack<Integer> pushStack;
        private int front;
        public MyQueue() {
            this.popStack = new Stack<>();
            this.pushStack = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            if (pushStack.isEmpty()) {
                front = x;
            }
            pushStack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (popStack.isEmpty()) {
                while (!pushStack.isEmpty()) {
                    popStack.push(pushStack.pop());
                }
            }
            return popStack.pop();

        }

        /** Get the front element. */
        public int peek() {
            if (!popStack.isEmpty()) {
                return popStack.peek();
            }
            return front;
        }

        /** Returns whether the queue is empty. */
        public boolean empth() {

            return popStack.isEmpty() && pushStack.isEmpty();
        }


    }
}
