package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String occupation;
    private String gender;
    private String maritalStatus;
    private int salary;
    private int weight;

    public Person() {
        this.age = Integer.MAX_VALUE;
        this.name = "";
        this.occupation = "";
        this.gender = "";
        this.maritalStatus = "";
        this.salary = Integer.MAX_VALUE;
        this.weight = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getOccupation() {return occupation;}

    public String getGender() {return gender;}

    public String getMaritalStatus() {return maritalStatus;}

    public Integer getSalary() {return salary;}

    public Integer getWeight() {return weight;}

}
