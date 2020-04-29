package com.haiyang.www.ThreadLocalDemo;

public class ThreadLocalDemo {

    public static void main(String[] args) {
        setValue2();

        ThreadLocal<String> myThreadLocal = new ThreadLocal<String>();

        myThreadLocal.set("my thread local");

        String value = myThreadLocal.get();

        System.out.println(value);
    }

    /**
     * 仅对当前线程可见
     * */
    public void setValue1() {
        ThreadLocal threadLocal = new ThreadLocal<String>();

        threadLocal.set("111");
    }

    /**
     * 对所有线程可见
     * */
    public static void setValue2() {
        ThreadLocal threadLocal = new ThreadLocal<String>(){
            @Override
            protected String initialValue() {
                return "this is thread local";
            }
        };

        String value = threadLocal.get().toString();

        System.out.println(value);
    }
}
