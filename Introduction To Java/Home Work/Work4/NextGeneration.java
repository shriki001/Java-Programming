package Work4;
public class NextGeneration {

	public static boolean isInside(boolean[][] cells, int x, int y) {
		boolean p = false;
		if (x >= 0 && x < cells.length && y >= 0 && y < cells[0].length)
			p = true;
		return p;
	}

	public static boolean checkCell(boolean[][] cells, int x, int y) {
		int a = numberOfNeighbors(cells, x, y);
		if (!cells[x][y] && a == 3)
			return true;
		else if (cells[x][y] && (a == 2 || a == 3))
			return true;
		else
			return false;
	}

	public static int numberOfNeighbors(boolean[][] cells, int x, int y) {
		int count = 0;
		if (cells[x][y])
			count--;
		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++)
				if (isInside(cells, i, j) && cells[i][j])
					count++;
		}
		return count;
	}

	public static boolean[][] nextGeneration(boolean[][] cells) {
		boolean[][] new_cells = new boolean[cells.length][cells[0].length];
		for (int i = 0; i < cells.length; i++)
			for (int j = 0; j < cells[0].length; j++)
				if (checkCell(cells, i, j))
					new_cells[i][j] = true;
				else
					new_cells[i][j] = false;
		return new_cells;
	}
}
