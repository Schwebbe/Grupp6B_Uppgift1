package com.yajava.grupp6b;

public class PrintBoard {

	/*
	 * PrintBoard class that prints out the playing field.
	 * 
	 * @author Sebastian Selin
	 * 
	 * */

	// TODO: Print choices
	
	public static void printBoard(GameBoard gb) {
		
		gb.getPoint(0, 0);

		char[][] gameGrid = {
				{' ', ' ' , ' ',},
				{' ', ' ',  ' '},
				{' ',  ' ',  ' '},
		};
		System.out.println("\tA\t\tB\t\tC");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(gb.getPoint(i, j) == 1) {
					gameGrid[i][j] = 'X';
				} else if (gb.getPoint(i, j) == 2) {
					gameGrid[i][j] = 'O';
				}
			}
		}
		
		printGrids(gameGrid);

		
	}
	
	public static void printGrids(char [][] gameGrid) {
		for (int i = 0; i < 48; i++) {
			System.out.print('_');
		}
		System.out.println("");
		for(char[] row : gameGrid) {
			int count = 0;
			for( char c : row) {
				
				System.out.print("|"+"\t" +c + "\t");
				if(count++ == row.length - 1) {
					System.out.print('|');
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 48; i++) {
			System.out.print("-");
		}
	}
}
