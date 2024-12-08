import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class taskAutomate {

    @Test
    public void InputAllField() throws Exception {
        WebDriver webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().window().maximize();

        webDriver.get("https://www.cermati.com/app/gabung");

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));

        webDriver.findElement(By.id("mobilePhone")).sendKeys("0823456789");
        webDriver.findElement(By.id("email")).sendKeys("test@gmail.com");
        webDriver.findElement(By.id("firstName")).sendKeys("Hansen Marcelino");
        webDriver.findElement(By.id("lastName")).sendKeys("Azali");


        WebElement clickDaftar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/main/div/div[2]/div/button")));
        clickDaftar.click();

        Thread.sleep(10000);
    }
}
