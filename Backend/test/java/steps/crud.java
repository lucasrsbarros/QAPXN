package steps;

import Components.components;
import io.cucumber.java.pt.*;
import io.restassured.RestAssured;

public class crud {

    components component;

    @Dado("que realizo GET na API {string}")
    public void queRealizoGETNaAPI(String url) {
        String fullURL;
        fullURL = RestAssured.baseURI = "http://jsonplaceholder.typicode.com/users" + url;
        //fullURL = RestAssured.baseURI = "https://reqres.in/api/users/" + url;
        component = new components(fullURL);
        component.endpointReturn();
    }

    @Quando("for efetuado um POST")
    public void forEfetuadoUmPOST() {
        component.postEndpoint();
    }
    @Quando("for realizado um PUT")
    public void forRealizadoUmPUT() {
        component.updateEndpoint();
    }
    @Então("verifico se foi realizado um DELETE")
    public void verificoSeFoiRealizadoUmDELETE() {
        component.deleteEndpoint();
    }

    //Get
    @Quando("for validado usuário {string} igual a {string}")
    public void forValidadoUsuárioIgualA(String path, String value) {
        component.validationPath(path,value);
    }
    @Então("verifico schema do retorno")
    public void verificoHttpCodeDoRetorno() {
        component.validationSchema();
    }

    //Get Schema
    @Então("valido POST no {string} com {string}")
    public void validoPOSTNoCom(String path, String value) {
        component.validationPath(path,value);
    }

}
