package com.davis.calculator;

import java.util.Scanner;

public class DifferenceBetweenTwoNumbers {
    public static void main(String[] args) {
        int numberOne = 0;
        int numberTwo = 0;
        int difference = numberOne - numberTwo;

        System.out.println(" This is my calculator that tells the difference between two numbers");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide the first number");
                numberOne = userInput.nextInt();

        System.out.println("Please provide the second number");
                numberTwo = userInput.nextInt();

        if (numberOne > numberTwo) {
            difference =  numberOne - numberTwo;
        } else {
            difference =  numberTwo - numberOne;
        }
        System.out.println("The difference between " + numberOne + " and " + numberTwo  + " is " + difference);





    }
}
