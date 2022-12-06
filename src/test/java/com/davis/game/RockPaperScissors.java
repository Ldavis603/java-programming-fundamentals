package com.davis.game;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        String opponentsMove = "";
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";

        //Introduce Game
        System.out.println("Welcome to Rock, Paper, Scissors");
        Scanner userInput = new Scanner(System.in);




        //Get user's move
        System.out.print("What is your move? To make a move, enter rock, paper, or scissors. : ");

        String usersMove = userInput.nextLine();


        // Generate a random

        int randomNumber = (int) ((Math.random() * (4 - 1)) + 1);

        if (randomNumber == 1) {
            opponentsMove = "rock";
        } else if (randomNumber ==2) {
            opponentsMove = "paper";
        } else if (randomNumber ==3) {
            opponentsMove = "scissors";
        }
        System.out.println("opponent chose " + opponentsMove);
        // Determine winner


        if(usersMove.equals(opponentsMove)) {
            System.out.println("It's a tie!");
        } else if (usersMove.equals(rock)
                && opponentsMove.equals(paper)) {
            System.out.println("You lose!");
        } else if (usersMove.equals(paper)
                && opponentsMove.equals(rock)) {
            System.out.println("You win!");
        } else if (usersMove.equals(scissors)
                && opponentsMove.equals(rock)) {
            System.out.println("You lose!");
        } else if (usersMove.equals(scissors)
                && opponentsMove.equals(paper)) {
            System.out.println("You win!");
        }

        //Check if user's move is valid

        if(!usersMove.equals("rock")
                && !usersMove.equals("paper")
                && !usersMove.equals("scissors")) {
            System.out.println("Your move is invalid!");
        } else {

        }










        }
    }


