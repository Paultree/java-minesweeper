package minesweeper;

import java.util.List;

public class Grid {
	List<List<String>> grid;
	
	public Grid(List<List<String>> grid) {
		this.grid = grid;
	}
	
	
	public void renderGrid() {
		for (int i = 0; i < this.grid.size(); ++i) {
			for (int j = 0; j < this.grid.get(i).size(); ++j) {
				System.out.print(this.grid.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
	
	public static void initializeGridNoParams() {
		for (char alphabet = 'A'; alphabet <= 'J'; alphabet++) {
			for (int i = 0; i <= 9; i++) {
				String cell = alphabet + String.valueOf(i);
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}
	
}
