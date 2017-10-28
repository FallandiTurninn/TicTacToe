package is.ru.hugb;

import static spark.Spark.*;
import spark.ModelAndView;
import java.util.HashMap;
import java.util.Map;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class WebUI {
    
    public static void main(String[] args) {
        // Creates a 3x3 tic tac toe board
        TicTacToe ttt = new TicTacToe(3);

        port(getHerokuPort());
        staticFileLocation("/public");
        
        // main site
        get("/", (req, res) -> {
            ttt.setup();
            return new ModelAndView(null, "board.hbs"); 
        }, new HandlebarsTemplateEngine());
        
        // post function which gets called after every 'move' in tic tac toe
        post("/move", (req, res) -> {
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

    /**
     * Returns the heroku port
     **/
    private static int getHerokuPort() {
        ProcessBuilder psb = new ProcessBuilder();
		if (psb.environment().get("PORT") != null) {
			return Integer.parseInt(psb.environment().get("PORT"));
		}
		return 4567;
    }
}