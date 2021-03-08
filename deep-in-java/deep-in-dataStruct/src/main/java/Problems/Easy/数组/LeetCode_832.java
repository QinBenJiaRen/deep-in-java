package Problems.Easy.数组;

/**
 * @Description 翻转图像
 * @Author jia_h
 * @Date 2021/2/24 9:32
 * @Version 1.0
 */
public class LeetCode_832 {

    /**
     * url:https://leetcode-cn.com/problems/flipping-an-image/
     * */
    public static void main(String[] args) {

    }

    public int[][] filpAndInvertImage(int[][] A) {

        int a = A.length;
        int b = A[0].length;
        int[][] res1 = new int[a][b];
        for (int i = 0; i < A.length; i++) {
            int[] temp = A[i];
            for (int j = temp.length; j >= 0; j--) {
                res1[i][j] = temp[j];
            }
        }
        return null;

    }
}
