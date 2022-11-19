package com.davis.calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int numberOne = 25;
        int numberTwo = 5;
        int sum = numberOne + numberTwo;
        int product = numberOne * numberTwo;
        int average = (sum / 2);
        int difference = numberOne - numberTwo;
        int maximum = Math.max (numberOne,numberTwo);
        int minimum = Math.min (numberOne,numberTwo);

        System.out.println("This is my simple calculator");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide first number");
        numberOne = userInput.nextInt();

        System.out.println("Please provide second number");
        numberTwo = userInput.nextInt();


        System.out.println("The sum of" + " " + numberOne + " and " + numberTwo + " is " + sum );

        System.out.println("The product of" + " " + numberOne +  " and " + numberTwo + " is " + product );

        System.out.println("The average of" + " " + numberOne + " and " + numberTwo + " is " + average );

        System.out.println("The difference of" + " " + numberOne + " and " + numberTwo + " is " + difference );

        System.out.println("The maximum of" + " " + numberOne + " and " + numberTwo + " is " + maximum );

        System.out.println("The minumum of" + " " + numberOne + " and " + numberTwo + " is " + minimum );









    }
}
