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
         
        Map map = new HashMap();
        get("/", (req, res) -> {
            return new ModelAndView(null, "start-game.hbs"); 
        }, new HandlebarsTemplateEngine());
        
        /*
            post aðgerð til þess að hefja leik frá index
        */
        post("/game", (req, res) -> {
            Map<String, String> model = new HashMap<>();
            // gameMode er annað hvort 1 eða 2 fer eftir "one player" eða "two player"
            model.put("gameMode", req.queryParams("gameMode"));
            ttt.setup();
            return new ModelAndView(model, "board.hbs");    
        }, new HandlebarsTemplateEngine());
        
        /*
            post aðgerð fyrir hvern leik 
        */
        post("/game/move", (req, res) -> {
            int data = Integer.parseInt(req.queryParams("id"));
            int state = ttt.getState();
            if(state > 0) {
                ttt.setup();
                return -1;
            }
            ttt.setBlockState(data);
            return (ttt.getState()) | (ttt.getBlockState(data) << 8);
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