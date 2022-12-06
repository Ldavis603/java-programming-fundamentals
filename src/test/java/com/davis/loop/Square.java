package com.davis.loop;

public class Square {
    public static void main(String[] args) {
        int y = 20;
        int x = 10;
        char symbol = 'X';

        for (int i = 0; i <= x; i++) {
            System.out.print(symbol);

            for (int j = 0; j <= y; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
