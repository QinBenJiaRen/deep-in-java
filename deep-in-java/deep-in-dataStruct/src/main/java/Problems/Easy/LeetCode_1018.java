package Problems.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description url:https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/
 * @Author jia_h
 * @Date 2021/1/14 9:50
 * @Version 1.0
 */
public class LeetCode_1018 {

    public static void main(String[] args) {

    }

    public static List<Boolean> prefixDivBy5(int[] A) {
        List<Boolean> ans = new ArrayList<>(A.length);
        int temp = 0;
        for (int value: A) {
            temp = (temp << 1 + value) % 5;
            ans.add(temp == 0);
        }
        return ans;
    }
}
