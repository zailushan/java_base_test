package com.wn.service.study_jvm;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-11-22 21:55
 */
public class TestClassLoaderDemo {

    public static void main(String[] args) {
        String str = "";
        System.out.println(str.getClass().getClassLoader()); //bootstrap加载器

        Member member = new Member();
        System.out.println(member.getClass().getClassLoader()); //AppClassLoader

        System.out.println(member.getClass().getClassLoader().getParent()); //ExtClassLoader

        System.out.println(member.getClass().getClassLoader().getParent().getParent()); //bootstrap加载器

    }

}


class Member{}