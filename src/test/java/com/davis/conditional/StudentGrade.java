package com.davis.conditional;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int score;
        int A;
        int B;
        int C;
        int D;
        int F;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your score on your English paper?");
        score = userInput.nextInt();

        if (score > 80) {
            System.out.println(" Your grade is A");
        } else if (score > 60 || score <= 80) {
            System.out.println(" Your grade is B");
        } else if (score > 50 || score <= 60) {
            System.out.println("Your grade is C");
        } else if (score > 45 || score <= 50) {
            System.out.println("Your grade is D");
        } else if (score >= 25 || score <= 45) {
            System.out.println("Your grade is E");
        } else if (score < 25) {
            System.out.println("Your grade is F");
        }
    }
}
