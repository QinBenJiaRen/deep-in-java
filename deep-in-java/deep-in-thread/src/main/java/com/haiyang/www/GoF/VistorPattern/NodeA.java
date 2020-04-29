package com.haiyang.www.GoF.VistorPattern;

/**
 * 具体节点(ConcreteNode)角色：实现了抽象节点所规定的接受操作。
 * */
public class NodeA extends Node {
    @Override
    public void accept(Vistor vistor) {

        vistor.visit(this);

    }

    /**
     * NodeA特有方法
     * */
    public String operationA() {
        return "AAAA";
    }
}
