package org.example;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<Integer>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        System.out.println(arrayList);

        System.out.println(arrayList.get(2));

        arrayList.set(1,5);
        System.out.println("Array List after set: "+arrayList);

        arrayList.remove(3);
        System.out.println("Arraylist after remove: "+arrayList);

        System.out.println("ArrayList size: "+arrayList.size());


    }
}
