package com.wn.service.study_jvm;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-11-25 15:49
 */
public class OnStackTest {

    //public static User u;

    private static class User {
        public int id = 0;
        public String name = "";
    }

    public static void alloc(){
        User u = new User();
        u.id = 5;
        u.name = "jim";
    }

    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i ++) {
            alloc();
        }
        long e = System.currentTimeMillis();
        System.out.println(e-b);
    }



}
