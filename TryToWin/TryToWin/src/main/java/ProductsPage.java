import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{


By selectionRandomly = new By.ByCssSelector(".m-productImageList");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }



    public void selectProduct(int i)
    {
     getAllProducts().get(i).click();

    }

    private List<WebElement> getAllProducts()
    {
        return findAll(selectionRandomly);
    }

    public boolean isOnProductPage() {
        return true;
    }
}
