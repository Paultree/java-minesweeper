package minesweeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coordinates {
	
	
	
	public static List<String> setCoordinatesArr() {
		List<String> list = new ArrayList<>();
		for (char i = 'A'; i <= 'J'; ++i) {
			for (int j = 1; j <= 10; ++j) {
				String cell = i + String.valueOf(j);
				list.add(cell);
			}
			
		}
		System.out.print(Arrays.toString(list.toArray()));
		return list;
	}
}
