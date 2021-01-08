package Problems.Hard;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/8 10:19
 * @Version 1.0
 */
public class LeetCode_239 {

    /**
     * url: https://leetcode-cn.com/problems/sliding-window-maximum/
     * */

    public static void main(String[] args) {

    }

    /**
     * 暴力求解
     * 可以解决，但是会超时
     * */
    private static int[] maxSlidingWindow_1(int[] nums, int k) {

        int[] res = new int[nums.length - k + 1];
        for (int  i = 0; i < nums.length - k + 1; i++) {
            Integer max = Integer.MIN_VALUE;
            for (int j = i; j < k; j++) {
                int number = nums[j];
                if (max < number) {
                    max = number;
                }
            }
            res[i] = max;
        }
        return res;
    }

    /**
     * 优先队列
     * */
    public int[] maxSlidingWindow_2(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] pair1, int[] pair2) {
                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
            }
        });
        for (int i = 0; i < k; ++i) {
            pq.offer(new int[]{nums[i], i});
        }
        int[] ans = new int[n - k + 1];
        ans[0] = pq.peek()[0];
        for (int i = k; i < n; ++i) {
            pq.offer(new int[]{nums[i], i});
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            ans[i - k + 1] = pq.peek()[0];
        }
        return ans;
    }
}
