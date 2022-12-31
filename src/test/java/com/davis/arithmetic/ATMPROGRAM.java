package com.davis.arithmetic;

import java.util.Scanner;

public class ATMPROGRAM {
    public static void main(String[] args) {

        //declare and initialize balance
        int balance = 1000;


        //Welcome
        System.out.println("Welcome to the Automate Teller Machine");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to make a transaction? Yes or No.");
        String usersTurn = userInput.nextLine();
        while (usersTurn.equals("yes")) {


            //Menu
            System.out.println("Menu");
            System.out.println("Press 1 to view current balance");
            System.out.println("Press 2 to withdraw funds");
            System.out.println("Press 3 to deposit funds");



            int usersChoice = userInput.nextInt();


            // User choice
            if (usersChoice == 1) {
                System.out.println("Current balance" + " " + balance);
            } else if (usersChoice == 2) {
                System.out.println("Enter withdrawal amount");
                //Withdrawal
                int withdrawAmount = userInput.nextInt();
                if (withdrawAmount <= balance) {
                    balance = balance - withdrawAmount;
                    System.out.println("Please collect your money." + " " + "New balance of" + " " + balance);
                }
            } else if (usersChoice == 3) {
                System.out.println("Enter deposit amount");
                //Deposit
                int depositAmount = userInput.nextInt();
                if (depositAmount > 0) {
                    balance = balance + depositAmount;
                    System.out.println("Funds successfully deposited." + " " + "New balance of" + " " + balance);
                }

            }

            userInput.nextLine();

            System.out.println("Do you want to make another transaction?");
            usersTurn = userInput.nextLine();

            }


        }
    }

