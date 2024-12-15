package org.demo;

public class Alien {
    private int data;
    private Computer com;
    int age;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;

    Alien(int age, Computer com){
        this.age=age;
        this.com = com;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    Alien(){
        System.out.println("Object is created.....");
    }
    Alien(int age){
        System.out.println("Parameterized constructor... ");
      this.age=age;
    }
    Alien (int age ,String name){
        this.age = age;
        this.name=name;
    }
    public void greet(){
        System.out.println("Welcome to the spring world....");
        com.compile();
    }

//    public Test getTest() {
//        return test;
//    }

//    public void setTest(Test test) {
//        this.test = test;
//    }
//
}
