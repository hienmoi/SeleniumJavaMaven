package Bai7_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAdvanceBrowserOperation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://anhtester.com");
        System.out.println(driver.getWindowHandle());

        Thread.sleep(1000);

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(1000);

        driver.get("https://google.com");
        System.out.println(driver.getWindowHandle());
        Thread.sleep(1000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        System.out.println(driver.getWindowHandles());
        Thread.sleep(1000);

        driver.quit();
    }
}
