
/**
 * This class represents a pair of coordinates.
 * 
 * @author Curt Clifton. Created Sep 24, 2008.
 */
public class Cell {
	private int row;
	private int column;

	private int maxRow;
	private int maxColumn;

	/**
	 * Constructs a coordinate pair.
	 * 
	 * @param row
	 * @param column
	 */
	public Cell(int row, int column, GameBoard gameBoard) {
		this.row = row;
		this.column = column;
		this.maxRow = gameBoard.getMaxRows();
		this.maxColumn = gameBoard.getMaxColumns();
	}

	/**
	 * @return the row of this pair
	 */
	public int getRow() {
		if (this.row < 0) {
			this.row = this.maxRow - this.row;
		} else {
			this.row = this.row % maxRow;
		}
		return this.row;
	}

	/**
	 * @return the column of this pair
	 */
	public int getColumn() {
		if (this.column < 0) {
			this.column = this.maxColumn - this.column;
		} else {
			this.column = this.column % maxColumn;
		}

		return this.column;
	}

}
