package Problems.Easy.动态规划;

/**
 * @Description 买卖股票的最佳时机 https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * @Author jia_h
 * @Date 2021/8/3 14:20
 * @Version 1.0
 */
public class LeetCode_121 {

    /**
     * 双重循环，会超时
     * */
    public int maxProfit(int[] prices) {
        Integer maxProfit = Integer.MIN_VALUE;

        int len = prices.length;

        for (int i = 0; i < len; i++) {
            int a = prices[i];
            for (int j = i; j < len; j++) {
                int b = prices[j];
                maxProfit = Math.max(b - a, maxProfit);
            }
        }

        return maxProfit;
    }


}
