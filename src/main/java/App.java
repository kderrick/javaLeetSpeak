import java.util.*;
import static spark.Spark.*;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
        HashMap model = new HashMap();
        String userInput = request.queryParams("userInput");

        String results = App.leetTranslator(userInput);
        model.put("results", results);
        model.put("template", "templates/index.vtl");
        return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

  }


  public static String leetTranslator(String userString) {
    userString = userString.replace("I","1");
    userString = userString.replace("e","3");
    userString = userString.replace("o", "0");
    return userString.replace("s","z");
  }

}
