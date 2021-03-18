package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description TODO
 * @Author jia_h
 * @Date 2021/3/18 10:34
 * @Version 1.0
 */
public class CollectorDemo {

    public static void main(String[] args) {

    }

    /**
     * 数组转成List
     * */
    public List<Object> arrayToList() {
        Object[] array = new String[] {"a", "b", "c"};
        List<Object> list = Stream.of(array).collect(Collectors.toList());
        return list;
    }

    /**
     * List转换成数组
     * */
    public Object[] listToArray(List<Object> list) {
        Object[] array = list.stream().toArray(String[] ::new);
        return array;
    }

    /**
     * Arrays.toArray方法
     * */
    public Object[] listToArray2(List<Object> list) {
        Object[] array = list.toArray(new Object[list.size()]);
        return array;
    }
}
