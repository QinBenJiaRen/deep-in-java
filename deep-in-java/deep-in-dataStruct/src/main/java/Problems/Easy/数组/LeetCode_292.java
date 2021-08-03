package Problems.Easy.数组;

/**
 * @Description Nim游戏 https://leetcode-cn.com/problems/nim-game/
 * @Author jia_h
 * @Date 2021/8/3 11:15
 * @Version 1.0
 */
public class LeetCode_292 {

    public boolean canWinNim(int n) {
        return !(n % 4 == 0);
    }
}
