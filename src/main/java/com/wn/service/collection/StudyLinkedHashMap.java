package com.wn.service.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-11-12 11:41
 */
public class StudyLinkedHashMap {


    /**
     * 目标：
     * 1.LinkedHashMap既然是链表结构 有序的，那根hash有什么关系？
     *
     * (1).存是按照hashMap的原理一样存，
     * 关键在于他如何能按照存的顺序取出元素： 在于Entry节点， 他记录了前后节点
     *   static class Entry<K,V> extends HashMap.Node<K,V> {
     *         Entry<K,V> before, after;
     *         Entry(int hash, K key, V value, Node<K,V> next) {
     *             super(hash, key, value, next);
     *         }
     *     }
     *
     *
     */


    public static void main(String[] args) {

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1","1");

    }


}
