package com.codewithmosh;

import java.sql.SQLOutput;

public class AddingMethods {
    public static void main(String[] args) {
        String studentName = "Ferhan Khan";
        int score = 90;
        String grade;
        if (score >= 90 && score <= 100){
            grade = "A";
        } else if (score >= 80 && score < 90){
            grade = "B";
        } else if (score >=70 && score < 80){
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Grade of " + studentName + " is: " + grade);

        /*
        11 lines of code for each students.
        I have 4 students so i wrote 44 line of code.
        what if you have 100 students? 100*11= 1100 lines of code.
        what does this mean than? is this useful to write the code this way?
        The Answer is "No".
        This is where Methods come into play. It saves time and we write less code
         */

        studentName = " Paterson Kevin";
        score = 88;
       if (score >= 90 && score < 100){
           grade = "A";
       } else if(score >= 80 && score< 90){
           grade = "B";
       } else if (score>= 70 && score< 80){
           grade = "C";
       } else {
           grade = "D";
       }
        System.out.println("Grade of " + studentName + " is " + grade);

       String studentName2 = "Bakhtawar";
       score = 95;
       if (score >= 90 && score<100){
           grade= "A";
       } else if (score>= 80 && score<90){
           grade = "B";
       } else if (score>= 70 && score<80){
           grade = "C";
       } else {
           grade = "D";
       }
        System.out.println("Grade of " + studentName2 + " is " + grade);

       String studentName3 = "Shazia";
        score = 66;
       if (score>= 90 && score<100){
           grade = "A";
       } else if (score>= 80 && score<90){
           grade = "B";
       } else if (score>=70 && score<80){
           grade = "C";
       } else {
           grade = "D";
       }
        System.out.println("Grade of " + studentName3 + " is " + grade);

    }
}
