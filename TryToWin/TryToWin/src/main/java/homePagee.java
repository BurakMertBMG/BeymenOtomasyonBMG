import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class homePagee extends BasePage {

    By cartContainerLocator = new By.ByCssSelector("a[href='/cart'] span");
    By increaseProduct = By.id("quantitySelect0");

    searchBoxPage searchBoxPage;

    public homePagee(WebDriver driver) {
        super(driver);
        searchBoxPage = new searchBoxPage(driver);
    }

    public searchBoxPage searchBox() {
        return this.searchBoxPage;

    }


    public void goToCart() throws InterruptedException {
        click(cartContainerLocator);
        WebElement priceBasket = driver.findElement(new By.ByCssSelector(".m-productPrice__salePrice"));
        String priceTextt = priceBasket.getText();
        System.out.println("Price in the cart:" + priceTextt);


            WebElement increaseCartProducts = driver.findElement(By.id("quantitySelect0"));
            increaseCartProducts.click();
            //increaseCartProducts.clear();
            increaseCartProducts.sendKeys("2");
            increaseCartProducts.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.findElement(By.id("removeCartItemBtn0")).click();

    }
}
