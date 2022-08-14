package Pages;

import Bases.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ShoppingBag extends Base {

    // This class actually contains the shopping bag category page elements and methods which handle these elements to be used in test cases

    // A method to delete the first added element
    public static void deletefirstproduct(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement delet1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/button/span"));
        delet1.click();
    }
    // A method to delete the second added element
    public static void deletesecondproduct(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement delet2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button/span"));
        delet2.click();
    }

    // A method to get the first displayed price
    public static Float getthefirstprice(){
        WebElement Firstprice = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/p"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String firstprice = Firstprice.getText();
        String price1digits = firstprice.replaceAll("[A-Za-z]", "");
        Float price1 = Float.parseFloat(price1digits);
        System.out.println(price1);
        return price1;
    }

    // A method to get the second displayed price
    public static Float getthesecondprice(){
        WebElement Secondprice = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/div/div/p"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String secondprice = Secondprice.getText();
        String price2digits = secondprice.replaceAll("[A-Za-z]", "");
        Float price2 = Float.parseFloat(price2digits);
        System.out.println(price2);
        return price2;
    }

    // A method to get the total displayed price
    public static Float getthetotalprice(){
        WebElement Totalprice = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/p[2]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String totalprice = Totalprice.getText();
        String totalpricedigits = totalprice.replaceAll("[A-Za-z]", "");
        Float TotalPrice = Float.parseFloat(totalpricedigits);
        System.out.println(TotalPrice);
        return TotalPrice;
    }
    // A method to return to the home page

    public static void backtohome(){
        driver.get("");
    }

}
