import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 过滤list中的特定元素
 * @Author jia_h
 * @Date 2021/3/3 9:22
 * @Version 1.0
 */
public class ListFilter {

    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        List<Account> subList = list.stream().filter(e -> e.getId().equals(10)).collect(Collectors.toList());

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


