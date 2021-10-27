package com.yajava.grupp6b;

public class PrintBoard {

	/*
	 * @param PrintBoard class that prints out the playing field.
	 * 
	 * @author Sebastian Selin
	 * 
	 * */

	public static void printBoard(GameBoard gb) {

		// 2D array for the game grid.
		char[][] gameGrid = {
				{' ', ' ' , ' ',},
				{' ', ' ',  ' '},
				{' ',  ' ',  ' '},
		};
		System.out.println("\t" + 1 + "\t\t" + 2 + "\t\t" + 3);
		
		
		// This nestled for-loop will print out a 3x3 playing field.
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				// Controlling if the user's turn is X and returns 'X'
				if(gb.getPoint(i, j) == 1) {
					
					gameGrid[i][j] = 'X';
				} 
				// Controlling if the user's turn is O and returns 'O'
				else if (gb.getPoint(i, j) == 2) {
					
					gameGrid[i][j] = 'O';
				}
			}
		}
		
		printGrids(gameGrid);
	}
	
	// Method the rows for the playing field
	public static void printGrids(char [][] gameGrid) {
		System.out.print(" ");
		for (int i = 0; i < 48; i++) {
			System.out.print('-');
		}
	
		
		System.out.println("");

		char rowLetter = 'A';
		
		for(char[] row : gameGrid) {
			int count = 0;
			// Prints letters A-C
			System.out.print(rowLetter);

			// forEach loop that iterates each row 1-3
			for( char c : row) {
				
				System.out.print("|"+"\t" +c + "\t");
				if(count++ == row.length - 1) {

					// New row
					System.out.print('|' + "\n ");
					
					// for-loop printing out new line
					for (int i = 0; i < 48; i++) {
						System.out.print("-");
					}
				}
			}
			// Adds letter from A-C
			rowLetter++;
			System.out.println();
			
		}
		
		System.out.print(" ");
		System.out.println("");
	}

	// Method that prints out the game rules
	private static void gameRules() {
		System.out.println("Spelregler: \nVarje spelare fyller i en kolumn (1, 2, 3) och rad (A B C) koordinat för att spela sin tur."
				+ "\nExempel: B2 fyller i position B2."
				+ "\nLycka till!\n");
	}
	
}
