package minesweeper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayGame {

	public static void startGame() {
		
		List<String> coordinatesArr = Coordinates.setCoordinatesArr();
		
		List<List<String>> gridCoordinates = new ArrayList<>();
		
		for (char i = 'A'; i <= 'J'; ++i) {
			List<String> gridRow = new ArrayList<>();
			for (int j = 1; j <= 10; ++j) {
				String cell = i + String.valueOf(j);
				gridRow.add(cell);
			}
			gridCoordinates.add(gridRow);
		}
		
		Grid grid = new Grid(gridCoordinates);
		
		Bomb bomb = new Bomb();
		
		List<String> bombLocations = bomb.bombLocationsList();
		System.out.println(bombLocations);
		
		UserAttempts userAttempts = new UserAttempts();
		
		@SuppressWarnings("resource")
		Scanner inputObj = new Scanner(System.in);
		
		while (userAttempts.getUserAttempts().size() <= 90) {
			
		grid.renderGrid();
		
		System.out.println("Enter a coordinate:");
		
		String userGuess = inputObj.nextLine().toUpperCase();
		
		if (!coordinatesArr.contains(userGuess)) {
			System.out.println("Please input a coordinate as shown on the grid.");
			continue;
		}
		
		boolean isBombFound = userAttempts.checkGuess(userGuess, bombLocations);
		
		
		if (!isBombFound) {
			String count = userAttempts.countSurrBombs(bombLocations, userGuess);
			
			grid.updateGridBoard(userGuess, count);
		} else {
			System.out.println("BOOM! You landed on a mine! Game over!");
			break;
		}
		
		if (userAttempts.getUserAttempts().size() == 90) {
			System.out.println("You win!");
			return;
			}
		}
		
		
		
	}
}
