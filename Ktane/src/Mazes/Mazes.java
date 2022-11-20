package Mazes;

import java.util.ArrayList;
import java.util.Arrays;

import stdlib.In;
import stdlib.StdDraw;

public class Mazes {
	private int tailleMaze;
	private ArrayList<ArrayList<Block>> blocks;
	private int rowStart;
	private int colStart;
	private int rowEnd;
	private int colEnd;
	private int whereCol;
	private int whereRow;
	private Integer[][] stockBlockCost;
	private Boolean[][] visited;
	private final int tailleCarré = 50;
	ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();


	public Mazes(int tailleMaze) {
		//************
		setColEnd(5);
		setRowEnd(0);
		setColStart(1);
		setRowStart(3);
		//************
		this.path = new ArrayList<ArrayList<Integer>>();
		this.blocks = new ArrayList<ArrayList<Block>>(tailleMaze);
		this.stockBlockCost = new Integer[tailleMaze][tailleMaze];
		this.tailleMaze = tailleMaze;
		visited = new Boolean[tailleMaze][tailleMaze];
		visited[colStart][rowStart] = true;
		this.whereCol = colStart;
		this.whereRow = rowStart;
		this.path.add(new ArrayList<Integer>(Arrays.asList(rowStart, colStart)));
		String ret = "";
		for(int i = 0; i < tailleMaze; i++) {
			for(int j = 0; j < tailleMaze; j++) {
				visited[i][j] = false;
				stockBlockCost[i][j] = calcCost(j, i);
				//ret += stockBlockCost[i][j] + "|";
			}
			//ret += "\n";
		}
		//System.out.println(ret);
	}
	
	public void addRow(int rowNbr, ArrayList<Block> rowToAdd) {
		for (int i = 0; i < rowToAdd.size(); i++) {
			blocks.add(rowNbr, rowToAdd);
		}
	}
	
	public int distStart(int colCoor, int rowCoor) {
		return Math.abs(rowCoor - rowStart) + Math.abs(colCoor - colStart);
	}
	
	public int calcCost(int colCoor, int rowCoor) {
		int totCost = distStart(colCoor, rowCoor);
		totCost =  ((int) Math.pow(Math.abs(rowEnd - rowCoor), 2) + (int) Math.pow(Math.abs(colEnd - colCoor), 2));
		return totCost;
	}

	public void solve() {
		int minValue = Integer.MAX_VALUE;
		int minCol = -1;
		int minRow = -1;
		if ((whereRow - 1)  >= 0) {
			if (blocks.get(whereRow).get(whereCol).getNorthBlock().equals(false) && visited[whereCol][whereRow - 1].equals(false) && stockBlockCost[whereCol][whereRow - 1] < minValue) {
				minValue = stockBlockCost[whereCol][whereRow - 1];
				minCol = whereCol;
				minRow = whereRow - 1;
			}
		}
		if ((whereCol + 1) < tailleMaze) {
			if (blocks.get(whereRow).get(whereCol).getEastBlock().equals(false) && visited[whereCol + 1][whereRow].equals(false) && stockBlockCost[whereCol + 1][whereRow] < minValue) {
				minValue = stockBlockCost[whereCol + 1][whereRow];
				minCol = whereCol + 1;
				minRow = whereRow;
			}
		}
		if ((whereRow + 1) < tailleMaze) {
			if (blocks.get(whereRow).get(whereCol).getSouthBlock().equals(false) && visited[whereCol][whereRow + 1].equals(false) && stockBlockCost[whereCol][whereRow + 1] < minValue) {
				minValue = stockBlockCost[whereCol][whereRow + 1];
				minCol = whereCol;
				minRow = whereRow + 1;
			}
		}
		if ((whereCol - 1) >= 0) {
			if (blocks.get(whereRow).get(whereCol).getWestBlock().equals(false) && visited[whereCol - 1][whereRow].equals(false) && stockBlockCost[whereCol - 1][whereRow] < minValue) {
				minValue = stockBlockCost[whereCol - 1][whereRow];
				minCol = whereCol - 1;
				minRow = whereRow;
			}
		}
		if (minCol == colEnd && minRow == rowEnd) {
			setWhereCol(minCol);
			setWhereRow(minRow);
			addToPath(minRow, minCol);
		}else if(minValue == Integer.MAX_VALUE) {
			removeLastPath();
			setWhereCol(getPathLastCol());
			setWhereRow(getPathLastRow());
			solve();
		}else if (minValue != Integer.MAX_VALUE) {
			setWhereCol(minCol);
			setWhereRow(minRow);
			visited[whereCol][whereRow] = true;
			addToPath(minRow, minCol);
			solve();
		}
	}
	
	public void addToPath(int row, int col) {
		this.path.add(new ArrayList<Integer>(Arrays.asList(row, col)));
	}
	
	public void removeLastPath() {
		this.path.remove(path.size() - 1);
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
	
	public int getPathLastRow() {
		return path.get(path.size() - 1).get(0);
	}
	
	public int getPathLastCol() {
		return path.get(path.size() - 1).get(1);
	}
	
	public void printPath() {
		System.out.println(path);
	}
	
	public ArrayList<ArrayList<Integer>> getPath() {
		return path;
	}

	public int getTailleMaze() {
		return tailleMaze;
	}

	public ArrayList<ArrayList<Block>> getBlocks() {
		return blocks;
	}

	public void printSoluceMaze() {
		String ret = "+";
		for (int k = 0; k < Math.sqrt(blocks.size()); k++) {
			ret += "—+";
		}
		ret += "\n";
		for (int i = 0; i < Math.sqrt(blocks.size()); i++) {
			ret += "|";
			for (int j = 0; j < Math.sqrt(blocks.size()) - 1; j++) {
				ArrayList<Integer> coorList = new ArrayList<Integer>(Arrays.asList(i, j));
				if (blocks.get(i).get(j).getEastBlock().equals(true) && blocks.get(i).get(j+1).getWestBlock().equals(true)) {
					if (path.contains(coorList)) {
						ret += "X|";
					}else {
						ret += "O|";
					}
				}else if (blocks.get(i).get(j).getEastBlock().equals(false) && blocks.get(i).get(j+1).getWestBlock().equals(false)) {
					if (path.contains(coorList)) {
						ret += "X ";
					}else {
						ret += "O ";
					}
				}else {
					ret += ":error " + (j+1) + (j+2) + "/" + (i+1) + ":";
				}
			}
			ArrayList<Integer> coorList = new ArrayList<Integer>(Arrays.asList(i, 5));
			if (path.contains(coorList)) {
				ret += "X|";
			}else {
				ret += "O|";
			}
			ret += "\n";
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
		System.out.println(ret);
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
