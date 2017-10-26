package is.ru.hugb;

public class TicTacToe implements Game {

	// The size of the grid size (GRID_SIZE x GRID_SIZE)
	private static final int GRID_SIZE = 3;

	// state 0 = empty, state 1 = X, state 2 = O
	private int[][] data;
	private int currentPlayer;
	private int totalMoves;

	@Override
	public void setup() {
		data = new int[GRID_SIZE][GRID_SIZE];
		currentPlayer = 1;
		totalMoves = 0;
	}

	@Override
	public int loop() {
		// 0 continue
		// -1 exit

		return 0;
	}

	public TicTacToe() {
		
	}

	// Sets the state of an individual block with a set row and column based on id
	public boolean setBlockState(int id) {
		if (getBlockState(id) > 0) {
			return false;
		}
		int row = getRow(id);
		int column = getColumn(id); 
		data[row][column] = currentPlayer;
		currentPlayer = currentPlayer == 1 ? 2 : 1;
		totalMoves++;
		return true;
	}

	// Returns the state of an individual block with a set row and column based on id
	public int getBlockState(int id) {
		int row = getRow(id);
		int column = getColumn(id); 
		return data[row][column];
	}


	// Returns the current state of the game. 0 = keep going, 1 = X wins, 2 = O wins, 3 = tie
	public int getState() {
		int countSide1 = 0;
		int countSide2 = 0;
		int lastPlayer = currentPlayer == 1 ? 2 : 1;
		for (int i = 0; i < data.length; i++) {
			int countRow = 0;
			int countColumn = 0;

			if(i == 0) {
				// side1
				if(data[i][0] == lastPlayer) {
					countSide1++;
				}
				// side 2
				if(data[i][2] == lastPlayer) {
					countSide2++;
				}
			} else if(i == 1) {
				if(data[i][1] == lastPlayer) {
					countSide1++;
					countSide2++;
				}

			} else if(i == 2) {
				// side2
				if(data[i][0] == lastPlayer) {
					countSide2++;
				}
				// side 1
				if(data[i][2] == lastPlayer) {
					countSide1++;
				}
			}
			for (int j = 0; j < data[i].length; j++) {
				// horizontal & vertical
				if (data[j][i] == lastPlayer)  {
					countRow++;
				}
				if (data[i][j] == lastPlayer)  {
					countColumn++;
				}

			}

			if(countRow == GRID_SIZE || countColumn == GRID_SIZE) {
				return lastPlayer;
			}
		}

		if(countSide1 == GRID_SIZE || countSide2 == GRID_SIZE) {
			return lastPlayer;
		}

		if(totalMoves == GRID_SIZE * GRID_SIZE) {
			return 3;
		}
		return 0;
	}

	public void reset() {

	}


	private static int getRow(int id) {
		return id / GRID_SIZE;
	}

	private int getColumn(int id) {
		return id % GRID_SIZE;
	}

}
			
