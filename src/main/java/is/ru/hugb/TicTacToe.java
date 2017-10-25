package is.ru.hugb;

public class TicTacToe implements Game {

	// state 0 = empty, state 1 = X, state 2 = O
	private int[][] data;
	private int currentPlayer;

	@Override
	public void setup() {
		data = new int[3][3];
		currentPlayer = 1;
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
		int xCountSide1 = 0;
		int oCountSide1 = 0;
		int xCountSide2 = 0;
		int oCountSide2 = 0;
		for (int i = 0; i < data.length; i++) {
			int xCountRow = 0;
			int oCountRow = 0;
			int xCountColumn = 0;
			int oCountColumn = 0;

			if(i == 0) {
				// side1
				if(data[i][0] == 1) {
					xCountSide1++;
				}

				if(data[i][0] == 2) {
					oCountSide1++;
				}

				// side 2
				if(data[i][2] == 1) {
					xCountSide2++;
				}

				if(data[i][2] == 2) {
					oCountSide2++;
				}
			} else if(i == 1) {
				if(data[i][1] == 1) {
					xCountSide1++;
					xCountSide2++;
				}
				if(data[i][1] == 2) {
					oCountSide1++;
					oCountSide2++;
				}
			} else if(i == 2) {
				// side2
				if(data[i][0] == 1) {
					xCountSide2++;
				}

				if(data[i][0] == 2) {
					oCountSide2++;
				}

				// side 1
				if(data[i][2] == 1) {
					xCountSide1++;
				}

				if(data[i][2] == 2) {
					oCountSide1++;
				}
			}


			for (int j = 0; j < data[i].length; j++) {

				// horizontal & vertical
				if (data[j][i] == 1)  {
					xCountRow++;
				}
				if (data[j][i] == 2)  {
					oCountRow++;
				}

				if (data[i][j] == 1)  {
					xCountColumn++;
				}
				if (data[i][j] == 2)  {
					oCountColumn++;
				}

			}

			if(xCountRow > 2 || xCountColumn > 2) {
				return 1;
			}
			if(oCountRow > 2 || oCountColumn > 2) {
				return 2;
			}
		}

		if(xCountSide1 > 2 || xCountSide2 > 2) {
			return 1;
		}
		if(oCountSide1 > 2 || oCountSide2 > 2) {
			return 2;
		}
		return 0;
	}

	public void reset() {

	}


	private static int getRow(int id) {
		return id / 3;
	}

	private int getColumn(int id) {
		return id % 3;
	}

}
			
