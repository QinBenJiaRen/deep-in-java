package Problems.Easy.数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 和为K的子数组 https://leetcode-cn.com/problems/subarray-sum-equals-k/
 * @Author jia_h
 * @Date 2021/8/11 14:45
 * @Version 1.0
 */
public class LeetCode_560 {

    /**
     * 前缀和+哈希表
     * 定义pre[i]为[0...i]里所有数的和，则pre[i]可以由pre[i - 1]递推而来,即pre[i] = pre[i - 1] + nums[i]
     * 对于[j...i] 这个子数组和为 k, 可以转为 pre[i] - pre[j - 1] = k, 简单移项： pre[j - 1] = pre[i] - k
     *
     * */
    public int subarraySum(int[] nums, int k) {
        // map记录前几个数字之和为K出现相同和的次数为V
        Map<Integer, Integer> map = new HashMap<>();
        int pre = 0, count = 0;
        // 初始化，第一次出现pre = k 的情况
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (map.containsKey(pre - k)) {
                count += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
