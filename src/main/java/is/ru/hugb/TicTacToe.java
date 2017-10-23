package is.ru.hugb;

import static spark.Spark.*;

public class TicTacToe {
	public static void main(String[] args) {
		get("/", (req, res) -> sayHi());
        get("/bye", (req, res) -> sayBye());
	}
	
	public static String sayHi() {
		return "Hi!";
	}
    
    public static String sayBye() {
        return "Bye!";
    }
}
			
