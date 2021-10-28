package com.yajava.grupp6b;


/**
 * Handles the internal representation of the gameBoard.
 * 
 * 0 - Blank spot.
 * 1 - X
 * 2 - O
 * 
 * @author Simon Ulander
 *
 */
public class GameBoard {
	int[][] gameBoard;
	
	public GameBoard() {
		gameBoard = new int[3][3];
		
		// Clearing board:
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				gameBoard[i][j] = 0;
			}
		}
	}
	
	int getPoint(int x, int y){
		
		// Returns -1 when given invalid input
		if (x > 2 || x < 0 || y > 2 || y < 0) {
			return -1;
		}
		
		
		
		return gameBoard[x][y];
	}
	
	boolean setPoint(int x, int y, int val){
		
		// Returns -1 when given invalid input
		if (x > 2 || x < 0 || y > 2 || y < 0) {
			return false;
		}
		
		// User cannot write to a space that is already occupied:
		if (gameBoard[x][y] != 0) {
			return false;
		}
		
		gameBoard[x][y] = val;
		
		return true;
	}
	
	
}
