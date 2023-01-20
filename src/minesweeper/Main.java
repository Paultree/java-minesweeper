package minesweeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
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
		
		grid.renderGrid();
		
		Bomb bombList = new Bomb();
		
		bombList.bombLocationList();
		
		System.out.println(Arrays.toString(bombList.bombLocations.toArray()));

		List<String> test = new ArrayList<>();
		test.add("C1");
		
		UserAttempts.getSurrLoc("C1");
	}

}
