package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Alien alien = (Alien) factory.getBean("alian");
        alien.code();
        System.out.println( "Hello World!" );
    }
}
