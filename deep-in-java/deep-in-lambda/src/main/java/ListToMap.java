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
     * */
    public static Map<String, Account> getNameAccountMap(List<Account> list) {
        return list.stream().collect(Collectors.toMap(Account::getName, Function.identity()));
    }

    /**
     * 收集实体本身Map
     * */

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
