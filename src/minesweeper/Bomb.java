package minesweeper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bomb {
	List<String> bombLocations;
	
	public Bomb() {
		this.bombLocations = new ArrayList<>();
	}
	
	
	
	public List<String> getBombLocations() {
		return bombLocations;
	}



	public void setBombLocations(List<String> bombLocations) {
		this.bombLocations = bombLocations;
	}



	public static String randomBombLocation() {
		Random rnd = new Random();
		char y = (char) ('A' + rnd.nextInt('J' - 'A'));
		int x = rnd.nextInt(10);
		String coordinate = y + Integer.toString(x);
		
		return coordinate;
	}
	
	//instantiate the instance of Bomb and then use below method
	
	public List<String> bombLocationsList() {
		for (int i = 0; i < 10; ++i) {
			String coordinate = randomBombLocation();
			
			if (!this.bombLocations.contains(coordinate)) {
				this.bombLocations.add(coordinate);
			}	
		}
		return this.bombLocations;
	}
}
