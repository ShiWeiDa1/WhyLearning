package com.regan.model.entity;

import java.util.Objects;

/**
 *@className: User
 *@description:
 *@author: weida.shi
 *@date: 2019/12/12 19:17
 *@version: V1.0
 **/
public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/

    public static void main(String[] args) {
        User user01 = new User();
        user01.setName("zhang");
        user01.setAge(18);

        User user02 = new User();
        user02.setName("zhang");
        user02.setAge(18);

        System.out.println(user01.equals(user02));

    }
}