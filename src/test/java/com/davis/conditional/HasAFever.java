package com.davis.conditional;

import java.util.Scanner;

public class HasAFever {
    public static void main(String[] args) {
        int temperature;

        System.out.println("This is a thermometer program ");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input your temperature");
        temperature = userInput.nextInt();

        if (temperature > 100) {
            System.out.println("You have a fever");
        } else if (temperature < 100) {
            System.out.println("You don't have a fever");
        }


    }
}
