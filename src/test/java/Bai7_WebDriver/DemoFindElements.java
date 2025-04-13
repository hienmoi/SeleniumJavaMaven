package Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import LocatorElement.LocatorCRM;

import java.time.Duration;
import java.util.List;

public class DemoFindElements {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCRM.buttonLogin)).click();

        List<WebElement> Listmenu = driver.findElements(By.xpath("//ul[@id = 'side-menu']/li[contains(@class, 'menu-item')]"));

        System.out.println(Listmenu.size());

        for (int i = 0 ; i < Listmenu.size() ; i++ ){
            System.out.println(Listmenu.get(i).getText());
        }

        driver.quit();

    }
}
