import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindImagePage extends BasePage {

    List<WebElement> myElements = driver.findElements(imageLocator);

    public FindImagePage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnSerpNewsPage() {
        return isDisplayed(imageLocator);
    }

    public List<WebElement> getAllProducts(){

        return  findAll(imageLocator);
    }

    public int getImageCount() {

        System.out.println(getAllProducts().size());
        return getAllProducts().size();
    }

    public void getImageName(){
        List<WebElement> elementList =driver.findElements(imageLocator);
        for(int i=0; i<elementList.size(); i++){
            System.out.println((i+1) + ".Image Linki -->  "+elementList.get(i).getAttribute("src"));

            //System.out.println((i+1) + ".Image Başlığı -->  "+elementList.get(i).getAttribute("alt"));

            //System.out.println(i + ".Image Başlığı -->  "+elementList.get(i).getAttribute("href"));

        }
        System.out.println("================================================================================");
    }



    public void showImageCount(){

        System.out.println("Toplam Image Sayısı : "+myElements.size());
        System.out.println("================================================================================");

    }

}
