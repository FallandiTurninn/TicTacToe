package is.ru.hugb;

import static spark.Spark.*;

public class TicTacToeRender implements GameRender {

	private TicTacToe ttt;

	@Override
	public void setup() {
		port(getHerokuPort());
		get("/", (req, res) -> "Crazy test");
        get("/ttt", (req, res) -> "Tic Tac Toe");
	}

	@Override
	public void render(int state) {
		
	}

	public TicTacToeRender(Game ttt) {
		this.ttt = (TicTacToe) ttt;
	}
	
	private static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
		if (psb.environment().get("PORT") != null) {
			return Integer.parseInt(psb.environment().get("PORT"));
		}
		return 4567;
    }
	
}
			
