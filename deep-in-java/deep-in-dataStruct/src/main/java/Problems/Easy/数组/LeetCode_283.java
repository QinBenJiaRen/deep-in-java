package Problems.Easy.数组;

/**
 * @Description 移动零
 * @Author jia_h
 * @Date 2021/2/27 14:22
 * @Version 1.0
 */
public class LeetCode_283 {

    /**
     * url:https://leetcode-cn.com/problems/move-zeroes/
     * */
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        moveZeros(nums);

    }

    /**
     * 双指针遍历法
     * 左指针指向当前已处理好序列的尾部，右指针指向当前未处理部分的头部
     * 右指针不断移动，每次右指针遇到非零数，则左右指针的数交换，同时左指针右移
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * */
    public static void moveZeros(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }

    }
}
