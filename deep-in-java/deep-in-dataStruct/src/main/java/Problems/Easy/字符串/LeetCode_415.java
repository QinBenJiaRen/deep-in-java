package Problems.Easy.字符串;

/**
 * @Description 字符串相加 https://leetcode-cn.com/problems/add-strings/
 * @Author jia_h
 * @Date 2021/8/2 11:25
 * @Version 1.0
 */
public class LeetCode_415 {

    /**
     * 模拟数字相加过程
     * */
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;

        StringBuilder builder = new StringBuilder(16);
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int res = x + y + add;
            // 保存每次计算的数字
            builder.append(res / 10);
            // 查看是否需要进位
            add = res % 10;
            i--;
            j--;
        }
        // 字符串翻转
        builder.reverse();
        return builder.toString();

    }
}
