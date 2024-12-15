package org.demo;

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
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml") ;//here object will be creating
       Alien obj2 = (Alien) context.getBean("alien");
        //System.out.println(obj2.getData());
      obj2.greet();
        System.out.println(obj2.age);
        System.out.println(obj2.name);

//        Alien obj1 = (Alien) context.getBean("alien");
//        //obj1.greet();
//       // System.out.println(obj1.data);
//        System.out.println( "Hello World!" );
    }
}
