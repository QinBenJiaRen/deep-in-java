package Problems.Easy.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

/**
 * @Description 最小绝对差 @link{https://leetcode.cn/problems/minimum-absolute-difference/}
 * @Author jia_h
 * @Date 2022/7/4 12:58
 * @Version 1.0
 */
public class LeetCode_1200 {

    /**
     * 双重循环
     * */
    public List<List<Integer>> solution1(int[] arr) {
        Arrays.sort(arr);
        int best = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - 2; i++) {
            best = Math.min(best, arr[i + 1] - arr[i]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= arr.length - 2; i++) {
            List<Integer> list = new ArrayList<>();
            if (best == arr[i + 1] - arr[i]) {
                list.add(arr[i]);
                list.add(arr[i + 1]);
                res.add(list);
            }
        }
        return res;
    }

    public List<List<Integer>> solution2(int[] arr) {
        Arrays.sort(arr);
        int best = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0 ; i <= arr.length - 2; i++) {
            int a = arr[i +1] - arr[i];
            List<Integer> list = new ArrayList<>();
            if (a < best) {
                res.clear();
                best = a;
                list.add(arr[i]);
                list.add(arr[i+1]);
                res.add(list);
            } else if (a == best) {
                list.add(arr[i]);
                list.add(arr[i+1]);
                res.add(list);
            }
        }
        return res;
    }
}
