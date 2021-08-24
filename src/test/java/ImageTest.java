import com.google.gson.JsonParser;
import com.image.request.model.ImageRequest;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertEquals;

public class ImageTest extends BaseTest {

    FindImagePage findImagePage;
    List<Object> pageUrl;

    @Test
    @Order(2)
    @Disabled
    public void show_Total_URL(){

        System.out.println("Toplam Web Page Url Sayısı : " + pageUrl.size());

    }

    @Test
    @Order(3)
    @Disabled
    void do_Request_URL() throws InterruptedException {

                for (Object url : pageUrl) {
                    System.out.println("Web Page Url Adı :  " + url );
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.get((String) url);
                    findImagePage = new FindImagePage(driver);
                    Thread.sleep(5000);
                    //findImagePage.getImageCount();
                    findImagePage.showImageCount();
                    findImagePage.getImageName();
                    driver.quit();
                }

    }

    @Test
    @Order(1)
    public  void AuthenticationTest() throws InterruptedException {

        RestAssured.baseURI = "http://172.18.4.41:9200/web-images-tr-210608/_search";

        RequestSpecification request = RestAssured.given();

        String request_Body =   "{\r\n" +
                            "\"_source\": {\r\n" +
                            "\"includes\": [\r\n" +
                            "\"pageUrl\"\r\n" +
                            "]\r\n  },\r\n" +
                            "\"size\": 9999\r\n" +
                            "}";


        request.header("Content-Type","application/json");

        Response addBooksResponse = request.body(request_Body)
                .auth()
                .basic("username", "sıfre")
                .when()
                .get("url");

        try{

            List<Object> pageUrl = addBooksResponse.jsonPath().getList("hits.hits._source.pageUrl");

            System.out.println(pageUrl);
            System.out.println("Toplam Web Page Url Sayısı : " + pageUrl.size());

            for (Object url : pageUrl) {
                System.out.println("Web Page Url Adı :  " + url );
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get((String) url);
                findImagePage = new FindImagePage(driver);
                Thread.sleep(5000);
                //findImagePage.getImageCount();
                findImagePage.showImageCount();
                findImagePage.getImageName();
                driver.quit();
            }

        }catch (Exception e){
            
            System.out.println(e);
            Reporter.log("hata bulundu" + e);
        }

        Assertions.assertEquals(200, addBooksResponse.getStatusCode());


    }

}





