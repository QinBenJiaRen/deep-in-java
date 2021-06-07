package Problems.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 多数元素（https://leetcode-cn.com/problems/majority-element/）
 * @Author jia_h
 * @Date 2021/6/7 9:35
 * @Version 1.0
 */
public class LeetCode_169 {

    /**
     * 暴力求解
     * */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int a : nums) {
            map.merge(a, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            Integer val = set.getValue();
            if (val > nums.length / 2) {
                return set.getKey();
            }
        }
        return 0;
    }

    /**
     * 排序
     * */
    public int majorityElement_2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
