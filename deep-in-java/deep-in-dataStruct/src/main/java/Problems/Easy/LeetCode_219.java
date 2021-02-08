package Problems.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 存在重复元素II
 * @Author jia_h
 * @Date 2021/2/8 11:27
 * @Version 1.0
 */
public class LeetCode_219 {

    /**
     * url:https://leetcode-cn.com/problems/contains-duplicate-ii/
     */
    public static void main(String[] args) {

    }

    /**
     * 双重循环暴力求解法 时间复杂度O(n^2)
     * */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null) {
            return false;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int a = nums[i];
            for (int j = i + 1; j < n; j++) {
                int b = nums[j];
                if (a == b) {
                    int c = i - j;
                    if (Math.abs(c) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 哈希求解 时间复杂度O(n)
     * 维护一个长度为k的哈希表，遍历数组，如果重复出现时则表示存在k距离内相同元素
     * 每次遍历将一个元素放到哈希表钟，如果超过k,则移除最前面的数字
     * */
    public boolean containsNearbyDuplicate_2(int[] nums, int k) {
        if (nums == null) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
