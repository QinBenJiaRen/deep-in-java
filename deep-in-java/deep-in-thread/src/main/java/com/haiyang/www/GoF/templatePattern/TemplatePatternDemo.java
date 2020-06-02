package com.haiyang.www.GoF.templatePattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("haiyang", 30, 89L));
        list.add(new Student("tianyang", 23, 78L));
        list.add(new Student("minghui", 12, 83L));

        Collections.sort(list, new NameCompator());
        printf(list);
        Collections.sort(list, new AgeCompator());
        printf(list);

    }

    public static void printf(List<Student> list) {
        for (Student s: list) {
            System.out.println(s.toString());
        }
    }

    public static class NameCompator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class AgeCompator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }
}
