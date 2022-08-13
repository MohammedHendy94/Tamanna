package Bases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public Base() {
    }

    public static void launch_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tamanna.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }
}