package com.wn.service.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @description: 学习hashMap的原理和源码
 * @author: cwenlong
 * @date: 2018-11-07 16:26
 *
 * 问题：
 * 1.hashMap的存、取规则？
 * 根据hash方法计算出它的索引位置，取出元素时，首先根据hash确定索引位置，然后再根据equals方法遍历链表或红黑树
 *
 * 2.hashMap的扩容规则？
 * 当向容器添加元素的时候，会判断当前容器的元素个数，如果大于等于阈值---即当前数组的长度乘以加载因子的值的时候，就要自动扩容啦 ?
 *
 * 3.hashMap初始的容量大小应该如何选择？
 *
 *
 * 4.如果put重复的key时，是先删除key对应的老元素吗？
 * (1)put操作时要做的操作：
 * 1.是否要扩容
 * 2.根据key的hash值计算出在table数组中的索引位置a， 判断table中该索引位置的元素是否为空， 为空则新增
 * 不为空时则遍历该元素下的 链表或 红黑树，找到key相同的元素 如果存在key相同的元素 则将value覆盖，
 * 如果不存在key相同的元素 则新增节点，
 *
 *
 *
 * 总结：影响hashMap性能的因素：
 * (1).扩容的次数。解决办法：设置合适的容量。
 * (2).遍历元素的复杂度。解决办法：避免在索引元素下的链表或红黑树上的元素过多， 因此要有一个好的hash方法 来避免hash值发生冲突的概率
 * (3).负载因子 默认为0.75
 *
 * 有哪些常用的map类型？
 * 1.hashMap 2.Hashtable 3.treeMap 4.LinkedHashMap
 *
 * 比较：
 * hashTable和hashMap 的原理类似。 不同之处：hashTable是线程安全的。
 *
 *
 */
public class StudyHashMap {

    public static void main(String[] args) {

        //---1.hashMap:
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "key=null");


        Map<Student, String> stuHashMap = new HashMap<>();
        Student student = new Student(1, 0, "s1");
        Student student2 = new Student(1, 0, "s2");

        stuHashMap.put(student, "s1");
        stuHashMap.put(student2, "s2");

        System.out.println(stuHashMap.get(student));
        System.out.println(stuHashMap.get(student2));


        //---3.treeMap:
        /**
         * treeMap 问题：
         * 1.底层结构：
         * 2.如何存取的？
         * 3.在存的时候就按照顺序存的，还是在取出来的时候才按照顺序取的？
         */
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("1", "1");
        treeMap.put("2", "2");

        System.out.println("treeMap...");
        for (String s : treeMap.keySet()) {
            System.out.println(s);
        }




    }
}
