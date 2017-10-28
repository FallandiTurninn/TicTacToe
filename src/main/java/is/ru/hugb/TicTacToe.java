package is.ru.hugb;

public class TicTacToe implements Game {

	private byte[][] data;

	@Override
	public void setup() {
		data = new byte[3][3];
	}

	@Override
	public int loop() {
		// 0 continue
		// -1 exit
		return 0;
	}

	public TicTacToe() {
		
	}

}
			
