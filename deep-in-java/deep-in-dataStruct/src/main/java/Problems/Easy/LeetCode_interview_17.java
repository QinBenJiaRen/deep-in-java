package Problems.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 主要元素
 * @Author jia_h
 * @Date 2021/2/8 10:04
 * @Version 1.0
 */
public class LeetCode_interview_17 {

    /**
     * url:https://leetcode-cn.com/problems/find-majority-element-lcci/
     */
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 3};
        int res = majorityElement(nums);
        System.out.println(res);
    }

    /**
     * 哈希表计数法
     * */
    public static int majorityElement(int[] nums) {
        if (nums == null) {
            return -1;
        }
        int length = nums.length;
        Map<Integer, Integer> result = new HashMap<>();
        for (int num : nums) {
            if (result.get(num) == null) {
                result.put(num, 1);
            } else {
                result.put(num, result.get(num) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: result.entrySet()) {
            Integer value = entry.getValue();
            if (value >= length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    /**
     * 摩尔计算法
     * */
}
