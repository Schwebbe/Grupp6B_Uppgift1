package com.yajava.grupp6b;

import java.util.Scanner;

public class Main {
	

	
	public static int retVal(String s) {
		if (s.equals("X")) {
			return 1;
		}
		return 2;
	}
	
	public static void makeMove(GameBoard gb) {
		
	}

	public static void main(String[] args) {
		// Initialize the board:
		GameBoard gameboard = new GameBoard();
		
		PrintBoard.gameRules();
		
		boolean running = true;
		int[] currentmove;
		
		String[] starter = GameInput.whoStart();
		while (running) {
			//Show the board:
			PrintBoard.printBoard(gameboard);
			
			// Check for draw:
			if (CheckWin.draw(gameboard) == 0) {
				PrintBoard.printBoard(gameboard);
				System.out.println("It's a draw!");
				running = false;
				break;
			}
			
			// X makes a move and checks if it resulted in a win:
			currentmove = GameInput.takeInput(starter[0]);
			gameboard.setPoint(currentmove[0], currentmove[1], retVal(starter[0]));
			if (CheckWin.WinX(gameboard))
			{
				PrintBoard.printBoard(gameboard);
				System.out.println("X wins!");
				running = false;
				break;
			}
			
			// X makes a move and checks if it resulted in a win:
			PrintBoard.printBoard(gameboard);
			currentmove = GameInput.takeInput(starter[1]);
			gameboard.setPoint(currentmove[0], currentmove[1], retVal(starter[1]));
			if (CheckWin.WinO(gameboard))
			{
				PrintBoard.printBoard(gameboard);
				System.out.println("O wins!");
				running = false;
				break;
			}
		}
	}

}