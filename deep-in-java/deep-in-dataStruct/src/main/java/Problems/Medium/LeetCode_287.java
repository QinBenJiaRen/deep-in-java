package Problems.Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 寻找重复数
 * @Author jia_h
 * @Date 2021/5/17 11:42
 * @Version 1.0
 */
public class LeetCode_287 {

    /**
     * url:https://leetcode-cn.com/problems/find-the-duplicate-number/
     * */
    public static void main(String[] args) {

    }

    private int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> set : map.entrySet()) {
            Integer value = set.getValue();
            if (value > 1) {
                return set.getKey();
            }
        }
        return 0;
    }


}
