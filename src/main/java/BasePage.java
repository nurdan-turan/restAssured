import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    //By allTabLocator = By.xpath("//div[@id=\"TÜMÜ\"]");
    //By newsTabLocator = By.xpath("//div[@id=\"HABERLER\"]");
    //By newsImageLocator = new By.ByClassName("media-left");
    //By imageLocator = By.xpath("//img[contains(@src,\"jpg\") or contains(@src,\"png\") or  contains(@src,\"jpeg\") or  contains(@src,\"gif\")]");
    By imageLocator = By.tagName("img");


    WebDriver driver ;

    public BasePage(WebDriver driver){
        this.driver = driver ;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator , String text){
        find(locator).sendKeys(text);
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }
}
