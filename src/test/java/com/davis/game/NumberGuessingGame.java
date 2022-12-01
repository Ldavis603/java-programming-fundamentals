package com.davis.game;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the number guessing game");

        // Generate a random
        int randomNumber = (int) ((Math.random() * (100-1)) + 1);
        int chooseNumber;

        System.out.println("A number is chosen between 1 to 100. Guess the number within 1 trial");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        chooseNumber = userInput.nextInt();

        if (randomNumber > chooseNumber ) {
            System.out.println("Too Low");
        } else if (randomNumber < chooseNumber ) {
            System.out.println("Too High");
        } else if (randomNumber == chooseNumber) {
            System.out.println("Congratulations! You guessed the number.");
        }

    }
}
