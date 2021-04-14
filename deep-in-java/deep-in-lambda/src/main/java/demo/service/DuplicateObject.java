package demo.service;

import java.util.*;

/**
 * @Description 去除集合中的重复元素
 * @Author jia_h
 * @Date 2021/4/14 16:45
 * @Version 1.0
 */
public class DuplicateObject {

    public static void main(String[] args) {

    }

    public List<User> removeDuplicateObject(List<User> list) {
        Set<User> set = new TreeSet<>((user1, user2) -> user1.getId().compareTo(user2.getId()));
        set.addAll(list);
        List<User> simpleUser = new ArrayList<>(set);
        return simpleUser;
    }

    public static class User{
        private Long Id;
        private String name;

        public Long getId() {
            return Id;
        }

        public void setId(Long id) {
            Id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(Id, user.Id) && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(Id, name);
        }
    }
}
