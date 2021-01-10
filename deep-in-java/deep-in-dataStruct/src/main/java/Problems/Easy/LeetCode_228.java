package Problems.Easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_228 {

    /**
     * https://leetcode-cn.com/problems/summary-ranges/
     * */

    public static void main(String[] args) {

        int[] nums = new int[] {0, 1, 2, 4, 5, 7};
        summaryRanges(nums);

    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        int i  = 0;
        int n = nums.length;
        while (i < n) {
            int low = i;
            i++;
            while (i < n && nums[i] - nums[i - 1] == 1) {
                i++;
            }
            int high = i - 1;
            if (low == high) {
                result.add(nums[low] + "");
                return result;
            } else {
                result.add(nums[low] + "->" + nums[high]);
                return result;
            }
        }
        return result;
    }

    public static List<String> summaryRanges_1(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int low = i;
            i++;
            while (i < n && nums[i] - nums[i - 1] == 1) {
                i++;
            }
            int high = i - 1;
            StringBuffer temp = new StringBuffer(nums[low] + "");
            if (low < high) {
                temp.append("->");
                temp.append(nums[high]);
            }
            result.add(temp.toString());
        }
        return result;
    }
}
