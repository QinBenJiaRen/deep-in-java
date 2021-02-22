package Problems.Easy;

/**
 * @Description 托普利茨矩阵
 * @Author jia_h
 * @Date 2021/2/22 9:28
 * @Version 1.0
 */
public class LeetCode_766 {

    /**
     * url:https://leetcode-cn.com/problems/toeplitz-matrix/
     * */
    public static void main(String[] args) {

    }

    public boolean isToeplitzMatrix(int[][] matrix) {

        int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;

    }
}
