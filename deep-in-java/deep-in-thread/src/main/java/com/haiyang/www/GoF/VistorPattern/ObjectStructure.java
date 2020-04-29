package com.haiyang.www.GoF.VistorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象(ObjectStructure)角色：有如下的责任，可以遍历结构中的所有元素；如果需要，提供一个高层次的接口让访问者对象可以访问每一个元素；如果需要，可以设计成一个复合对象或者一个聚集，如List或Set。
 * */
public class ObjectStructure {

    //结构对象角色类，这个结构对象角色持有一个聚集，并向外界提供add()方法作为对聚集的管理操作。通过调用这个方法，可以动态地增加一个新的节点。
    private List<Node> nodes = new ArrayList<>();

    public void action(Vistor vistor) {
        for (Node node: nodes) {
            node.accept(vistor);
        }
    }

    public void add(Node node) {
        nodes.add(node);
    }
}
