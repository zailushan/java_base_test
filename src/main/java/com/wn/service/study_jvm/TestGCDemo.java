package com.wn.service.study_jvm;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-11-24 11:09
 */
public class TestGCDemo {

    public static void main(String[] args) {

        String str = null;
        for (int i=0; i<Integer.MAX_VALUE; i++) {
            str = i + str;
            str.intern();
        }


    }



}
