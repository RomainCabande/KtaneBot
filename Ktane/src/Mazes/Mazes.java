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
	private int whereCol;
	private int whereRow;
	private Integer[][] stockBlockCost;
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
	
	public int distStart(int colCoor, int rowCoor) {
		return Math.abs(rowStart - rowCoor) + Math.abs(colStart - colCoor);
	}
	
	public int calcCost(int colCoor, int rowCoor) {
		int totCost = distStart(colCoor, rowCoor);
		totCost += (int) Math.pow(Math.abs(rowEnd - rowCoor), 2) + (int) Math.pow(Math.abs(colEnd - colCoor), 2);
		if (colCoor + 1 < taillMaze && blocks.get(colCoor + 1).get(rowCoor).getWestBlock().equals(false)) {
			totCost -= distStart(colCoor + 1, rowCoor);
		}
		return totCost;

	}
	
	public void doTests(int col, int row) {
		if (blocks.get(whereRow).get(whereCol).getNorthBlock().equals(false) && visited[col][row].equals(false)) {
			stockBlockCost[col][row] = calcCost(col, row);
			visited[col][row] = true;
			/*
			if (stockBlockCost[whereCol][whereRow - 1] <= max) {
				max = stockBlockCost[whereCol][whereRow - 1];
				maxCol = whereCol;
				maxRow = whereRow - 1;
				
			}*/
		}
	}
	
	public void getDirection(Integer[][] co1, Integer[][] co2) {
		
	}

	public void solve() {
		ArrayList<ArrayList<Integer>> retPath = new ArrayList<ArrayList<Integer>>();
		//REMOVE
		setColEnd(0);
		setRowEnd(0);
		setColStart(5);
		setRowStart(5);
		System.out.println("ii");
		//REMOVE
		stockBlockCost = new Integer[taillMaze][taillMaze];

		String ret = "";
		for (int i = 0; i < taillMaze; i ++) {
			for (int j = 0; j < taillMaze; j++) {
				stockBlockCost[i][j] = calcCost(j, i);
				ret += stockBlockCost[i][j] + "|";
			}
			ret += "\n";
		}
		System.out.println(ret);
		
		while (retPath.get(retPath.size()).get(0) == colEnd || retPath.get(retPath.size()).get(1) == rowEnd) {
			
		}
		
			/*
			if (visited[whereCol][whereRow - 1].equals(true) && stockBlockCost[whereCol][whereRow - 1] >= max) {
				max = stockBlockCost[whereCol][whereRow - 1];
				maxCol = whereCol;
				maxRow = whereRow - 1;
			}
			if (visited[whereCol + 1][whereRow].equals(true) && stockBlockCost[whereCol + 1][whereRow] >= max) {
				max = stockBlockCost[whereCol][whereRow - 1];
				maxCol = whereCol + 1;
				maxRow = whereRow;
			}
			if (visited[whereCol][whereRow + 1].equals(true) && stockBlockCost[whereCol][whereRow + 1] >= max) {
				max = stockBlockCost[whereCol][whereRow - 1];
				maxCol = whereCol + 1;
				maxRow = whereRow;
			}
		}*/
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

	public int getWhereCol() {
		return whereCol;
	}

	public void setWhereCol(int whereCol) {
		this.whereCol = whereCol;
	}

	public int getWhereRow() {
		return whereRow;
	}

	public void setWhereRow(int whereRow) {
		this.whereRow = whereRow;
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
