package is.ru.hugb;

import static spark.Spark.*;

public class TicTacToe {
	public static void main(String[] args) {
		port(getHerokuPort());
		get("/", (req, res) -> sayHi());
        get("/bye", (req, res) -> sayBye());
	}
	
	public static String sayHi() {
		return "Hi!";
	}
    
    public static String sayBye() {
        return "Bye!";
>>>>>>> e0d1cddd07eb3b7c3146b419a62bddb8a189c4c7
    }
}
			
