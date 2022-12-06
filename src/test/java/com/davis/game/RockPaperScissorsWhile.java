package com.davis.game;

import java.util.Scanner;

public class RockPaperScissorsWhile {
    public static void main(String[] args) {

        //Declare variables

        String opponentsMove = "";
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";

        //Introduce Game
        System.out.println("Welcome to Rock, Papers,Scissors");


        Scanner userInput = new Scanner(System.in);
        System.out.println("Do you want to play rock,paper, scissors? Yes or No?");
        String usersTurn = userInput.nextLine();
        while (usersTurn.equals("yes")) {


            //User Input
            System.out.println("What is your move? Rock, Paper, Scissors?");
            String usersMove = userInput.nextLine();


            // Generate a random

            int randomNumber = (int) ((Math.random() * (4 - 1)) + 1);

            if (randomNumber == 1) {
                opponentsMove = "rock";
            } else if (randomNumber == 2) {
                opponentsMove = "paper";
            } else if (randomNumber == 3) {
                opponentsMove = "scissors";
            }
            System.out.println("opponent chose " + opponentsMove);

            // Check if users move is valid

            if (!usersMove.equals(rock)
                    && !usersMove.equals(scissors)
                    && !usersMove.equals(paper)) {
                System.out.println("Your move is invalid!");
            } else {
            }

            //Determine Winner

            if (usersMove.equals(opponentsMove)) {
                System.out.println("It's a tie");
            } else if (usersMove.equals(rock)
                    && opponentsMove.equals(paper)) {
                System.out.println("You lose!");
            } else if (usersMove.equals(rock)
                    && opponentsMove.equals(scissors)) {
                System.out.println("You win!");
            } else if (usersMove.equals(paper)
                    && opponentsMove.equals(rock)) {
                System.out.println("You win!");
            } else if (usersMove.equals(paper)
                    && opponentsMove.equals(scissors)) {
                System.out.println("You lose!");
            } else if (usersMove.equals(scissors)
                    && opponentsMove.equals(rock)) {
                System.out.println("You lose");
            } else if (usersMove.equals(scissors)
                    && opponentsMove.equals(paper)) {
                System.out.println("You win");
            }

            System.out.println("Do you want to play again?");
            usersTurn = userInput.nextLine();
            if(usersTurn.equals("no")){
                System.out.println("Thanks for playing!");
                break;
            }



        }
    }}
