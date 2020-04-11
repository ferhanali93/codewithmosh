package com.codewithmosh;

public class Math {
    public static void main(String[] args) {
        /* Math class in java
        1. round method
        2. ceiling
        3. Floor
        4. Max
        5. Min
         */

        // 1. round method: --> Math.round
        int result = java.lang.Math.round(1.1F);
        System.out.println(result);

        // 2. Ceil/ceiling
        int ceil = (int)java.lang.Math.ceil(1.1F);
        System.out.println(ceil);

        // 3. Floor
        int floor = (int)java.lang.Math.floor(1.1F);
        System.out.println(floor);

        // 4. Max
        int max = (int) java.lang.Math.max(1,2);
        System.out.println(max);

        // 5. Min
        int min = (int) java.lang.Math.min(5,10);
        System.out.println(min);

        // 6. Random
        double random = java.lang.Math.random() * 100;
        System.out.println(random); // Here it will give you random number between 0 and 100 in decimal.

         double random1 = java.lang.Math.round(java.lang.Math.random() * 100); // Here with used round method so it will give you random number between 0 and 100 but in round form.
        System.out.println(random1); // random used double numbers. wil give u random number between 0 and 100.
    }
}
