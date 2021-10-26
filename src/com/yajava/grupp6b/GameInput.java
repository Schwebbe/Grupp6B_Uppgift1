package com.yajava.grupp6b;

import java.util.Scanner;

public class GameInput {
    private static Scanner scanner = new Scanner(System.in);
    private String validInput [][]  = {{"A1","A2","A3"},{"B1","B2","B3"},{"C1","C2","C3"}};


    public static int[] takeInput(String player) {
        boolean isValid = false;
        while (!isValid){
            System.out.println(player + " Make your move ");
            String input = scanner.nextLine();
        }
        int[] move = {1,1};
        return move;
    }
}
