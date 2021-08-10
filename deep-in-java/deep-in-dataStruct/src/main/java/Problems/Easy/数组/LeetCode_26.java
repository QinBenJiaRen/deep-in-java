package Problems.Easy.数组;

/**
 * @Description 删除有序数组中的重复项 https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * @Author jia_h
 * @Date 2021/4/16 10:21
 * @Version 1.0
 */
public class LeetCode_26 {

    /**
     * 给定数组为有序的
     * 双指针法
     * 如果数组nums的长度为0, 则数组不包含任何元素, 返回0;
     * 定义两个指针，fast指针和slow指针，快指针表示遍历数组到达的下标位置，慢指针表示下一个不同元素要填入的下标位置，初始化时两个指针都指向下标1
     * 假设数组nums的长度为n。将快指针fast依次遍历从1到 n - 1 的每个位置，对于每个位置，如果nums[fast] != nums[fast - 1], 说明nums[fast]和之前的
     * 元素都不同，因此将nums[fast]的值复制到nums[slow],然后将slow的值加1,即指向下一个位置。
     * 遍历结束后，从nums[0]到nums[slow - 1]的每个位置都不相同且包含原数组中的每个不同的元素，因此新的长度即为slow，返回slow即可。
     * */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 1;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
