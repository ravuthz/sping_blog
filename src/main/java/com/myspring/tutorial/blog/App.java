package com.myspring.tutorial.blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        
        Person person = (Person) context.getBean("person");
        person.setFirstName("Ravuthz");
        
        String name = person.getFirstName();
        System.out.println("Person firstName: " + name);
        
        ((FileSystemXmlApplicationContext) context).close();
    }
}
