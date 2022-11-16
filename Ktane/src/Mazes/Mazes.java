package Mazes;

import java.util.ArrayList;

public class Mazes {
	private int row;
	private int col;
	private ArrayList<ArrayList<Block>> blocks;
	
	public Mazes(int tailleMaze) {
		blocks = new ArrayList<ArrayList<Block>>(tailleMaze);
	}
	
	public void addRow(int rowNbr, ArrayList<Block> rowToAdd) {
		for(int i = 0; i < rowToAdd.size(); i++) {
			blocks.add(rowNbr, rowToAdd);
		}
	}	
	
}
