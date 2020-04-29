package com.haiyang.www.easyAOP;

import jdk.internal.org.objectweb.asm.Opcodes;

public class MyClassVistor extends ClassVistor implements Opcodes {
    public MyClassVistor(ClassVistor cv) {
        super(ASM5, cv);
    }
    @Override
    public void visit() {

    }

    @Override
    public void visitMethod() {

    }


}
