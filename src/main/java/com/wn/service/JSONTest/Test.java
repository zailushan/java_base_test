package com.wn.service.JSONTest;

import com.alibaba.fastjson.JSON;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-11-28 21:32
 */
public class Test {

    public static void main(String[] args) {

        A a = new A();
        a.setAge(11);
        a.setId(123456L);
        a.setMonay(114D);

        String jsonA = JSON.toJSONString(a);
        B b = JSON.parseObject(jsonA, B.class);

        System.out.println(b.getAge() + " " + b.getId() + " " + b.getName());
        System.out.println("test ");
    }

}
