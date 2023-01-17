package minesweeper;

public class Grid {
	
	
	
	
	public static void initializeGrid() {
		for (char alphabet = 'A'; alphabet <= 'J'; alphabet++) {
			for (int i = 1; i <= 10; i++) {
				String cell = alphabet + String.valueOf(i);
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}
	
}
