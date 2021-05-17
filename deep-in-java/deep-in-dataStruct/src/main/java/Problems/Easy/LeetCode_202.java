package Problems.Easy;

/**
 * @Description 快乐数
 * @Author jia_h
 * @Date 2021/5/17 10:12
 * @Version 1.0
 */
public class LeetCode_202 {

    /**
     * url:https://leetcode-cn.com/problems/happy-number/
     */
    public static void main(String[] args) {

    }

    /**
     * 快慢指针法
     * */
    public boolean isHappy(int n) {
        int slow = n, fast = squareSum(n);
        // 判断是否会有环,有环则直接退出,判断slow的值
        while (slow != fast) {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }
        return slow == 1;
    }

    /**
     * 计算一个数字的每位和
     * */
    private int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            // 获取个位数
            int digit = n % 10;
            sum += digit * digit;
            // 去除个位数
            n /= 10;
        }
        return sum;
    }

}
