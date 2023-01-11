package com.guava.BloomFilter;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;


/**
 * @author jia
 * @Description 布隆过滤器
 * @Date 2023/1/11 10:07
 */
public class BloomFilterDemo {

    /**
     * 309/(1000000 + 10000) * 100 ≈ 0.030594059405940593 误判率
     * */
    public static void main(String[] args) {
        int total = 1000000;
        // 设置误判率 fpp = 0.0002
        BloomFilter<CharSequence> bf = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8), total, 0.0002);
        // 初始化 1000000 条数据到过滤器中
        for (int i = 0; i < total; i++) {
            bf.put("" + i);
        }
        // 判断值是否存在过滤器中
        int count = 0;
        for (int i = 0; i < total + 10000; i++) {
            if (bf.mightContain("" + i)) {
                count++;
            }
        }
        System.out.println("已匹配数量 " + count);
    }
}
