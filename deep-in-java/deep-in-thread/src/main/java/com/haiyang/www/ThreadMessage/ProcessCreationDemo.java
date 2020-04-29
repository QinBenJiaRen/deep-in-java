package com.haiyang.www.ThreadMessage;

import java.io.IOException;

/**
 * 创建进程
 * */
public class ProcessCreationDemo {

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("calc");
        //process.destroy();
    }
}
