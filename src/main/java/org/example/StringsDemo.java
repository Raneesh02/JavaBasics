package org.example;

public class StringsDemo {
    public static void main(String[] args) {
        String s="hello";
        //Index   01234

        System.out.println("Char At: "+s.charAt(1));

        System.out.println("Length: "+s.length());

        System.out.println("Substring: "+s.substring(0,3));

        System.out.println("Contains: "+s.contains("ll"));

        System.out.println("Equals: "+s.equals("hello"));

        System.out.println("Concat: "+s.concat("abc"));

        System.out.println("Replace: "+s.replace("l","a"));

        System.out.println("index of: "+s.indexOf("l"));

    }
}
