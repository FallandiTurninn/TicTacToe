package is.ru.hugb;

import static spark.Spark.*;

public class TicTacToe {
	public static void main(String[] args) {
		get("/", (req, res) -> sayHi());
	}
	
	public static String sayHi() {
		return "Hi!";
	}
}
			
