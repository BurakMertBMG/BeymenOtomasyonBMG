import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    WebDriver driver;
    String priceText;
    String priceTextt;

    public BasePage(WebDriver driver)
    {
        this.driver=driver;
    }
                      // ORTAK METODLAR OLUŞTURULDU!!!


    // WEBELEMENT BULUYORUZ
    public WebElement find(By locator)
    {
        return driver.findElement(locator);
    }

    // Elementleri Listeliyoruz Rastgele Seçmek İçin
    public List<WebElement> findAll(By locator)
    {
        return driver.findElements(locator);
    }

    // Tıklama işlemleri için
    public void click(By locator)
    {
        find(locator).click();
    }

    // Yazı yazdırmak için
    public void type (By locator , String text)
    {
    find(locator).sendKeys(text);
    }

    // Ekranda olup olmadığımıza bakıyoruz
    public Boolean isDisplayed(By locator)
    {
        return find(locator).isDisplayed();
    }

}
