package org.example;

public class JavaDataTypes {
    public static void main(String[] args) {
        Boolean boolVar = false; //size: 1 bit. values : true/ false
        System.out.println("boolean value: "+boolVar);

        byte byteVar = -20; //size: 1byte . numbers between -128 to 127
        System.out.println("Byte value: "+byteVar);

        short shortVar = -5000; //size: 2 byte. numbers between -32768 to 32767
        System.out.println("Short value: "+shortVar);

        int intVar = -200000; //size: 4 byte. - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)
        System.out.println("Int value: "+intVar);

        long longVar = -300000L; //size: 8 byte. -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
        System.out.println("Long value: "+longVar);

        float floatVar = 234.5f; //size: 4 byte.  Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        System.out.println("Float Var: "+floatVar);

        double doubleVar = 234.5; //size: 8 byte. Stores fractional numbers. Sufficient for storing 15 decimal digits
        System.out.println("Double Var: "+doubleVar);



    }
}
