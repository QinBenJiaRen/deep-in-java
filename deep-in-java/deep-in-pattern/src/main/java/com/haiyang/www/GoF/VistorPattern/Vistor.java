package com.haiyang.www.GoF.VistorPattern;

/**
 * 抽象访问者角色：声明了一个或者多个方法操作，形成所有的具体访问者角色必须实现的接口。
 * */
public interface Vistor {

    public void visit(NodeA a);

    public void visit(NodeB b);
}
