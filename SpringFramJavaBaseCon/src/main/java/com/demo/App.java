package com.demo;
/*
//Java bases Configuration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           n
//Here we are not deal with the XML for configuring the spring project
//we configure with JAVA, using little java bases annotations
//@Configuration: it indicates that the class can be used by the Spring IoC container as a source of bean definition
//Bean: responsible for creating objects and returning them.

@Component : Use this annotation to define a class as a Spring component.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldCConfig.class);//Need to pass the config file
        System.out.println( "Hello World!" );
       // HelloWorld obj1 = (HelloWorld) context.getBean(HelloWorld.class,"helloWorld");
        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");//giving name to bean
        obj1.setName("Sathish Vangala");
        obj1.getName();
        obj1.code();





        //Creating one more obj
        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");//giving name to bean
        obj2.setName("John wick");
        obj2.getName();

    }
}
