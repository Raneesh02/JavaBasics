package org.example;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dogs d1=new Dogs();
        d1.age=2;
        d1.name="Tigers";
        System.out.println("Dog's age"+d1.age);
        System.out.println("Dog's Name"+d1.name);
        d1.bark();
        d1.bark(false);
        d1.eat();
    }

}

class Animal{
    public String name;
    public int age;
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dogs extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }

    //Overloading concept
    public void bark(boolean isBarking){
        System.out.println("Dog is barking "+isBarking);
    }

    //Overriding concept in inheritance
    public void eat(){
        System.out.println("Dog is eating");
    }

}