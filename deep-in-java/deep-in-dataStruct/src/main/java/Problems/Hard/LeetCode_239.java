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
     */

    public static void main(String[] args) {

        int[] res = maxSlidingWindow_2(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

    }

    /**
     * 暴力求解
     * 可以解决，但是会超时
     */
    private static int[] maxSlidingWindow_1(int[] nums, int k) {

        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
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

    private static int[] maxSlidingWindow_3(int[] nums, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
            }
        });
        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        ans[0] = pq.peek()[0];
        for (int j = k; j < nums.length; j++) {
            pq.offer(new int[]{nums[j], j});
            while (pq.peek()[1] <= j - k) {
                pq.poll();
            }
            ans[j - k + 1] = pq.peek()[0];
        }
        return ans;
    }

    /**
     * 优先队列
     * link: https://leetcode-cn.com/problems/sliding-window-maximum/solution/hua-dong-chuang-kou-zui-da-zhi-by-leetco-ki6m/
     * [1  3  -1] -3  5  3  6  7       3
     *  1 [3  -1  -3] 5  3  6  7       3
     *  1  3 [-1  -3  5] 3  6  7       5
     *  1  3  -1 [-3  5  3] 6  7       5
     *  1  3  -1  -3 [5  3  6] 7       6
     *  1  3  -1  -3  5 [3  6  7]      7
     *
     */
    public static int[] maxSlidingWindow_2(int[] nums, int k) {
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
