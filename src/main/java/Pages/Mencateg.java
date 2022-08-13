package Pages;

import Bases.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Mencateg extends Base {


    public static void openmencat(){
        WebElement Mencat = driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
        Mencat.click();
    }

    public static void choosesecondproduct(){
      //  driver.navigate().refresh();

        WebElement product2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div/div[6]/div/div/div[2]/div/div/div/ul/li[1]/div/div[1]/div[1]/a/div/span"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        product2.click();
/*
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("arguments[0].click();", product2);
        /*
        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
        w.until(ExpectedConditions.presenceOfElementLocated (product2));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("arguments[0].click();", product2);
*/
    }

    public static void choosethesize (){
        WebElement choosesize = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/button[2]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        choosesize.click();
    }


    public static void addsecondproducttocart(){
        WebElement addsecondtocart = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div/div[2]/button"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        addsecondtocart.click();

    }
    public static void gotoshopping(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.tamanna.com/cart");
        /*
        WebElement gotoshopping = driver.findElement(By.xpath("//a[contains(text(),'Go to shopping bag')]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("arguments[0].click();", gotoshopping);
       // gotoshopping.click();
       */

    }

}
