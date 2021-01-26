package Problems.Easy;

import java.awt.font.NumericShaper;
import java.util.Arrays;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/26 9:29
 * @Version 1.0
 */
public class LeetCode_88 {

    /**
     * url:https://leetcode-cn.com/problems/merge-sorted-array/
     */
    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] res = new int[m + n];
        for (int i = 0; i < m; i++) {
            res[i] = nums1[i];
        }
        for (int i = m; i < m + n; i++) {
            res[i] = nums2[i - m];
        }
        Arrays.sort(res);
    }

    public static void merge_1(int[] nums1, int m, int[] nums2, int n) {
        //两个指针
        int p1 = 0;
        int p2 = 0;
        // 当前
        int cur;
        int[] sorted = new int[m + n];
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = sorted[i];
        }
    }
}
