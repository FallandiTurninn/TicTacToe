package is.ru.hugb;

public class TicTacToe implements Game {

	// state 0 = empty, state 1 = X, state 2 = O
	private int[][] data;
	private int currentPlayer;
	private int totalMoves;
	private int gridSize;

	@Override
	public void setup() {
		data = new int[gridSize][gridSize];
		currentPlayer = 1;
		totalMoves = 0;
	}

	@Override
	public int loop() {
		// 0 continue
		// -1 exit

		return 0;
	}

	public TicTacToe(int gridSize) {
		this.gridSize = gridSize;
	}

	// Sets the state of an individual block with a set row and column based on id
	public boolean setBlockState(int id) {
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

	// Returns the state of an individual block with a set row and column based on id
	public int getBlockState(int id) {
		int row = getRow(id, gridSize);
		int column = getColumn(id, gridSize); 
		return data[row][column];
	}


	// Returns the current state of the game. 0 = keep going, 1 = X wins, 2 = O wins, 3 = tie
	public int getState() {
		int countSide1 = 0;
		int countSide2 = 0;
		// We only need to check the last player's move
		// I get the next player as the last player is the next player
		int lastPlayer = getNextPlayer(currentPlayer);
		for (int i = 0; i < data.length; i++) {
			int countRow = 0;
			int countColumn = 0;

			// Check the diagonal line starting from coordinates (0, 0)
			if(data[i][i] == lastPlayer) {
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

			if(countRow == gridSize || countColumn == gridSize) {
				return lastPlayer;
			}
		}

		if(countSide1 == gridSize || countSide2 == gridSize) {
			return lastPlayer;
		}

		// Check for a tie
		if(totalMoves == gridSize * gridSize) {
			return 3;
		}
		return 0;
	}

	// Returns the row of a cell based on the id and the grid size
	private static int getRow(int id, int gridSize) {
		return id / gridSize;
	}

	// Returns the column of a cell based on the id and grid sizde
	private static int getColumn(int id, int gridSize) {
		return id % gridSize;
	}

	// Return the player next up in the game
	private static int getNextPlayer(int player) {
		return player == 1 ? 2 : 1;
	}

}
			
