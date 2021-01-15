package Problems.Easy;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/15 9:44
 * @Version 1.0
 */
public class LeetCode_27 {

    /**
     * url:https://leetcode-cn.com/problems/remove-element/
     * */

    public static void main(String[] args) {

    }

    /**
     * 双指针遍历法
     * */
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
