package org.example;


public class LoopsDemo {
    public static void main(String[] args) {

        System.out.println("For loop output");
        for(int i=1;i<=10;i++){ //initalization, condition, increment in one line
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("While Loop output");
        int j=1; //initialization
        while(j<=10){ //condition
            System.out.print(j+" ");
            j++;   //increment
        }
        System.out.println();

        System.out.println("Do While Loop output");
        int k=11;       //initialization
        do{
            System.out.print(k+" ");
            k++;        //increment
        }while(k<=10); //condition

        System.out.println("Nested Loop output");
        for(int l=0;l<=10;l++){
            System.out.print(l+" ");
            for(int m=0;m<=10;m++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
