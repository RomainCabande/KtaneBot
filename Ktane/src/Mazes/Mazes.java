package Mazes;

import java.util.ArrayList;

import stdlib.StdDraw;

public class Mazes {
	private int row;
	private int col;
	private int taillMaze;
	private ArrayList<ArrayList<Block>> blocks;
	private int rowStart;
	private int colStart;
	private int rowEnd;
	private int colEnd;
	private Integer[][] coors;
	private Boolean[][] visited;

	public Mazes(int tailleMaze) {
		blocks = new ArrayList<ArrayList<Block>>(tailleMaze);
		this.taillMaze = tailleMaze;
		visited = new Boolean[tailleMaze][tailleMaze];
		for(int i = 0; i < tailleMaze; i++) {
			for(int j = 0; j < tailleMaze; j++) {
				visited[i][j] = false;
			}

		}
	}
	
	public void addRow(int rowNbr, ArrayList<Block> rowToAdd) {
		for (int i = 0; i < rowToAdd.size(); i++) {
			blocks.add(rowNbr, rowToAdd);
		}
	}

	public void mazeGen() {
		//StdDraw.setCanvasSize(width, height);

	}
	
	public void getDirection(Integer[][] co1, Integer[][] co2) {
		
	}

	public void solve() {
		coors = new Integer[colStart][rowStart];
	}
	
	public void setRowStart(int rowStart) {
		this.rowStart = rowStart;
	}

	public void setColStart(int colStart) {
		this.colStart = colStart;
	}

	public void setRowEnd(int rowEnd) {
		this.rowEnd = rowEnd;
	}

	public void setColEnd(int colEnd) {
		this.colEnd = colEnd;
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
					ret += ":error " + (j+1) + (j+2) + "/" + (i+1) + ":";
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
						ret += ":error " + (j+1) + "/" + (i+1) + (i+2) + ":";
					}
				}
			}	
			ret += "+\n";			
		}
		return ret;
	}
	
}
