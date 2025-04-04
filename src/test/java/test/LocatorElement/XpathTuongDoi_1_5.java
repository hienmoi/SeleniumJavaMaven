package test.LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class XpathTuongDoi_1_5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");

        System.out.println(driver.findElement(By.xpath("//button[normalize-space()='Login']")).getText());
        System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Email Address']")).getText());
        System.out.println(driver.findElement(By.xpath("//label[contains(normalize-space(),'Address')]")).getText());
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//li[2]//span[contains(@class, 'menu-text')]")).getText());
        System.out.println(driver.findElement(By.xpath("//a[starts-with(@href, '#home')]")).getText());
        System.out.println(driver.findElement(By.xpath("//a[normalize-space() = 'My Tasks']")).getText());
        //Thread.sleep(2000);

        driver.quit();
    }
}
