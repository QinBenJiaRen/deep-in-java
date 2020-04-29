package com.haiyang.www.jvm;

public class PreMainDemo {

    public static void premain(String args) {
        System.out.println("这是preMain方法");
    }

    public static void main(String[] args) {
        System.out.println("这是main方法");
    }
}
