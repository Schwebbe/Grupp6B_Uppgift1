package com.yajava.grupp6b;

/**
 * The Main class ties everything together.
 * 
 * @author Simon Ulander
 *
 */
public class Main {
	
	/**
	 * Takes in the String value "X" and "O" and converts them to
	 * the proper integer that fits into the GameBoard.
	 * 
	 * @param s
	 * @return
	 */
	public static int retVal(String s) {
		if (s.equals("X")) {
			return 1;
		}
		return 2;
	}
	
	/**
	 * Handles player moves in the game.
	 * 
	 * @param gameboard
	 * @param player
	 * @return
	 */
	public static boolean makeMove(GameBoard gameboard, String player) {
		
		int[] currentmove;
		
		// Check for draw:
		if (CheckWin.draw(gameboard) == 0) {
			System.out.println("It's a draw!");
			return false;
		}
		
		// Take input:
		currentmove = GameInput.takeInput(player);
		
		// Make sure the user isn't attempting to write over moves of the other player or waste a move:
		while(!gameboard.setPoint(currentmove[0], currentmove[1], retVal(player))) {
			System.out.println("Invalid move! Choose another one!");
			currentmove = GameInput.takeInput(player);
		}
		
		// Print board after move is made:
		PrintBoard.printBoard(gameboard);
		
		// Check if the current user won:
		if (CheckWin.Win(gameboard, retVal(player))) {
			System.out.println(player + " wins!");
			return false;
		}
		

		return true;
	}

	public static void main(String[] args) {
		// Initialize the board:
		GameBoard gameboard = new GameBoard();

		PrintBoard.gameRules();

		boolean running = true;
		
		// Who will make the first move?
		String[] starter = GameInput.whoStart();
		
		// Print board:
		PrintBoard.printBoard(gameboard);
		
		// Gameloop:
		while (running) {

			running = makeMove(gameboard, starter[0]);
			
			// Did the game finish? If not allow the other player to also make a move:
			if (running) {
				running = makeMove(gameboard, starter[1]);
			}

		}
	}

}