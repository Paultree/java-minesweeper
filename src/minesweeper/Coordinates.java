package minesweeper;

import java.util.ArrayList;

import java.util.List;

public class Coordinates {
	
	
	
	public static List<String> setCoordinatesArr() {
		List<String> list = new ArrayList<>();
		for (char i = 'A'; i <= 'J'; ++i) {
			for (int j = 0; j <= 9; ++j) {
				String cell = i + String.valueOf(j);
				list.add(cell);
			}
			
		}
		
		return list;
	}
}
