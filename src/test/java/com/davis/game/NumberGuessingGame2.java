package com.davis.game;

import java.util.Scanner;

public class NumberGuessingGame2 {
    public static void main(String[] args) {
        System.out.println("This is my number guessing game with a loop!");

        int randomNumber = (int) ((Math.random() * (100 - 1)) + 1);
        int chooseNumber;
        int i;
        int numberOfTries = 5;

        System.out.println("Choose a number between 1 to 100. You have five guesses.");

        Scanner userInput = new Scanner(System.in);



        for (i = 0; i < numberOfTries; i++) {

            System.out.println("Guess a number");
            chooseNumber = userInput.nextInt();
            if (randomNumber == chooseNumber) {
                System.out.println("Congratulations!" + " You guessed the number!");
                break;
            } else if (randomNumber > chooseNumber
                        && i != numberOfTries - 1) {
                System.out.println("You guessed too low");
            } else if (randomNumber < chooseNumber
                        && i != numberOfTries - 1) {
                System.out.println("You guessed too high");
            }
        }
            if (i == numberOfTries) {
                System.out.println("You have exhausted your five guesses");
            }
    }}