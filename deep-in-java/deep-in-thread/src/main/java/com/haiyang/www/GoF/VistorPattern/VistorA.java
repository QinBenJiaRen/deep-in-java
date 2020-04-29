package com.haiyang.www.GoF.VistorPattern;

/**
 * 具体访问者(ConcreteVisitor)角色：实现抽象访问者所声明的接口，也就是抽象访问者所声明的各个访问操作
 * */
public class VistorA implements Vistor{

    @Override
    public void visit(NodeA a) {
        System.out.println("Viste AAAA");
    }

    @Override
    public void visit(NodeB b) {
        System.out.println("Viste BBBB");
    }
}
