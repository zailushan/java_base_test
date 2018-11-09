package com.wn.service.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-11-09 14:49
 *
 *
 * 说明：hashSet内部是通过一个hashMap容器来维护数据的。
 *
 *
 * 问题：
 * 1.如何存取元素的？
 *(1)存：原理同hashMap一样。
 *(2)取：原理同hashMap一样。 疑惑点：通过iterator的nextNode方法是遍历时，没发现遍历链表或红黑树(个人认为应该是要遍历链表或红黑树的)。
 *
 *2.性能问题：
 * 同hashMap的一样。
 *
 *
 */
public class StudyHashSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        Iterator<String> iterable = set.iterator();

        while (iterable.hasNext()) {
            String ele = iterable.next();
            System.out.println(ele);
        }




    }

}
