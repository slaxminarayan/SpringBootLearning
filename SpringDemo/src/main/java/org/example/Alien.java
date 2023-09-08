package org.example;

public class Alien {
    private int age;

    public Alien() {
        System.out.println("Alien object is being created...");
    }

    public int getAge() {
        System.out.println("Age is being retrieved");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age is assigned");
        this.age = age;
    }

    public void code() {
        System.out.println("Im Coding...");
    }
}
