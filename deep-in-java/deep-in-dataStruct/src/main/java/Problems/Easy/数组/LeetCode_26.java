package Problems.Easy.数组;

/**
 * @Description 删除有序数组中的重复项
 * @Author jia_h
 * @Date 2021/4/16 10:21
 * @Version 1.0
 */
public class LeetCode_26 {

    /**
     * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     */
    public static void main(String[] args) {

    }

    /**
     * 双指针法
     * */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
