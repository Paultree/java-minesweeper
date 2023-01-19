package minesweeper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bomb {
	
	
	public static String randomCoord() {
		Random rnd = new Random();
		char y = (char) ('A' + rnd.nextInt('J' - 'A'));
		int x = rnd.nextInt(10);
		String coordinate = y + Integer.toString(x);
		System.out.println(coordinate);
		return coordinate;
	}
	
	public static List<String> coordList() {
		List<String> bombLocations = new ArrayList<>();
		for (int i = 0; i < 10; ++i) {
			String coordinate = randomCoord();
			if (bombLocations.contains(coordinate)) {
				bombLocations.add(coordinate);
			}
		}
		
		return bombLocations;
	}
}
