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
		System.out.print(" ");
		for (int i = 0; i < 48; i++) {
			System.out.print('_');
		}
	
		
		System.out.println("");
		int rowNum = 1;
		for(char[] row : gameGrid) {
			int count = 0;
		
				System.out.print(rowNum);
				
			
			for( char c : row) {
				
				System.out.print("|"+"\t" +c + "\t");
				if(count++ == row.length - 1) {
									
					System.out.print('|');
					
				}
			}
			rowNum++;
			System.out.println();
			
		}
		
		System.out.print(" ");
		for (int i = 0; i < 48; i++) {
			System.out.print("-");
		}
		System.out.println("");
		System.out.println("Spelregler: \nVarje spelare fyller i en kolumn (1, 2, 3) och rad (A B C) koordinat för att spela sin tur."
				+ "\nExempel: B2 fyller i position B2."
				+ "\nLycka till!");
		
	}
	
}
