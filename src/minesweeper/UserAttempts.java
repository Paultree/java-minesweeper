package minesweeper;

import java.util.ArrayList;
import java.util.List;

public class UserAttempts {
	List<String> userAttempts;
	
	
	public UserAttempts() {
		
		this.userAttempts = new ArrayList<>();
	}
	
	public List<String> getUserAttempts() {
		return userAttempts;
	}
	
	public List<String> getSurrLoc(String coordinate) {
		List<String> surroundingLocations = new ArrayList<>();
		char x = coordinate.charAt(0);
		char y = coordinate.charAt(1);

		
		for (char i = (char) (x-1); i <= x + 1; ++i) {
			for (char j = (char) (y - 1); j <= y + 1; ++j) {
				String cell = i + String.valueOf(j);
				if (!cell.equals(coordinate)) {
					surroundingLocations.add(cell);
				}
			}
		}
		return surroundingLocations;
		
	}
	
	public boolean addUniqqueGuess(String coordinate) {
		
		if (this.userAttempts.contains(coordinate)) {
			return false;
		}
		
		
		this.userAttempts.add(coordinate); //this is the last step
		return true;
		
	}
	
	//make a new function that checks the location against the bomblocations array
	// this be a boolean check
	public boolean checkGuess(String coordinate, List<String> bombLocations) {
		boolean isAdded = this.addUniqqueGuess(coordinate);
		
		if (!isAdded) {
			System.out.println("Coordinate already used.");
			return false;
		}
		
		if (bombLocations.contains(coordinate)) {
			return true;
		}
		return false;	
	}
	//make another function that runs if location is not true
	//loops the surrounding locations and checks if they are in the bomb location array.
	// returns an int which we'll turn into a String which will then change the String coordination in our grid array then we re-render. 
	public String countSurrBombs(List<String> bombLocations, String coordinate) {
		List<String> surrLoc = this.getSurrLoc(coordinate);
		int count = 0;
		for (int i = 0; i < surrLoc.size(); ++i) {
			if (bombLocations.contains(surrLoc.get(i))) {
				count++;
			}
		}
		String surrBombs = Integer.toString(count) + "!";
		return surrBombs;
	}

}
