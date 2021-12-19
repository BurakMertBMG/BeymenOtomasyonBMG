import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends BasePage{


    By addToCarButtonLocator = By.id("addBasket");
    By selectSizeOfProduct = new By.ByCssSelector(".m-variation span");
    By price = By.id("priceNew");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }


    public void addToCart() throws InterruptedException {
       WebElement price = driver.findElement(By.id("priceNew"));
       priceText = price.getText();
       System.out.println("Price before the cart:" + priceText);


        click(selectSizeOfProduct);
        Thread.sleep(1000);
        click(addToCarButtonLocator);


    }
}
