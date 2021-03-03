import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description list转Map
 * @Author jia_h
 * @Date 2021/3/2 11:35
 * @Version 1.0
 */
public class ListToMap {

    public static void main(String[] args) {

    }

    /**
     * 常见方式
     * */
    public static Map<Integer, String> listToMap(List<Account> list) {
        Map<Integer, String> res = list.stream().collect(Collectors.toMap(Account::getId, Account::getName));
        return res;
    }

    /**
     * 重复Key
     * 可能会报java.lang.IllegalStateException: Duplicate key异常
     * */
    public static Map<String, Account> getNameAccountMap(List<Account> list) {
        return list.stream().collect(Collectors.toMap(Account::getName, Function.identity()));
    }

    /**
     * name有可能重复，toMap的重载方法，传入一个合并函数来解决key冲突的问题
     * */
    public static Map<String, Account> getNameAccountMap2(List<Account> list) {
        return list.stream().collect(Collectors.toMap(Account::getName, Function.identity(), (key1, key2) -> key2));
    }

    /**
     * 收集实体本身Map
     * */
    public Map<Integer, Account> getIdAccountMap(List<Account> list) {
        return list.stream().collect(Collectors.toMap(Account::getId, account -> account));
    }

    /**
     * 指定具体收集结果的Map类型
     * */
    public Map<String, Account> getNameAccountMap3(List<Account> list) {
        return list.stream().collect(Collectors.toMap(Account::getName, Function.identity(), (k1, k2) -> k2, LinkedHashMap::new));
    }


    public class Account {
        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
