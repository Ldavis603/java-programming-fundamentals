package com.davis.calculator;

import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int difference = 0;

        System.out.println("This is my simple calculator that subtracts two numbers");
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please provide the first number");
        numberOne = userInput.nextInt();

        System.out.println("Please provide the second number");
        numberTwo = userInput.nextInt();

        difference = numberOne - numberTwo;
        System.out.print("The difference of " + numberOne + " and " + numberTwo + " is " + difference);


    }
}
