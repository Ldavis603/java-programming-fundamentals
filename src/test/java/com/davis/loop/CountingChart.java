package com.davis.loop;

import java.util.Scanner;

public class CountingChart {
    public static void main(String[] args) {

        int numberOfTries =11;

        System.out.println("This program will print numbers 1 to 10 and their corresponding word name");

        for (int i = 1; i < numberOfTries; i++) {
            System.out.println();
            if(i==1) {
                System.out.println("1 = One");
            } else if (i==2) {
                System.out.println("2 = Two");
            } else if (i==3) {
                System.out.println("3 = Three");
            } else if (i==4) {
                System.out.println("4 = Four");
            } else if (i==5) {
                System.out.println("5 = Five");
            } else if (i==6) {
                System.out.println("6 =,Six");
            } else if (i==7) {
                System.out.println("7 = Seven");
            } else if (i==8) {
                System.out.println("8 = Eight");
            } else if (i==9) {
                System.out.println("9 = Nine");
            } else if (i==10) {
                System.out.println("10 = Ten");
            }

    }
}}
