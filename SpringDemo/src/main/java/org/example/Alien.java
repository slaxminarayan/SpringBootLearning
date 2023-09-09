package org.example;

public class Alien {
    private int age;
    private Laptop laptop;

    public Alien() {
        System.out.println("Default Constructor Called...");
        System.out.println("Alien object is being created...");
    }

    public Alien(int age, Laptop laptop) {
        System.out.println("Parameterised Constructor Called...");
        System.out.println("Alien object is being created...");
        this.age = age;
        this.laptop = laptop;
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
        laptop.compile();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
