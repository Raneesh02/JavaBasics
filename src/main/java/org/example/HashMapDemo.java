package org.example;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<Integer,String>();

        hashMap.put(1,"Apple");
        hashMap.put(2,"Orange");
        hashMap.put(3,"Grapes");
        hashMap.put(4,"Banana");

        System.out.println("Get Method: "+hashMap.get(3));

        hashMap.put(3,"newValue");
        System.out.println("Get Method after Change: "+hashMap);

        System.out.println("Contains key: "+hashMap.containsKey(3));

        System.out.println("Size: "+hashMap.size());

        System.out.println("All Keys: "+hashMap.keySet());

    }
}
