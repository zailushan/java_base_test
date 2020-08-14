package com.wn.service.study_jvm;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-11-24 11:36
 */
public class ShowSpaceDemo {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("max_memory:" + (runtime.maxMemory()/1024/1024));  //最大可用内存
        System.out.println("total_memory:" + (runtime.totalMemory()/1024/1024)); //默认的可用内存


    }
}
