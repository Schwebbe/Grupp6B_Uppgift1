package com.yajava.grupp6b;

public class PrintBoard {

	/*				   1   2   3
	   Illustration: A _ | _ | _
	  				 B _ | _ | _
	  				 C   |   |
	*/

	public static void grid() {
		char[][] gameGrid = {
				{'_', '|', '_' ,'|', '_',},
				{'_','|', '_', '|', '_'},
				{' ', '|', ' ', '|', ' '}
		};
		
		printGrids(gameGrid);

		
	}
	
	public static void printGrids(char [][] gameGrid) {
		for(char[] row : gameGrid) {
			for( char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
