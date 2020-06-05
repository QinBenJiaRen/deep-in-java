package com.haiyang.www.GoF.VistorPattern;

public class Client {

    public static void main(String[] args) {
        //创建一个结构对象
        ObjectStructure structure = new ObjectStructure();
        //增加一个节点
        structure.add(new NodeA());
        structure.add(new NodeB());
        //创建一个访问者
        Vistor vistor = new VistorA();
        structure.action(vistor);
    }
}
