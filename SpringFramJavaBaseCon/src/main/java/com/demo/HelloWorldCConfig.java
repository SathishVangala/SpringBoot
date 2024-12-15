package com.demo;
//This is class is just like XML file
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.demo")
public class HelloWorldCConfig {
   // @Bean(name = "com")
//    @Bean
//    @Scope("prototype")
//    public HelloWorld helloWorld(){  // telling spring to inject the dependencies
//        System.out.println("hello world object is created");
//        return new HelloWorld();
//    }
//
//    //This is for AutoWiring
//    @Bean
//     public RedMi redmi(){
//        return new RedMi();
//    }
//    @Bean
//    public HelloWorld helloWorld(Mobile com) {
//        HelloWorld obj= new HelloWorld();
//       // obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//
//    }
//    public RedMi desktop() {
//        return new RedMi();
//    }
//   @Bean
//   public HelloWorld helloWorld(@Qualifier("mi") Mobile com) {
//       HelloWorld obj= new HelloWorld();
//      // obj.setAge(25);
//       obj.setCom(com);
//       return obj;
//
//   }
//
//
//
//
//
//
//
//
////	@Bean(name = {"Beast","desktop","com1"})
//    @Bean
//    //@Primary
//    public Mobile sum(){
//        return new Samsung();
//    }
//
//    @Bean
//    //@Scope("prototype")
//    public Mobile mi() {
//        return new RedMi();
//    }


}
