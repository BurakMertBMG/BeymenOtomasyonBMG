import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchBoxPage extends BasePage{

By searchBoxLocator = new By.ByCssSelector(".default-input");
By sumbitButtonLocator =new By.ByCssSelector(".o-header__search--btn");

    public searchBoxPage(WebDriver driver) {

        super(driver);
    }

    public void search(String text)
    {
        type(searchBoxLocator,text);
        click(sumbitButtonLocator);
    }
}
