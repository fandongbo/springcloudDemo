package com.demo.common;

/**
 * @author fandongbo
 */
public class Employee {

    private Integer number;

    private String name;

    private Integer age;

    public Employee() {}

    public Employee(Integer number, String name, Integer age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
