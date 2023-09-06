package com.lsharma11.springbootlearning;

import com.lsharma11.springbootlearning.components.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLearningApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootLearningApplication.class, args);

        Alien alien = context.getBean(Alien.class);

        alien.code();
    }

}
