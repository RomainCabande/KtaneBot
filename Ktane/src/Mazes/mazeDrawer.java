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
					//System.out.println("[" + currentX + ";" + currentY + "][" + goToX + ";" + goToY + "]");
					//StdDraw.show();
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
					double currentY = 1 - ((double) (i * tailleCarre + tailleCarre +((double) tailleCarre / 2))
							/ (double) (tailleCarre * (tailleMaze + 1)));
					double goToX = ((double) (j * tailleCarre + ((double) tailleCarre / 2) + tailleCarre)
							/ (double) (tailleCarre * (tailleMaze + 1)));
					double goToY = 1 - ((double) (i * tailleCarre + tailleCarre + ((double) tailleCarre / 2))
							/ (double) (tailleCarre * (tailleMaze + 1)));

					StdDraw.line(currentX, currentY, goToX, goToY);
					//System.out.println("[" + currentX + ";" + currentY + "][" + goToX + ";" + goToY + "]");
					//StdDraw.show();
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
		System.out.println(path.size());
		StdDraw.setPenColor(StdDraw.BLUE);
		for(int i = 0; i < path.size(); i++) {
			double coorX = (((double)(tailleCarre * (path.get(i).get(1)+ 1))) / ((double) (tailleCarre * (tailleMaze + 1))));
			double coorY = 1 - ((double)(tailleCarre * (path.get(i).get(0) + 1)) / (double) (tailleCarre * (tailleMaze + 1)));
			double radiusSquare = ((((double) tailleCarre/2) - 2) / (double) (tailleCarre * (tailleMaze + 1)));
			StdDraw.filledCircle(coorX, coorY, radiusSquare);
			System.out.println(path.get(i).get(1) + ";" + path.get(i).get(0));
			System.out.println(coorX + ";" + coorY);
		}
	}

	public void drawEverything() {
		drawPath();
		drawCol();
		drawColCot();
		drawRow();
		drawRowCot();
	}
}
