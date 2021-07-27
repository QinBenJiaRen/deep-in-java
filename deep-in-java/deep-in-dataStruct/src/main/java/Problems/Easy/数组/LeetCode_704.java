package Problems.Easy.数组;

/**
 * @Description 二分查找（https://leetcode-cn.com/problems/binary-search/）
 * @Author jia_h
 * @Date 2021/7/27 13:52
 * @Version 1.0
 */
public class LeetCode_704 {

    public static void main(String[] args) {
        int[] nusm = {-1,0,3,5,9,12};
        int i = search(nusm, 9);
        System.out.println(i);
    }

    public static int search(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int a = nums[mid];
            if (target == a) {
                return mid;
            }
            if (target > a) {
                left = mid + 1;
            }
            if (target < a) {
                right = mid - 1;
            }
        }
        return -1;
    }
}
