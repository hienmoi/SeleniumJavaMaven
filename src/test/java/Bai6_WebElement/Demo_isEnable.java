package Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_isEnable {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");

       boolean submit = driver.findElement(By.xpath("//button[normalize-space() = 'Submit']")).isEnabled();
        System.out.println(submit);
        boolean hackedButton = driver.findElement(By.xpath("//button[normalize-space() = '\"Hacked\" Submit button']")).isEnabled();
        System.out.println(hackedButton);


        driver.quit();
    }
}
