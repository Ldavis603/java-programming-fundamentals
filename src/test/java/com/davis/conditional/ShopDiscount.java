package com.davis.conditional;

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        int unit = 100;
        int amount;
        int quantity;
        double discount, totalCost;

        System.out.println("This is my discount program");
        System.out.println("If you the cost is more than 1000, you receive a 10% discount");

        Scanner userInput = new Scanner(System.in);
        System.out.println("How many units do you want to purchase");
        amount = userInput.nextInt();

        quantity = unit * amount;
        if (quantity > 1000) {
           discount = (amount*100) * 0.1;
           totalCost = quantity - discount;
            System.out.println("You owe" + " " + totalCost  + " " + "after receiving a discount of" + " " + discount );
        } else if (unit <= 100) {
            System.out.println("You owe" + " " + quantity);
        }

    }
}
