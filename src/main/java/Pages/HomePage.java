package Pages;

import Bases.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Base {

    WebElement HomeCateg = driver.findElement(By.xpath("/html/body/div/div/header/div[1]/nav/div/div[1]/div/a[5]"));

    public void OpenHomeCategory (){
        HomeCateg.click();
    }

    public static void addfirstproduct (){
        WebElement addtocart = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div/div[2]/button"));
        addtocart.click();}


}
