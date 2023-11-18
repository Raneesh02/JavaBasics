package org.example;

public class ClassDemo {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.age=21;
        d1.name="Tiger";
        d1.sound="bark";

        System.out.println(d1.age);
        System.out.println(d1.name);

        Dog d2=new Dog();
        d2.name="Lucy";
    }
}

class Dog {
    String name;
    int age;
    String sound;

}