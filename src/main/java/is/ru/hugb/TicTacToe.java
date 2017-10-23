package is.ru.hugb;

import static spark.Spark.*;

public class TicTacToe {
	public static void main(String[] args) {
		port(getHerokuPort());
		get("/", (req, res) -> sayHi());
        get("/bye", (req, res) -> sayBye());
	}
	
	static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
		if (psb.environment().get("PORT") != null) {
			return Integer.parseInt(psb.environment().get("PORT"));
		}
		return 4567;
    }
	
	public static String sayHi() {
		return "Hi!";
	}
    
    public static String sayBye() {
        return "Bye!";
    }
}
			
