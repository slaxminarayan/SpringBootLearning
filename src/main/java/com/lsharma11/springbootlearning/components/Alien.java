package com.lsharma11.springbootlearning.components;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
    private Laptop laptop;
    public void code() {
        System.out.println("Im Coding...");
        laptop.compile();
    }
}
