package Problems.Easy.数组;


/**
 * @Description 移除元素
 * @Author jia_h
 * @Date 2021/4/19 11:16
 * @Version 1.0
 */
public class LeetCode_27 {

    /**
     * https://leetcode-cn.com/problems/remove-element/submissions/
     */
    public int removeElements(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
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
