package com.codewithmosh;

public class Casting {
    public static void main(String[] args) {
        // Implicit casting <-- Automatically
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        // What about floating numbers
        // expicit Casting
        double a = 1.1;
        double b = x + 2;
        System.out.println(b);

        // convert string into numerical
        String c = "1";
        int d = Integer.parseInt(c) + 2;
        System.out.println(d);

        // what if its a float version
        String e = "1.1";
        double f = Double.parseDouble(e) + 2;
        System.out.println(f);
    }
}
