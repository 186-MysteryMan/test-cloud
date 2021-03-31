package com.szj.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shenggongjie
 * @date 2021/3/30 22:59
 */
public class Demo01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("小明",1));
        list.add(new Student("小明",1));
        List<Student> collect = list.stream().distinct().collect(Collectors.toList());
        for (Student student : collect) {
            System.out.println(student);
        }
    }
}
