package com.davis.loop;

public class Clock {
    public static void main(String[] args) {
        int numberOfTries = 13;

        System.out.println("This program will display a clock");

        for (int i = 1; i < numberOfTries; i++) {
            System.out.println();
            if(i==1) {
                System.out.println("1 O'Clock");
            } else if (i==2) {
                System.out.println("2 O'Clock");
            } else if (i==3) {
                System.out.println("3 O'Clock");
            } else if (i==4) {
                System.out.println("4 O'Clock");
            } else if (i==5) {
                System.out.println("5 O'Clock");
            } else if (i==6) {
                System.out.println("6 O'Clock");
            } else if (i==7) {
                System.out.println("7 O'Clock");
            } else if (i==8) {
                System.out.println("8 O'Clock");
            } else if (i==9) {
                System.out.println("9 O'Clock");
            } else if (i==10) {
                System.out.println("10 O'Clock");
            } else if (i==11) {
                System.out.println("11 O'Clock");
            } else if (i==12) {
                System.out.println("12 O'Clock");
            }
        }
    }}