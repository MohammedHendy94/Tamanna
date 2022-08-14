package Tests;

import Pages.ShoppingBag;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

public class ShoppingBagTests {

    ShoppingBag shopbag ;


    @When("Validate the quantity and total price")
    public void validate_the_quantity_and_total_price() {
       Float price1 =   shopbag.getthefirstprice();
       Float Price2 = shopbag.getthesecondprice();
       Float total = price1 + Price2 ;
       Float TotalPrice = shopbag.getthetotalprice();
       Assert.assertEquals("Price Validation passed", total, TotalPrice);
    }
    @And("remove the products")
    public void remove_the_products() {
       // shopbag = new ShoppingBag();
        shopbag.deletefirstproduct();
     shopbag.deletesecondproduct();
    }
    @Then("back yo the home page")
    public void back_yo_the_home_page() {


    }

}
