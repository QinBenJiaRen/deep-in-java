package Problems.Easy.数组;

/**
 * @Description 种花问题
 * @Author jia_h
 * @Date 2021/2/23 9:25
 * @Version 1.0
 */
public class LeetCode_605 {

    /**
     * url:https://leetcode-cn.com/problems/can-place-flowers/
     */
    public static void main(String[] args) {

    }

    /**
     * 1）对于中间的0区间：
     *
     * 1~2个0：可种0朵；
     *
     * 3~4个：可种1朵；
     *
     * 5~6个：可种2朵；
     *
     * ...
     *
     * count个：可种 (count-1)/2 朵
     *
     * 2）对于两头的0区间，由于左边、右边分别没有1的限制，可种花朵数稍有不同。
     *
     * 为了代码流程的统一，可以在数组最左边、数组最右边分别补1个0，意味着花坛左边、右边没有花。
     * */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 0) {
            return false;
        }

        // 当前全0区段中连续0的数量，刚开始预设1个0，因为开头花坛的最左边没有花，可以认为存在一个虚无的0
        int zeroNumber = 1;
        int flowerNum = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            int a = flowerbed[i];
            if (a == 0) {
                // 遇到0，连续0的数量+1
                zeroNumber++;
            } else {
                // 遇到1，结算上一段连续的0区间，看能种下几盆花：(countOfZero-1)/2
                flowerNum += (zeroNumber - 1) / 2;
                if (flowerNum >= n) {
                    return true;
                }
                // 0的数量清零，开始统计下一个全0分区
                zeroNumber = 0;
            }
        }
        //最后一段0区还未结算：
        //最后再预设1个0，因为最后花坛的最右边没有花，可以认为存在一个虚无的0
        zeroNumber++;
        flowerNum += (zeroNumber - 1) / 2;
        return flowerNum >= n;
    }
}
