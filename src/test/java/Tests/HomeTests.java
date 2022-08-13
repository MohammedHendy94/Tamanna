package Tests;

import Bases.Base;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeTests extends Base {

    HomePage hompag;
    @Given("user open home")
    public void user_open_home() {
      launch_browser();
    }
    @When("open home category")
    public void open_home_category() {

        hompag= new HomePage();
        hompag.OpenHomeCategory();

    }
    @Then("choose product")
    public void choose_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @And("add the first product to the cart")
    public void addTheFirstProductToTheCart() {
       // hompag= new HomePage();
        hompag.addfirstproduct();
    }
}
