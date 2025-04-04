package Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.LocatorElement.LocatorCRM;

import java.time.Duration;

public class Demo_isSelected {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input [@id = 'remember']")).click();
        System.out.println(driver.findElement(By.xpath("//input [@id = 'remember']")).isSelected());

        driver.quit();
    }
}
