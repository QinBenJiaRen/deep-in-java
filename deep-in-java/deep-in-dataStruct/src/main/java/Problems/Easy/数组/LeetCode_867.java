package Problems.Easy.数组;

/**
 * @Description 转置矩阵
 * @Author jia_h
 * @Date 2021/2/22 9:40
 * @Version 1.0
 */
public class LeetCode_867 {

    /**
     * url:https://leetcode-cn.com/problems/transpose-matrix/
     * */
    public static void main(String[] args) {

    }

    /**
     * i*j的矩阵，转置后得到的矩阵为j*i,有res[j][i] = A[i][j]
     * */
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] res = new int[n][m];
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
