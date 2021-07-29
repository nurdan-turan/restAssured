import com.google.gson.JsonParser;
import com.image.request.model.ImageRequest;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertEquals;

public class ImageTest extends BaseTest {

    FindImagePage findImagePage;

    @Test
    @Order(1)
    public void show_Total_URL(){

        System.out.println("Toplam Web Page Url Sayısı : " + pageUrl.size());

    }



    @Test
    @Order(2)
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
}





