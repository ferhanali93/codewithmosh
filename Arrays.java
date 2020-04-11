package com.codewithmosh;
public class Arrays {
    public static void main(String[] args) {
        // Arrays in Java
            /* int number = 50;  int number = 20; int number = 20; int number = 15; int number = 10;
            Lets make an Arrays of integers since they all belong to one category.
            */

            // Integer Array
      int[] numbers = new int[5];
      numbers[0] = 50;
      numbers[1] = 20;
      numbers[2] = 20;
      numbers[3] = 15;
      numbers[4] = 10;
      // We have class in java called Arrays, Here we will use it.
        // Secondly we will use Arrays.toString_int since we are using integers.
            // It will print like [50, 20, 20, 15, 10]
        System.out.println(java.util.Arrays.toString(numbers));


        // String Array
        String[] strings = new String[5]; // We used String Arrays because it belongs to the same category.
        strings[0] = "Ferhan";
        strings[1] = "Usman";
        strings[2] = "Saad";
        strings[3] = "Haifa";
        strings[4] = "Chula";
        System.out.println(java.util.Arrays.toString(strings));
        // It should print [Ferhan, Usman, Saad, Haifa, Chula]


        // Char Arrays
            Character[] characters = new Character[5];
            characters[0] = 'A';
            characters[1] = 'B';
            characters[2] = 'C';
            characters[3] = 'D';
            characters[4] = 'E';
            System.out.println(java.util.Arrays.toString(characters));

    }
}
