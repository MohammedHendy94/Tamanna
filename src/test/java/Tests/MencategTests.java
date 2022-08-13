package Tests;

import Pages.Mencateg;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MencategTests {


    Mencateg mencat;
    @When("open men category")
    public void open_men_category() {
        //mencat = new Mencateg();
        mencat.openmencat();
    }

    @When("choose the second product")
    public void choose_the_second_product() {
        mencat.choosesecondproduct();
    }

    @When("add the second product to the cart")
    public void add_the_second_product_to_the_cart() {

        mencat.addsecondproducttocart();

    }

    @And("choose the size")
    public void chooseTheSize() {
        mencat.choosethesize();
    }

    @Then("user navigate to the shopping screen")
    public void navigateToTheShoppingScreen() {
        mencat.gotoshopping();
    }
}
