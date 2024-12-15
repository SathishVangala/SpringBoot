package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HelloWorld {
    private  String name;
    @Autowired
    @Qualifier("redMi")
    private  Mobile com;
private void Helloworld(){
    System.out.println("Obj is created");
}
    public Mobile getCom() {
        return com;
    }

    public void setCom(Mobile com) {
        this.com = com;
    }




    public void setName(String name){
        this.name=name;
    }
    public void getName(){
        System.out.println("Your Name: "+ this.name);
    }

    public void code() {
        System.out.println("Coding");
        com.company();
    }
}
