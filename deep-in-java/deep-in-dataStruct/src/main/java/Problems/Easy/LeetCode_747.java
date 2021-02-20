package Problems.Easy;

/**
 * @Description 至少是其他数字两倍的最大数
 * @Author jia_h
 * @Date 2021/2/19 9:39
 * @Version 1.0
 */
public class LeetCode_747 {

    /**
     * url:https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/
     */
    public static void main(String[] args) {

        int[] nums = new int[]{0, 1, 0, 0};
        int res = dominantIndex(nums);
        System.out.println(res);

    }

    /**
     * 先寻找数组中最大数字，记录下索引
     * 再次遍历数组，如果i != maxIndex 并且 2 * nums[i] > nums[maxIndex], 返回-1
     * */
    public static int dominantIndex(int[] nums) {
        if (nums == null) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }

        int n = nums.length;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (maxIndex != i && nums[i] * 2 > nums[maxIndex]) {
                return -1;
            }
        }
        return maxIndex;
    }
}
