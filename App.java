package com.springcore;

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
    ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/config.xml");
    student student1 =(student) context.getBean("student1");
    student student2 =(student) context.getBean("student1");
    student student3 =(student) context.getBean("student1");
    student student4 =(student) context.getBean("student1");
    System.out.println(student1.hashCode());
    System.out.println(student2.hashCode());
    System.out.println(student3.hashCode());
    System.out.println(student4.hashCode());
    }
}
