import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestTest {

    public static Response doGetRequest(String endpoint) {
        RestAssured.defaultParser = Parser.JSON;

        return
                given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                        when().get(endpoint).
                        then().contentType(ContentType.JSON).extract().response();
    }

    public static void main(String[] args) {
          Response response = doGetRequest("https://jsonplaceholder.typicode.com/users");
                 //List<String> jsonResponse = response.jsonPath().getList("$");
                 //System.out.println(jsonResponse.size());

        List<Object> name = response.jsonPath().getList("username");

        System.out.println(name.get(1));

        for (Object item : name){
            System.out.println(item);
        }


    }
}