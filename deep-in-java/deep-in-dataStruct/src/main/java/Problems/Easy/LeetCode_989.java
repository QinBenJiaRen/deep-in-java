package Problems.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/1/22 9:25
 * @Version 1.0
 */
public class LeetCode_989 {

    /**
     * url:https://leetcode-cn.com/problems/add-to-array-form-of-integer/
     * */
    public static void main(String[] args) {
        int[] A = {1,2,3};
        addToArrayForm(A, 819);

    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<>();
        int n = A.length - 1;
        for (int i = n; i >= 0; i--) {
            // K % 10 对K进行降阶
            int a = A[i] + K % 10;
            K /= 10;
            if (a >= 10) {
                K++;
                a -= 10;
            }
            res.add(a);
        }
        for (; K > 0; K /= 10) {
            res.add(K % 10);
        }
        Collections.reverse(res);
        return res;
    }
}
