package com.wn.service.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-11-10 17:09
 */
public class StudyHashMap2 {

    /**
     * 目标：
     * 1.了解扩容的过程。
     * 2.初始化的容量如何选择，多大合适？
     * 3.每次扩容是扩容到原来的两倍？
     *
     * other：
     *
     */

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("k1", "v1");
        hashMap.put("k2", "v2");
        hashMap.put("k3", "v3");
        hashMap.put("k4", "v4");
        hashMap.put("k5", "v5");
        hashMap.put("k6", "v6");
        hashMap.put("k7", "v7");
        hashMap.put("k8", "v8");
        hashMap.put("k9", "v9");
        hashMap.put("k10", "v10");
        hashMap.put("k11", "v11");
        hashMap.put("k12", "v12");
        hashMap.put("k13", "v13");

        System.out.println(hashMap);



    }
}
