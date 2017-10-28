package is.ru.hugb;

import static spark.Spark.*;
import spark.ModelAndView;
import java.util.HashMap;
import java.util.Map;
import spark.template.handlebars.HandlebarsTemplateEngine;


public class WebUI {
    
    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe(3);

        port(getHerokuPort());
        staticFileLocation("/public");
        
        // main site
        get("/", (req, res) -> {
            return new ModelAndView(null, "start-game.hbs"); 
        }, new HandlebarsTemplateEngine());
        
        // post function to start a game from index
        post("/game", (req, res) -> {
            // gameMode is either 1 or 2. 
            String gameMode = req.queryParams("gameMode");
            ttt.setup(gameMode.equals("2"));
            return new ModelAndView(null, "board.hbs");    
        }, new HandlebarsTemplateEngine());
        
        // post function which gets called after every 'move' in tic tac toe
        post("/game/move", (req, res) -> {
            int id = Integer.parseInt(req.queryParams("id"));
            int state = ttt.getState();
            if(state > 0) {
                ttt.setup();
                return -1;
            }
            ttt.setBlockState(id);
            return (ttt.getState()) | (ttt.getBlockState(id) << 8);
        }); 
    }

    static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
		if (psb.environment().get("PORT") != null) {
			return Integer.parseInt(psb.environment().get("PORT"));
		}
		return 4567;
    }
}