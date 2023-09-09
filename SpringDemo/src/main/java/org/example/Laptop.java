package org.example;

public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("Code Compiling In Laptop....");
    }
}
