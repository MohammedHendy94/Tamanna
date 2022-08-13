package Pages;

import Bases.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ShoppingBag extends Base {

    public static void deletefirstproduct(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement delet1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div/button/span"));

        delet1.click();
    }
    public static void deletesecondproduct(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement delet2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button/span"));

        delet2.click();
    }

    public static String getthefirstprice(){
        WebElement Firstprice = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/p"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String firstprice = Firstprice.getText();
        System.out.println(firstprice);
        return firstprice;
    }

    public static String getthesecondprice(){
        WebElement Secondprice = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/div/div/p"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String secondprice = Secondprice.getText();
        System.out.println(secondprice);
        return secondprice;
    }
    public static String getthetotalprice(){
        WebElement Totalprice = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/p[2]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String totalprice = Totalprice.getText();
        System.out.println(totalprice);
        return totalprice;
    }
    public static void backtohome(){
        driver.get("");
    }

}
