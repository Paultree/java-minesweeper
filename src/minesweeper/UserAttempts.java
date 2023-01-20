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
	
	public static List<String> getSurrLoc(String coordinate) {
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
	
	public void addUniqqueGuess(String userGuess) {
		
		if (this.userAttempts.contains(userGuess)) {
			System.out.println("You have already used this coordinate! Try again!");
			return;
		}
		
		
		this.userAttempts.add(userGuess); //this is the last step
		
		
	}
	
	//make a new function that checks the location against the bomblocations array
	// this be a boolean check
	
	//make another function that runs if location aint true
	//loops the surrounding locations and checks if they are in the bomb location array.
	// returns an int which we'll turn into a String which will then change the String coordination in our grid array then we re-render. 


}
