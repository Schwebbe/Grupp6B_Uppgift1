package com.yajava.grupp6b;

public class Main {

	public static int retVal(String s) {
		if (s.equals("X")) {
			return 1;
		}
		return 2;
	}

	public static boolean makeMove(GameBoard gameboard, String player) {
		
		int[] currentmove;
		
		// Print board:
		PrintBoard.printBoard(gameboard);
		
		// Check for draw:
		if (CheckWin.draw(gameboard) == 0) {
			System.out.println("It's a draw!");
			return false;
		}
		
		currentmove = GameInput.takeInput(player);
		while(!gameboard.setPoint(currentmove[0], currentmove[1], retVal(player))) {
			System.out.println("Spot already taken! Choose another one!");
			currentmove = GameInput.takeInput(player);
		}
		
		if (player.toUpperCase().equals("X")) {
			if (CheckWin.WinX(gameboard)) {
				PrintBoard.printBoard(gameboard);
				System.out.println("X wins!");
				return false;
			}
		}else if (player.toUpperCase().equals("O")) {
			if (CheckWin.WinO(gameboard)) {
				PrintBoard.printBoard(gameboard);
				System.out.println("O wins!");
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// Initialize the board:
		GameBoard gameboard = new GameBoard();

		PrintBoard.gameRules();

		boolean running = true;

		String[] starter = GameInput.whoStart();
		while (running) {

			running = makeMove(gameboard, starter[0]);
			
			// Did the game finish? If not allow the other player to also make a move:
			if (running) {
				running = makeMove(gameboard, starter[1]);
			}

		}
	}

}