package com.yajava.grupp6b;

public class Main {

	public static void main(String[] args) {
		// Initialize the board:
		GameBoard gameboard = new GameBoard();
		
		boolean running = true;
		int[] currentmove;
		
		while (running) {
			//Show the board:
			PrintBoard.printBoard(gameboard);
			
			// Check for draw:
			if (CheckWin.draw(gameboard) == 0) {
				System.out.println("It's a draw!");
				running = false;
				break;
			}
			
			// X makes a move and checks if it resulted in a win:
			currentmove = GameInput.takeInput("X");
			gameboard.setPoint(currentmove[0], currentmove[1], 1);
			if (CheckWin.WinX(gameboard))
			{
				System.out.println("X wins!");
				running = false;
				break;
			}
			
			// X makes a move and checks if it resulted in a win:
			PrintBoard.printBoard(gameboard);
			currentmove = GameInput.takeInput("O");
			gameboard.setPoint(currentmove[0], currentmove[1], 2);
			if (CheckWin.WinO(gameboard))
			{
				System.out.println("O wins!");
				running = false;
				break;
			}
		}
	}

}