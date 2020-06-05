package com.haiyang.www.GoF.VistorPattern;

/**
 * 具体节点(ConcreteNode)角色：实现了抽象节点所规定的接受操作。
 * */
public class NodeB extends Node {
    @Override
    public void accept(Vistor vistor) {

        vistor.visit(this);

    }

    /**
     * NodeB特有方法
     * */
    public String operationB() {
        return "BBBB";
    }
}
