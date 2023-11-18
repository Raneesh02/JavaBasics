package org.example;

import java.util.ArrayList;

public class LoopsforListOfElements {
    public static void main(String[] args) {

        int[] arr={2,3,4,5};

        System.out.println("For loop over array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("For each over array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();

        String s="hello";

        System.out.println("For loop over string : ");
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();

        ArrayList arrayList=new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(7);

        System.out.println("For loop over arraylist : ");
        for(int j=0;j<arrayList.size();j++){
            System.out.print(arrayList.get(j)+" ");
        }
        System.out.println();


    }
}
