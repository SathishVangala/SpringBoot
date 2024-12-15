package org.demo;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Another class....");
    }
    @Override
    public void compile(){
        System.out.println("Calling Laptop class..");
    }
}
