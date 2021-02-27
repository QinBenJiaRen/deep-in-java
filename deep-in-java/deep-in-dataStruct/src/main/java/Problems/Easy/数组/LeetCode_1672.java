package Problems.Easy.数组;

/**
 * @Description 最富有客户的资产总量
 * @Author jia_h
 * @Date 2021/2/27 9:17
 * @Version 1.0
 */
public class LeetCode_1672 {

    /**
     * url:https://leetcode-cn.com/problems/richest-customer-wealth/
     * */
    public static void main(String[] args) {

    }

    /**
     * 暴力求解即可
     * */
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int max = 0;
        for(int i = 0; i < n; i++) {
            int[] account = accounts[i];
            int temp = 0;
            for(int j = 0; j < account.length; j++) {
                temp += account[j];
            }
            if (temp >= max) {
                max = temp;
            }
        }
        return max;
    }
}
