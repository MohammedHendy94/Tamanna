package Tests;

import Pages.Homecateg;
import io.cucumber.java.en.And;

public class HomecategTests {

    Homecateg homcat;

    @And("choose the first product")
    public void chooseTheFirstProduct() {

        homcat = new Homecateg();
        homcat.chooseproduct1();

    }

}
