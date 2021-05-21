package Components;

import org.apache.http.HttpStatus;
import org.json.JSONObject;
import system.RestAssuredBase;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

public class components {

    String pointDelete;

    public components(String url){
        RestAssuredBase.setup(url);
        pointDelete = url;
    }

    public void endpointReturn(){
        get().then().log().status().log().body();
    }

    public void validationPath(String path, String value){
        get().then().body(path, is(value));
    }

    public void validationSchema(){
        get().then().body(matchesJsonSchemaInClasspath("JsonValidation.json"));
    }

    public void postEndpoint(){
        JSONObject json = new JSONObject();
        json.put("name","Rachel Berry");
        json.put("username", "RBerry");

        given().body(json).when().post("/users").then().statusCode(HttpStatus.SC_CREATED);
    }

    public void updateEndpoint(){
        JSONObject json = new JSONObject();
        json.put("name","Bob Esponja");
        json.put("username", "BobEsponja");

        given().body(json).when().put().then().statusCode(HttpStatus.SC_OK);
    }

    public void deleteEndpoint(){
        when().delete(pointDelete).then().body(is("{}"));
    }
}
