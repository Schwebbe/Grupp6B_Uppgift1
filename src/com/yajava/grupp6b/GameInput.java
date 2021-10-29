package com.yajava.grupp6b;

import java.util.Scanner;

/**
 * Helper class to take and validate input
 *
 * @author xiaolu malander
 * @version 1.0
 */
public class GameInput {
    private static final Scanner scanner = new Scanner(System.in);

    //arranged to match the gameBoard layout for easy conversion
    private static final String[][] validInput = {{"A1","A2","A3"},{"B1","B2","B3"},{"C1","C2","C3"}};
    
    /**
     * Taken in from the Main class because having two separate scanners caused problems.
     * This method handles the order that the players play.
     * 
     * @return
     */
	public static String[] whoStart() {
		String[] X = {"X","O"};
		String[] O = {"O","X"};


		System.out.println("Who should start X, O, or random?");

		String input = scanner.nextLine().toLowerCase();

		while (!(input.equals("x") || input.equals("o") || input.equals("random"))) {
			System.out.println("Valid input is X, O or random: ");
			input = scanner.nextLine();
		}

		if (input.equals("x")) {
			return X;
		}

		if (input.equals("o")) {
			return O;
		}

		if (input.equals("random")) {
			if (Math.random() >= 0.5) {
				return O;
			}
		}

		return X;
	}

    /**
     * Prompts the player to enter a move and validates the input against the validInput array.
     * @param player current player
     * @return int array holding valid move coordinates
     */
    public static int[] takeInput(String player) {
        boolean isValid = false;
        int[] move = {1,1};
        while (!isValid){
            System.out.println(player + " Make your move ");
            String input = scanner.nextLine().toUpperCase();

            for (int i = 0; i < 3; ++i){
                for( int j = 0; j < 3; ++j){
                    String current = validInput[i][j];
                    if( input.equals(current)|| input.equals(reverseString(current))){
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
    private static String reverseString(String toReverse){
        StringBuilder sb = new StringBuilder(toReverse);
        sb.reverse();
        return sb.toString();
    }
}
