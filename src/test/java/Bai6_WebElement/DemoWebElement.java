package Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import LocatorElement.LocatorCRM;

import java.time.Duration;

public class DemoWebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("aadmin@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).sendKeys("123456");
        //driver.findElement(By.xpath(LocatorCRM.buttomLogin)).click();

        //System.out.println(driver.findElement(By.xpath(LocatorCRM.alertErrorMessage)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getCssValue("background-color"));
        System.out.println(driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getAttribute("type"));
        System.out.println(driver.findElement(By.xpath(LocatorCRM.inputEmail)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getSize());
        System.out.println(driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getSize().height);
        System.out.println(driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getCssValue("weight"));
        System.out.println(driver.findElement(By.xpath(LocatorCRM.buttonLogin)).getLocation());
        //        driver.get("https://anhtester.com/");
//        System.out.println("isDisplayed: " + driver.findElement(By.xpath("//h1[normalize-space() = 'Anh Tester Automation Testing']")).isDisplayed());
//        System.out.println("isDisplayed: " + driver.findElement(By.xpath("//a[@id = 'btn-login']")).isDisplayed());
        driver.quit();
    }
}
