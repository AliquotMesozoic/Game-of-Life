import java.util.ArrayList;

/**
 * This class represents a pair of coordinates.
 * 
 * @author Curt Clifton. Created Sep 24, 2008.
 */
public class Cell {
	private int row;
	private int column;

	/**
	 * Constructs a coordinate pair.
	 * 
	 * @param row
	 * @param column
	 */
	public Cell(int row, int column) {
		this.row = row;
		this.column = column;
	}

	/**
	 * @return the row of this pair
	 */
	public int getRow() {
		return this.row;
	}

	/**
	 * @return the column of this pair
	 */
	public int getColumn() {
		return this.column;
	}

	/**
	 * @return All of the neighbors of this cell
	 */
	public ArrayList<Cell> getNeighbors() {
		// TODO: Implement
		return null;
	}

}
