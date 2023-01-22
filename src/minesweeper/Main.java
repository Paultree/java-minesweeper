package minesweeper;



public class Main {

	public static void main(String[] args) {
		System.out.println("WELCOME TO MINESWEEPER!");
		System.out.println("BELOW IS A GRID WITH 10 BOMBS UNDER A COORDINATE.");
		System.out.println("CHOOSE A COORDINATE FROM THE GRID AND HOPE IT'S NOT A BOMB!");
		System.out.println("IF YOU FIND A BOMB, YOU LOSE. IF YOU DON'T, A NUMBER FROM 0-8 WILL SHOW");
		System.out.println("WHICH WILL INDICATE HOW MANY BOMBS ARE AROUND THAT COORDINATE.");
		System.out.println("GOOD LUCK!");
		PlayGame.startGame();
		
	}

}
