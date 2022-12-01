package com.davis.conditional;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        int input = 0;

    System.out.println("This is my if program");


        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide a number");
        input = userInput.nextInt();

        if (input < 0) {
            System.out.println("Number is negative");
        } else if (input > 0) {
            System.out.println("Number is positive");
        }






    }
}
