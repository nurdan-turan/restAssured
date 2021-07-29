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

public class BaseTest {
    WebDriver driver ;

    Response response = given()
            .auth()
            .basic("user", "12345")
            .when()
            .get("basic_url");

    List<Object> pageUrl = response.jsonPath().getList("hits.hits._source.pageUrl");
}
