import com.google.gson.JsonObject;
import com.image.request.model.ImageRequest;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultsLog.class)

public class BaseTest {
    WebDriver driver ;

 /* Response response = given()
            .auth()
            .basic("yaani_elk_user", "Pass_971")
            .when()
            .get("http://172.18.4.41:9200/web-images-tr-210608/_search");

    List<Object> pageUrl = response.jsonPath().getList("hits.hits._source.pageUrl");
*/

}
