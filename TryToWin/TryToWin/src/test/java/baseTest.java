import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(ResultTest.class)


public class baseTest {
    WebDriver driver ;


    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.beymen.com/");
        driver.manage().window().maximize();


        // Hesabım Sekmesi Kontrol Ediliyor
        WebElement accountButton = driver.findElement(new By.ByCssSelector("a[href='/customer/order'] span"));
        accountButton.click();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

        //Favorilerim Sekmesi Kontrol Ediliyor
        WebElement myfavButton = driver.findElement(new By.ByCssSelector("a[href='/favorilerim'] span"));
        myfavButton.click();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

        // Sepetim Sekmesi Kontrol Ediliyor

        WebElement cartButton = driver.findElement(new By.ByCssSelector("a[href='/cart'] span"));
        cartButton.click();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

        // Alışverişe Devam Et Butonuna Tıklıyoruz
        WebElement contiuneButton = driver.findElement(new By.ByCssSelector(" [title='Alışverişe Devam Et']"));
        contiuneButton.click();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);



    }

    @AfterAll
    public void closeWebPage()
    {
       driver.quit();
    }

}
