package org.example;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array={1,3,4,5,6,7};

        System.out.println("Print 4th element: "+array[3]);

        array[4] = 70;

        System.out.println("Print 5th element: "+array[4]);

        int multiDimarr[][]={
                {1,2,3},
                {2,4,5},
                {4,4,5}};
        System.out.println(multiDimarr[0][1]);

    }
}
