package is.ru.hugb;

import static spark.Spark.*;
import spark.ModelAndView;
import java.util.HashMap;
import java.util.Map;
import spark.template.handlebars.HandlebarsTemplateEngine;


public class WebUI {
    
    public static void main(String[] args) {
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
            /*
                Hér er hægt að setja inn kall í einhverja lógík.
                Hægt að dæla upplýsingum inn í model.
            */
            return new ModelAndView(model, "board.hbs");    
        }, new HandlebarsTemplateEngine());
        
        /*
            post aðgerð fyrir hvern leik 
        */
        post("/game/move", (req, res) -> {
            Map<String, String> model = new HashMap<>();
            
            String data = req.queryParams("column");
            
            /*
                Hér er hægt að setja inn kall í einhverja lógík.
                Hægt að dæla upplýsingum inn í model.
            */
             return data;
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