package com.codewithmosh;


import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        byte myAge = 27;
        byte herAge = myAge;
        myAge = 29; // I change the value of myAge to 29 however, when i print it it still prints 27 why? because its primitive type type but not  relational.
        System.out.println(herAge);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x =2; // I change point1 x value to 2 and its changes and print the new values. why? because its relational data type.
        System.out.println(point2);

        Point point3 = new Point(2, 6);
        Point point4 = point3;
        point3.x = 4; // I change point1 x value to 4 and its changes and print the new values. why? because its relational data type.
        System.out.println(point4);

        Date now = new Date(); // Here i am using Data from Date.Util class to print today's date.
        System.out.println("Today's Date: " + now);


       String message = "   Hello World  ";
        System.out.println(message.trim());

        /*toUpperCase --> make the string all upper Case .
        toLowercase --> Make the string all lower Case.
        replace --> it replaces one or more characters.
        trim --> it trims the string values i.e. removing extra space if any etc.
        indexOf --> Gives you string index.
        length --> it gives you the length of the string.
        startWith --> It gives you boolean values i.e. True/False if the String starts with something or not.
         EndWith --> It gives you boolean values i.e. True/False if the String end with something or not. */

        // Use special Character in your string: There are many but these are the main fours.
        // 1. using quotion around the string
        String message1 = "Hello \"Ferhan\"";  // I would like to use a special character like using double quotation around Ferhan. i.e. "Ferhan"
        System.out.println(message1); // in order to do that use \"Ferhan\"
    // it will print Hello "Ferhan". by using \

        // 2. c:\windows\...
        String mesg2 = "C:\\Windows\\...";
        System.out.println(mesg2);

        //3. new line
        String mesg3 = "Hello\nEveryone";
        System.out.println(mesg3);
// it will print Hello in line 1 and Everyone in line2

        // 4. using tab
        String mesg4 = "I\tmiss\tyou";
        System.out.println(mesg4);
        //It will create a tab_space between I and Miss and also Miss and you.
        // i.e I    miss    you

    }
}
