package com.wn.service.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 学习hashMap的原理和源码
 * @author: cwenlong
 * @date: 2018-11-07 16:26
 *
 * 问题：
 * 1.hashMap的存、取规则？ 根据hash方法计算出它的索引位置，取出元素时，首先根据hash确定索引位置，然后再根据equals方法遍历链表或红黑树
 * 2.hashMap的扩容规则？
 * 3.hashMap初始的容量大小应该如何选择？
 * 4.如果put重复的key时，是先删除key对应的老元素吗？
 */
public class StudyHashMap {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "key=null");



        Map<Student, String> stuHashMap = new HashMap<>();
        Student student = new Student(1, 0, "s1");
        Student student2 = new Student(1, 0, "s2");

        stuHashMap.put(student, "s1");
        stuHashMap.put(student2, "s2");

        System.out.println(stuHashMap.get(student));
        System.out.println(stuHashMap.get(student2));




    }
}
