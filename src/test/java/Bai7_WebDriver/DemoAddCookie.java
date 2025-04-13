package Bai7_WebDriver;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAddCookie {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        // Add a new cookie
        Cookie newCookie = new Cookie("sp_session", "f7ckunrgsbtu7vua0i7t30gdl41bpvgj");
        driver.manage().addCookie(newCookie);
        driver.navigate().refresh();

        Thread.sleep(2000);

        driver.quit();
    }
}
