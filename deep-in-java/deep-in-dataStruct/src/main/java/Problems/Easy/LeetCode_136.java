package Problems.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/25 9:30
 * @Version 1.0
 */
public class LeetCode_136 {

    /**
     * url:https://leetcode-cn.com/problems/single-number/
     * */
    public static void main(String[] args) {

    }

    /**
     * 需要额外的空间
     * */
    public int singleNumber_1(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (map.get(a) == null) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count == 1) {
                res = entry.getKey();
            }
        }
        return res;
    }

    /**
     * 异或运算
     * 任何数和 0 做异或运算，结果仍然是原来的数，即 a⊕0=a。
     * 任何数和其自身做异或运算，结果是0，即 a⊕a=0。
     * 异或运算满足交换律和结合律，即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。
     *
     * */
    public int singleNumber_2(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
