package com.yajava.grupp6b;

import java.util.Locale;
import java.util.Scanner;

public class GameInput {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String[][] validInput = {{"A1","A2","A3"},{"B1","B2","B3"},{"C1","C2","C3"}};
    
	public static String[] whoStart() {
		String[] X = {"X","O"};
		String[] O = {"O","X"};
		
		
		System.out.println("Who should start X, O, or random?");
		
		String input = scanner.nextLine();
		
		while (!(input.toLowerCase().equals("x") || input.toLowerCase().equals("o") || input.toLowerCase().equals("random"))) {
			System.out.println("Valid input is X, O or random: ");
			input = scanner.nextLine();
		}
		
		if (input.toLowerCase().equals("x")) {
			return X;
		}
		
		if (input.toLowerCase().equals("o")) {
			return O;
		}
		
		if (input.toLowerCase().equals("random")) {
			if (Math.random() >= 0.5) {
				return O;
			}
		}
		
		return X;
	}
    
    public static int[] takeInput(String player) {
        boolean isValid = false;
        int[] move = {1,1};
        while (!isValid){
            System.out.println(player + " Make your move ");
            String input = scanner.nextLine().toUpperCase();

            for (int i = 0; i < 3; ++i){
                for( int j = 0; j < 3; ++j){
                    String current = validInput[i][j];
                    if( input.equals(current)){
                        move[0] = i;
                        move[1] = j;
                        isValid = true;
                        break;
                    }
                }
                if (isValid){
                    break;
                }
            }
        }
        return move;

    }
    public static void close(){
        scanner.close();
    }
}
