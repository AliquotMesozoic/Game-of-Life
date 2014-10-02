import java.util.ArrayList;

/**
 * 
 */

/**
 * @author trittimo
 *
 */
public class GameBoard {
	private ArrayList<Cell> cells = new ArrayList<Cell>();

	private int rows;
	private int columns;

	public GameBoard(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}

	public int getMaxRows() {
		return this.rows;
	}

	public int getMaxColumns() {
		return this.columns;
	}

}
