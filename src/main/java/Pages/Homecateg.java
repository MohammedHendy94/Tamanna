package Pages;

import Bases.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homecateg extends Base {


    WebElement product1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div/div/div[4]/div/div/div[2]/div/div/div/ul/li[1]/div/div[4]/div[1]/a/div/span"));
    public void chooseproduct1 (){product1.click();}
}
