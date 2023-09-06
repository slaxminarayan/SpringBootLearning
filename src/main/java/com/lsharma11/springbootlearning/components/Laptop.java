package com.lsharma11.springbootlearning.components;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void compile() {
        System.out.println("Im Compiling...");
    }
}
