package Mazes;

import java.util.ArrayList;

import stdlib.StdDraw;

public class mazeDrawer {
	private Mazes mazeToDraw;
	private int tailleCarre;
	private int tailleMaze;
	private ArrayList<ArrayList<Block>> blocks;
	private ArrayList<ArrayList<Integer>> path;

	public mazeDrawer(Mazes maze, int tailleCarre) {
		mazeToDraw = maze;
		this.tailleCarre = tailleCarre;
		tailleMaze = maze.getTailleMaze();
		blocks = new ArrayList<ArrayList<Block>>(mazeToDraw.getBlocks());
		StdDraw.setCanvasSize(tailleCarre * (tailleMaze + 1), tailleCarre * (tailleMaze + 1));
		path = new ArrayList<ArrayList<Integer>>(mazeToDraw.getPath());
	}

	public void drawCol() {
		StdDraw.setPenColor();
		for (int i = 0; i < Math.sqrt(blocks.size()); i++) {
			for (int j = 0; j < Math.sqrt(blocks.size()) - 1; j++) {
				if (blocks.get(i).get(j).getEastBlock().equals(true)
						&& blocks.get(i).get(j + 1).getWestBlock().equals(true)) {
					double currentX = ((double) (j * tailleCarre + ((double) tailleCarre * 1.5))
							/ (double) (tailleCarre * (tailleMaze + 1)));
					double currentY = 1 - ((double) (i * tailleCarre + ((double) tailleCarre / 2))
							/ (double) (tailleCarre * (tailleMaze + 1)));
					double goToX = ((double) (j * tailleCarre + ((double) tailleCarre * 1.5))
							/ (double) (tailleCarre * (tailleMaze + 1)));
					double goToY = 1 - ((double) (i * tailleCarre + ((double) tailleCarre / 2) + tailleCarre)
							/ (double) (tailleCarre * (tailleMaze + 1)));

					StdDraw.line(currentX, currentY, goToX, goToY);
				}
			}
		}
	}

	public void drawColCot() {
		StdDraw.setPenColor();
		StdDraw.line(((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)),
				((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)),
				((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)),
				1 - ((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)));
		StdDraw.line(1 - ((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)),
				((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)),
				1 - ((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)),
				1 - ((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)));
	}

	public void drawRow() {
		StdDraw.setPenColor();
		for (int i = 0; i < Math.sqrt(blocks.size()); i++) {
			for (int j = 0; j < Math.sqrt(blocks.size()); j++) {
				if (blocks.get(i).get(j).getSouthBlock().equals(true)
						&& blocks.get(i + 1).get(j).getNorthBlock().equals(true)) {
					double currentX = ((double) (j * tailleCarre + ((double) tailleCarre / 2))
							/ (double) (tailleCarre * (tailleMaze + 1)));
					double currentY = 1 - ((double) (i * tailleCarre + tailleCarre + ((double) tailleCarre / 2))
							/ (double) (tailleCarre * (tailleMaze + 1)));
					double goToX = ((double) (j * tailleCarre + ((double) tailleCarre / 2) + tailleCarre)
							/ (double) (tailleCarre * (tailleMaze + 1)));
					double goToY = 1 - ((double) (i * tailleCarre + tailleCarre + ((double) tailleCarre / 2))
							/ (double) (tailleCarre * (tailleMaze + 1)));
					StdDraw.line(currentX, currentY, goToX, goToY);
				}
			}
		}
	}

	public void drawRowCot() {
		StdDraw.setPenColor();
		StdDraw.line(((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)),
				((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)),
				1 - (((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1))),
				((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)));
		StdDraw.line(((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)),
				1 - (((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1))),
				1 - ((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)),
				1 - ((double) tailleCarre / 2) / (double) (tailleCarre * (tailleMaze + 1)));
	}

	public void drawPath() {
		StdDraw.setPenColor(StdDraw.BLUE);
		if (path.get(0).get(0) < path.get(1).get(0) && path.get(0).get(1) == path.get(1).get(1))
			drawSouthLigne(path.get(0).get(1), path.get(0).get(0));
		if (path.get(0).get(0) > path.get(1).get(0) && path.get(0).get(1) == path.get(1).get(1))
			drawNorthLigne(path.get(0).get(1), path.get(0).get(0));
		if (path.get(0).get(1) < path.get(1).get(1) && path.get(0).get(0) == path.get(1).get(0))
			drawEastLigne(path.get(0).get(1), path.get(0).get(0));
		if (path.get(0).get(1) > path.get(1).get(1) && path.get(0).get(0) == path.get(1).get(0))
			drawWestLigne(path.get(0).get(1), path.get(0).get(0));

		if (path.get(path.size() - 1).get(0) < path.get(path.size() - 2).get(0)
				&& path.get(path.size() - 1).get(1) == path.get(path.size() - 2).get(1))
			drawSouthLigne(path.get(path.size() - 1).get(1), path.get(path.size() - 1).get(0));
		if (path.get(path.size() - 1).get(0) > path.get(path.size() - 2).get(0)
				&& path.get(path.size() - 1).get(1) == path.get(path.size() - 2).get(1))
			drawNorthLigne(path.get(path.size() - 1).get(1), path.get(path.size() - 1).get(0));
		if (path.get(path.size() - 1).get(1) < path.get(path.size() - 2).get(1)
				&& path.get(path.size() - 1).get(0) == path.get(path.size() - 2).get(0))
			drawEastLigne(path.get(path.size() - 1).get(1), path.get(path.size() - 1).get(0));
		if (path.get(path.size() - 1).get(1) > path.get(path.size() - 2).get(1)
				&& path.get(path.size() - 1).get(0) == path.get(path.size() - 2).get(0))
			drawWestLigne(path.get(path.size() - 1).get(1), path.get(path.size() - 1).get(0));

		for (int i = 1; i < (path.size() - 1); i++) {
			if ((path.get(i + 1).get(0) < path.get(i).get(0) || path.get(i + 1).get(0) > path.get(i).get(0))
					&& path.get(i + 1).get(1) == path.get(i).get(1)
					&& (path.get(i - 1).get(0) > path.get(i).get(0) || path.get(i - 1).get(0) < path.get(i).get(0))
					&& path.get(i - 1).get(1) == path.get(i).get(1)) {
				drawSouthToNorth(path.get(i).get(1), path.get(i).get(0));
			} else if ((path.get(i + 1).get(1) < path.get(i).get(1) || path.get(i + 1).get(1) > path.get(i).get(1))
					&& path.get(i + 1).get(0) == path.get(i).get(0)
					&& (path.get(i - 1).get(1) > path.get(i).get(1) || path.get(i - 1).get(1) < path.get(i).get(1))
					&& path.get(i - 1).get(0) == path.get(i).get(0)) {
				drawEastToWest(path.get(i).get(1), path.get(i).get(0));
			} else if ((path.get(i + 1).get(0) < path.get(i).get(0) && path.get(i - 1).get(1) > path.get(i).get(1))
					|| (path.get(i - 1).get(0) < path.get(i).get(0) && path.get(i + 1).get(1) > path.get(i).get(1))) {
				drawNorthToEast(path.get(i).get(1), path.get(i).get(0));
			} else if ((path.get(i + 1).get(0) < path.get(i).get(0) && path.get(i - 1).get(1) < path.get(i).get(1))
					|| (path.get(i - 1).get(0) < path.get(i).get(0) && path.get(i + 1).get(1) < path.get(i).get(1))) {
				drawWestToNorth(path.get(i).get(1), path.get(i).get(0));
			} else if ((path.get(i + 1).get(0) > path.get(i).get(0) && path.get(i - 1).get(1) < path.get(i).get(1))
					|| (path.get(i - 1).get(0) > path.get(i).get(0) && path.get(i + 1).get(1) < path.get(i).get(1))) {
				drawSouthToWest(path.get(i).get(1), path.get(i).get(0));
			} else if ((path.get(i + 1).get(0) > path.get(i).get(0) && path.get(i - 1).get(1) > path.get(i).get(1))
					|| (path.get(i - 1).get(0) > path.get(i).get(0) && path.get(i + 1).get(1) > path.get(i).get(1))) {
				drawEastToSouth(path.get(i).get(1), path.get(i).get(0));
			}
		}
	}

	public void drawNorthLigne(int col, int row) {
		StdDraw.setPenColor(StdDraw.BLUE);
		double coorX = (((double) (tailleCarre * (col + 1))) / ((double) (tailleCarre * (tailleMaze + 1))));
		double coorY = 1 - ((double) (tailleCarre * (row + 1)) / (double) (tailleCarre * (tailleMaze + 1)));
		double radiusSquare = (((double) tailleCarre / 10) / (double) (tailleCarre * (tailleMaze + 1)));
		StdDraw.filledSquare(coorX, coorY, radiusSquare);
		double rectCoorX = (((double) (tailleCarre * (col + 1))) / ((double) (tailleCarre * (tailleMaze + 1))));
		double rectCoorY = 1 - (((double) (tailleCarre * (row + 1)) - ((double) tailleCarre / 4))
				/ (double) (tailleCarre * (tailleMaze + 1)));
		double rectHalfWidth = (((double) tailleCarre / 10) / (double) (tailleCarre * (tailleMaze + 1)));
		double rectHalfHeight = ((double) tailleCarre / 4) / (double) (tailleCarre * (tailleMaze + 1));
		StdDraw.filledRectangle(rectCoorX, rectCoorY, rectHalfWidth, rectHalfHeight);
		StdDraw.setPenColor(StdDraw.BLACK);
	}

	public void drawSouthLigne(int col, int row) {
		StdDraw.setPenColor(StdDraw.BLUE);
		double coorX = (((double) (tailleCarre * (col + 1))) / ((double) (tailleCarre * (tailleMaze + 1))));
		double coorY = 1 - ((double) (tailleCarre * (row + 1)) / (double) (tailleCarre * (tailleMaze + 1)));
		double radiusSquare = (((double) tailleCarre / 10) / (double) (tailleCarre * (tailleMaze + 1)));
		StdDraw.filledSquare(coorX, coorY, radiusSquare);
		double rectCoorX = (((double) (tailleCarre * (col + 1))) / ((double) (tailleCarre * (tailleMaze + 1))));
		double rectCoorY = 1 - (((double) (tailleCarre * (row + 1)) + ((double) tailleCarre / 4))
				/ (double) (tailleCarre * (tailleMaze + 1)));
		double rectHalfWidth = (((double) tailleCarre / 10) / (double) (tailleCarre * (tailleMaze + 1)));
		double rectHalfHeight = ((double) tailleCarre / 4) / (double) (tailleCarre * (tailleMaze + 1));
		StdDraw.filledRectangle(rectCoorX, rectCoorY, rectHalfWidth, rectHalfHeight);
		StdDraw.setPenColor(StdDraw.BLACK);
	}

	public void drawEastLigne(int col, int row) {
		StdDraw.setPenColor(StdDraw.BLUE);
		double coorX = (((double) (tailleCarre * (col + 1))) / ((double) (tailleCarre * (tailleMaze + 1))));
		double coorY = 1 - ((double) (tailleCarre * (row + 1)) / (double) (tailleCarre * (tailleMaze + 1)));
		double radiusSquare = (((double) tailleCarre / 10) / (double) (tailleCarre * (tailleMaze + 1)));
		StdDraw.filledSquare(coorX, coorY, radiusSquare);
		double rectCoorX = (((double) (tailleCarre * (col + 1)) + ((double) tailleCarre / 4))
				/ ((double) (tailleCarre * (tailleMaze + 1))));
		double rectCoorY = 1 - ((double) (tailleCarre * (row + 1)) / (double) (tailleCarre * (tailleMaze + 1)));
		double rectHalfHeight = (((double) tailleCarre / 10) / (double) (tailleCarre * (tailleMaze + 1)));
		double rectHalfWidth = ((double) tailleCarre / 4) / (double) (tailleCarre * (tailleMaze + 1));
		StdDraw.filledRectangle(rectCoorX, rectCoorY, rectHalfWidth, rectHalfHeight);
		StdDraw.setPenColor(StdDraw.BLACK);
	}

	public void drawWestLigne(int col, int row) {
		StdDraw.setPenColor(StdDraw.BLUE);
		double coorX = (((double) (tailleCarre * (col + 1))) / ((double) (tailleCarre * (tailleMaze + 1))));
		double coorY = 1 - ((double) (tailleCarre * (row + 1)) / (double) (tailleCarre * (tailleMaze + 1)));
		double radiusSquare = (((double) tailleCarre / 10) / (double) (tailleCarre * (tailleMaze + 1)));
		StdDraw.filledSquare(coorX, coorY, radiusSquare);
		double rectCoorX = (((double) (tailleCarre * (col + 1)) - ((double) tailleCarre / 4))
				/ ((double) (tailleCarre * (tailleMaze + 1))));
		double rectCoorY = 1 - ((double) (tailleCarre * (row + 1)) / (double) (tailleCarre * (tailleMaze + 1)));
		double rectHalfHeight = (((double) tailleCarre / 10) / (double) (tailleCarre * (tailleMaze + 1)));
		double rectHalfWidth = ((double) tailleCarre / 4) / (double) (tailleCarre * (tailleMaze + 1));
		StdDraw.filledRectangle(rectCoorX, rectCoorY, rectHalfWidth, rectHalfHeight);
		StdDraw.setPenColor(StdDraw.BLACK);
	}

	public void drawWestToNorth(int col, int row) {
		drawWestLigne(col, row);
		drawNorthLigne(col, row);
	}

	public void drawNorthToEast(int col, int row) {
		drawEastLigne(col, row);
		drawNorthLigne(col, row);
	}

	public void drawEastToSouth(int col, int row) {
		drawEastLigne(col, row);
		drawSouthLigne(col, row);
	}

	public void drawSouthToWest(int col, int row) {
		drawWestLigne(col, row);
		drawSouthLigne(col, row);
	}

	public void drawSouthToNorth(int col, int row) {
		drawNorthLigne(col, row);
		drawSouthLigne(col, row);
	}

	public void drawEastToWest(int col, int row) {
		drawWestLigne(col, row);
		drawEastLigne(col, row);
	}

	public void showStartEnd() {
		StdDraw.setPenColor(StdDraw.WHITE);
		double coorX = (((double) (tailleCarre * (path.get(0).get(1) + 1)))
				/ ((double) (tailleCarre * (tailleMaze + 1))));
		double coorY = 1
				- ((double) (tailleCarre * (path.get(0).get(0) + 1)) / (double) (tailleCarre * (tailleMaze + 1)));
		double radiusSquare = (((double) tailleCarre / 3) / (double) (tailleCarre * (tailleMaze + 1)));
		StdDraw.filledCircle(coorX, coorY, radiusSquare);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.circle(coorX, coorY, radiusSquare);
		StdDraw.text(coorX + 0.002, coorY - 0.005, "S");

		StdDraw.setPenColor(StdDraw.RED);
		double coorEndX = (((double) (tailleCarre * (path.get(path.size() - 1).get(1) + 1)))
				/ ((double) (tailleCarre * (tailleMaze + 1))));
		double coorEndY = 1 - ((double) (tailleCarre * (path.get(path.size() - 1).get(0) + 1))
				/ (double) (tailleCarre * (tailleMaze + 1)));
		double radiusCircle = (((double) tailleCarre / 3) / (double) (tailleCarre * (tailleMaze + 1)));
		StdDraw.filledCircle(coorEndX, coorEndY, radiusCircle);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.circle(coorEndX, coorEndY, radiusCircle);
		StdDraw.text(coorEndX + 0.002, coorEndY - 0.005, "E");

	}

	public void drawEverything() {
		drawPath();
		showStartEnd();
		drawCol();
		drawColCot();
		drawRow();
		drawRowCot();
	}
}
