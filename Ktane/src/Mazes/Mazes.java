package Mazes;

import java.util.ArrayList;

public class Mazes {
	private int row;
	private int col;
	private ArrayList<ArrayList<Block>> blocks;

	public Mazes(int tailleMaze) {
		blocks = new ArrayList<ArrayList<Block>>(tailleMaze);
	}
	/*
	 * public Mazes(int tailleMaze) { blocks = new
	 * ArrayList<ArrayList<Block>>(tailleMaze); }
	 */

	public void addRow(int rowNbr, ArrayList<Block> rowToAdd) {
		for (int i = 0; i < rowToAdd.size(); i++) {
			blocks.add(rowNbr, rowToAdd);
		}
	}

	public void mazeGen() {
<<<<<<< Updated upstream
=======
		// StdDraw.setCanvasSize(width, height);

	}

	@Override
	public String toString() {
		String ret = "+";
		for (int k = 0; k < Math.sqrt(blocks.size()); k++) {
			ret += "—+";
		}
		ret += "\n";
		for (int i = 0; i < Math.sqrt(blocks.size()); i++) {
			ret += "|";
			for (int j = 0; j < Math.sqrt(blocks.size()) - 1; j++) {
				if (blocks.get(i).get(j).getEastBlock().equals(true) && blocks.get(i).get(j+1).getWestBlock().equals(true)) {
					ret += "O|";
				}else if (blocks.get(i).get(j).getEastBlock().equals(false) && blocks.get(i).get(j+1).getWestBlock().equals(false)) {
					ret += "O ";
				}else {
					ret += "error" + (j+1) + (j+2) + "/" + (i+1);
				}
			}
			ret += "O|\n";
			//ret += "+";
			for (int j = 0; j < Math.sqrt(blocks.size()); j++) {
				if (i == Math.sqrt(blocks.size()) - 1) {
					ret += "+—";
				}else {
					if (blocks.get(i).get(j).getSouthBlock().equals(true) && blocks.get(i+1).get(j).getNorthBlock().equals(true)) {
						ret += "+—";
					}else if (blocks.get(i).get(j).getSouthBlock().equals(false) && blocks.get(i+1).get(j).getNorthBlock().equals(false)) {
						ret += "+ ";
					}else {
						ret += "error" + (j+1) + "/" + (i+1) + (i+2);
					}
				}
			}	
			ret += "+\n";			
		}
		return ret;
>>>>>>> Stashed changes
	}
}
