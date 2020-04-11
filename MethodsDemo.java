package com.codewithmosh;
public class MethodsDemo {
    public static void main(String[] args) {
        findGrades("Ferhan Khan", 90);
        findGrades("Kevin", 85);
        findGrades("Bakhtawar", 95);
        findGrades("Shazia", 75);
        findGrades("Sarah", 88);
        findGrades("Usman", 78);
        findGrades("imran khan", 96);
    }
    public static void findGrades(String studentName, int score){
        String grade;
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Grade of " + studentName + " is: " + grade);
    }
}
