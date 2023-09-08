package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

        System.out.println( "Hello World!" );


        Alien alien = (Alien) factory.getBean("alian");
        alien.code();
        System.out.println("Alien age = " + alien.getAge());

    }
}
