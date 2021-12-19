import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class baseTestDetail extends baseTest {

    homePagee homePagee;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    cartPage cartPage ;

    @Test
    @Order(1)
    public void search_a_product() throws InterruptedException {
        homePagee =new homePagee(driver);
        productsPage=new ProductsPage(driver);
        homePagee.searchBox().search("Pantolan");
        Assertions.assertTrue(productsPage.isOnProductPage() , "Not on products page!");
        Thread.sleep(1000);
    }

    @Test
    @Order(2)
    public void select_a_product() throws InterruptedException {
       productDetailPage= new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Thread.sleep(1000);

    }

    @Test
    @Order(3)
    public void add_product_to_cart() throws InterruptedException {
        productDetailPage.addToCart();
        Thread.sleep(1000);

    }

    @Test
    @Order(4)
    public void go_to_cart() throws InterruptedException {
        cartPage=new cartPage(driver);
        homePagee.goToCart();
        Thread.sleep(1000);

    }

}
