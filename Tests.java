package com.codewithmosh;

public class Tests {
    public static void main(String[] args) {
        int x = 10;
        x += 5;
        System.out.println(x);

        /*
        Java Strings
         */

        //exercise 1 and 2
        String greeting = "Hello";
        System.out.println(greeting.length());

        //Exercise 3
        String txt = "Hello";
        System.out.println(txt.toUpperCase());

        // Exercise 4
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName + lastName);

        // Exercise 6: Return the index (position) of the first occurrence of "e" in the following string:
        String str = "Hello Everybody";
        System.out.println(str.indexOf("e"));

        /*
        Java Math
         */

        // Exercise1: Use the correct method to find the highest value of x and y.
         int a = 5;
         int b = 10;
        System.out.println(java.lang.Math.max(5, 10));

        // Exercise2: Use the correct method to find the square root of x.
            int squareRoot = 16;
        System.out.println(java.lang.Math.sqrt(squareRoot));

        // Exercise3: Use the correct method to return a random number between 0 (inclusive), and 1 (exclusive).
        System.out.println(java.lang.Math.random());

        /*
        Java Boolean
         */
        // Exercise2: Fill in the missing parts to print the value true:
        int c = 10;
        int d = 9;
        System.out.println(c > d);

        /*
        Java If... Else
         */
        // Exercise 1: Print "Hello World" if e is greater than f.
         int e = 50;
         int f = 10;
         if(e > f){
             System.out.println("Hello World");

             // Exercise2: Print "Hello World" if x is equal to y.
             int xx = 50;
             int yy = 50;
             if(xx == yy){
                 System.out.println("Hello World");

                 // Exercise3: Print "Yes" if x is equal to y, otherwise print "No".
                 int xxx = 50;
                 int yyy = 50;
                 if(xxx == yyy){
                     System.out.println("yes");
                 } else {
                     System.out.println("No");


            // Exercise4: Print "1" if x is equal to y, print "2" if x is greater than y, otherwise print "3".
                     int x1 = 50;
                     int y1 = 50;
                     if (x1 == y1){
                         System.out.println("1");
                     } else if (x1 > y1){
                         System.out.println("2");
                     } else {
                         System.out.println("3");
                     }

                 }
             }

         }
    }
}
