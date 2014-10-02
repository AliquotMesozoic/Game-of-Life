/**
 * 
 */

/**
 * @author trittimo
 *
 */
public class GameBoard {
	private boolean[][] cells;

	private int rows;
	private int columns;

	public GameBoard(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;

		cells = new boolean[columns][rows];
	}

	public int getMaxRows() {
		return this.rows;
	}

	public int getMaxColumns() {
		return this.columns;
	}

	public Cell getNeighbors(Cell cell) {

		return null;
	}

}
