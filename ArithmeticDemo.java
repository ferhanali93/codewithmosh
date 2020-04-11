package com.codewithmosh;

public class ArithmeticDemo {
    public static void main(String[] args) {
        /* Arithmetic Operators:
        1. Addition
        2. Subtraction
        3. Multiplication
        4. Division
        5. Modulus
         */

        int additionResult = 10 +3;
        System.out.println(additionResult);

        int subtractionResult = 10 - 3;
        System.out.println(subtractionResult);

        int multiplyResult = 10 * 3;
        System.out.println(multiplyResult);

        int modulusResult = 9 % 3;
        System.out.println(modulusResult);
        // will give u zero because 3 into 9, there is no reminder

        int modulusResult2 = 10 % 3;
        System.out.println(modulusResult2);
        //This will give 1 as a result becuse 3*3= 9 so reminder is 1.

         double divisionResult = (double)10/(double)3;
        System.out.println(divisionResult);

        /* Incremental Operators ++
        pre fixed vs. post fixed.   ++x  vs x++ */
        int x = 1;
        x++;
        System.out.println(x);

        //Compound
        int y = 1;
        y += 5;
        System.out.println(y);

        /* ORDER OF OPERATORS
        1. ()
        2. * and / (multiplication and division)
        3. + and - (Addition and subtraction)
         */
        int z = 10 + 3 *2;
        System.out.println(z);
        // ^^Here^^ it will multiply 3*2 first.

        int a = (10 + 3) * 2;
        System.out.println(a);
        // ^^Here^^ it calculate everything inside the () first.


    }
}
