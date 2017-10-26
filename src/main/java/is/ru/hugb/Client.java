package is.ru.hugb;

public class Client {

	public static void main(String[] args) {
		Game game = new TicTacToe(3);
		GameRender gameRender = new TicTacToeRender(game);
		game.setup();
		gameRender.setup();
		while(true) {
			int state = game.loop();
			gameRender.render(state);
			if(state < 0) {
				break;
			}
		}
	}
}
			
