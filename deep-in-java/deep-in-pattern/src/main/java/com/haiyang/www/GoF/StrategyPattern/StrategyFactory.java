package com.haiyang.www.GoF.StrategyPattern;

/**
 * 策略工厂类-->负责产生新创建的策略类
 * */
public class StrategyFactory {

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }

        if ("A".equals(type)) {
            return new ConcreteStrategyA();
        }else if ("B".equals(type)) {
            return new ConcreteStrategyB();
        }
        return null;
    }
}
