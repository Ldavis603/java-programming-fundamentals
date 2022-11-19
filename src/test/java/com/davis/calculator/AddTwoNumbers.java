package com.davis.calculator;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int sum = 3;
        System.out.println("This is my simple calculator that adds to numbers");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide the first number: ");
        numberOne = userInput.nextInt();

        System.out.println("Please provide the second number: ");
        numberTwo = userInput.nextInt();

        sum = numberOne + numberTwo;
        System.out.println("The sum of " + numberOne + " and " + numberTwo + " is " + sum);
    }
}
