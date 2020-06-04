package Problems.Easy;

/**
 * 买卖股票的最佳时机2
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 贪心算法，每一步都是当前的最优解
 * */
public class LeetCode_122 {

    public static void main(String[] args) {
        int[] prices = new int[] {1, 2, 4, 5, 6};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null) {
            return 0;
        }

        int benfits = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i < prices.length - 1) {
                int p1 = prices[i];
                int p2 = prices[i+1];
                if (p2 <= p1) {
                    benfits += 0;
                }
                if (p2 > p1) {
                    benfits += p2 - p1;
                }
            }
        }
        return benfits;
    }
}
