package com.codewithmosh;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        // Arrays and sorting of an Array
        int[] numbers = {2, 3, 5, 1, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //Matrix
        int[][] integers = {{1,2,3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(integers));

        //Constant
        final float PI = 3.14F;
        System.out.println(PI);
        /*
        In java, we use 'final' this way the java knows that its a constant value meaning it wont changed.
        We use capital letter to name the variable.
        In our case we used 'PI' instead of 'pi' to represent the constant
         */
    }
}
