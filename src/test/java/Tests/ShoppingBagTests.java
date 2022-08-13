package Tests;

import Pages.ShoppingBag;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingBagTests {

    ShoppingBag shopbag ;


    @When("Validate the quantity and total price")
    public void validate_the_quantity_and_total_price() {
      //  shopbag = new ShoppingBag();
        shopbag.getthefirstprice();
        shopbag.getthesecondprice();
        shopbag.getthetotalprice();
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
