package com.yajava.grupp6b;

import java.util.Scanner;

public class Main {
	
	public static String[] whoStart() {
		String[] X = {"X","O"};
		String[] O = {"O","X"};
		
		
		System.out.println("Who should start X, O, or random?");
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		while (!(input.toLowerCase().equals("x") || input.toLowerCase().equals("o") || input.toLowerCase().equals("random"))) {
			System.out.println("Valid input is X, O or random: ");
			input = scan.nextLine();
		}
		
		scan.close();
		
		if (input.toLowerCase().equals("x")) {
			return X;
		}
		
		if (input.toLowerCase().equals("o")) {
			return O;
		}
		
		if (input.toLowerCase().equals("random")) {
			if (Math.random() >= 0.5) {
				return O;
			}
		}
		
		return X;
	}
	
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
		
		boolean running = true;
		int[] currentmove;
		
		String[] starter = whoStart();
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