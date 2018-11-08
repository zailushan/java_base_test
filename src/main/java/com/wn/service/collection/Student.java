package com.wn.service.collection;

import java.util.Objects;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-11-08 17:26
 */
public class Student {

    private int id;
    private int age;
    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this.id == ((Student) o).id && this.age == ((Student) o).age && this.name == ((Student) o).name) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {

        return this.id;
    }
}
