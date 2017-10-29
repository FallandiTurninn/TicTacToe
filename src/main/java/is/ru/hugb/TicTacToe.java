package is.ru.hugb;

public class TicTacToe {

	/**
     * Block state is 0 if empty, 1 if X is placed or 2 if O is placed
     */
	private int[][] data;

	/**
     * 1 if x, 2 if O
     */
	private int currentPlayer;

	/**
     * Gets total moves of the two players
     */
	private int totalMoves;

	/**
     * The size of the grid (grdSize x gridSize)
     */
	private int gridSize;

	/**
     * Sets up the board, current player and total moves
     */
	public void setup() {
		data = new int[gridSize][gridSize];
		currentPlayer = 1;
		totalMoves = 0;
	}

	/**
     * New instance of TicTacToe with the ability to choose the grid size
     * Setup must be called before the game can start.
     *
     * @param gridSize the size of the gameboard grid
     */
	public TicTacToe(int gridSize) {
		this.gridSize = gridSize;
	}

	/**
     * Sets the state of a block with a certain id. The state set depends on the current player
     *
     * @param id the id of the block in the game grid which needs to change.
     * @return false if the block already has a state, true if not.
     */
	public boolean setBlockState(int id) {
		// Don't update if block state is already set
		if (getBlockState(id) > 0) {
			return false;
		}
		int row = getRow(id, gridSize);
		int column = getColumn(id, gridSize); 
		data[row][column] = currentPlayer;
		currentPlayer = getNextPlayer(currentPlayer);
		totalMoves++;
		return true;
	}

	/**
     * Returns the state of an individual block with a set row and column based on id
     *
     * @param id the id of the block in the gameboard trying to fetch.
     *  @return the row and column of the block.
     */
	public int getBlockState(int id) {
		int row = getRow(id, gridSize);
		int column = getColumn(id, gridSize); 
		return data[row][column];
	}

	/**
     * Checks the state of the game whether either player has won or need to keep going.
     * 
     * @return the state of the game. 0 = keep going, 1 = X wins, 2 = O wins, 3 = tie
     */
	public int getState() {
		// Diaogonal counters
		int countSide1 = 0;
		int countSide2 = 0;
		// We only need to check the last player's move
		// I get the next player as the last player is the next player
		int lastPlayer = getNextPlayer(currentPlayer);
		for (int i = 0; i < data.length; i++) {
			// Vertical and horizontal counters
			int countRow = 0;
			int countColumn = 0;
			// Check the diagonal line starting from coordinates (0, 0)
			if (data[i][i] == lastPlayer) {
				countSide1++;
			}
			// Check the diagonal line starting from coordinates (0, gridSize - 1)
			if(data[i][data.length - i - 1] == lastPlayer) {
				countSide2++;
			}
			for (int j = 0; j < data[i].length; j++) {
				// Check for a vertical line
				if (data[j][i] == lastPlayer)  {
					countRow++;
				}
				// Check for a horizontal line
				if (data[i][j] == lastPlayer)  {
					countColumn++;
				}
			}
			// Check if a player has one horizontally and vertically
			if (countRow == gridSize || countColumn == gridSize) {
				return lastPlayer;
			}
		}

		// Check if a player has one diagonally
		if (countSide1 == gridSize || countSide2 == gridSize) {
			return lastPlayer;
		}

		// Check for a tie
		if (totalMoves == gridSize * gridSize) {
			return 3;
		}
		// Game is still going
		return 0;
	}

	/**
     * Returns the row of a cell based on the id and the grid size
     *  
     * @param id id of the block inside the boardgame
     * @param gridSize the size of the grid
     * @return id/gridSize
     */	
	private static int getRow(int id, int gridSize) {
		return id / gridSize;
	}

	/**
     * Returns the column of a cell based on the id and grid size
     *  
     * @param id id of the block inside the boardgame
     * @param gridSize the size of the grid
     * @return id % gridSize
     */
	private static int getColumn(int id, int gridSize) {
		return id % gridSize;
	}

	/**
     * Return the player next up in the game
     * 
     * @param player the id of player
     */
	private static int getNextPlayer(int player) {
		return player == 1 ? 2 : 1;
	}

}
			
