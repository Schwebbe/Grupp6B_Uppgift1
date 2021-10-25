package com.yajava.grupp6b;


/**
 * Handles the internal representation of the gameBoard.
 * 
 * @author Simon Ulander
 *
 */
public class GameBoard {
	int[][] gameBoard;
	
	public GameBoard() {
		gameBoard = new int[3][3];
	}
	
	int getPoint(int x, int y){
		
		// Returns -1 when given invalid input
		if (x > 2 || x < 0 || y > 2 || y < 0) {
			return -1;
		}
		
		
		
		return gameBoard[x][y];
	}
	
	int setPoint(int x, int y, int val){
		
		// Returns -1 when given invalid input
		if (x > 2 || x < 0 || y > 2 || y < 0) {
			return -1;
		}
		
		gameBoard[x][y] = val;
		
		return 0;
	}
	
	
}
