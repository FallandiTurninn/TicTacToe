package is.ru.hugb;

import static spark.Spark.*;

public class TicTacToe {
	public static void main(String[] args) {
		port(getHerokuPort());
		get("/", (req, res) -> sayHi());
	}
	
	public static String sayHi() {
		return "Hi!";
	}
	
	static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
		if (psb.environment().get("PORT") != null) {
			return Integer.parseInt(psb.environment().get("PORT"));
		}
		return 4567;
    }
}
			
