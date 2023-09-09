package org.example;

public class Alien {
    private int age;
    private Computer computer;

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
        computer.compile();
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer laptop) {
        this.computer = laptop;
    }
}
