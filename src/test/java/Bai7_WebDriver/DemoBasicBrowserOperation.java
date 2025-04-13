package Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoBasicBrowserOperation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver; //Khai báo biến driver
        driver = new ChromeDriver(); //Khởi tạo trình duyệt
        driver.manage().window().maximize();//Phóng to trình duyệt
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to a page
        driver.navigate().to("http://anhtester.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id='btn-login']")).click();

// Điều hướng về lịch sử trang trước đó
        driver.navigate().back();
        Thread.sleep(2000);
// Làm mới trang hiện tại
        driver.navigate().refresh();
        Thread.sleep(2000);
// Điều hướng đến trang tiếp sau
        driver.navigate().forward();
        Thread.sleep(2000);
// Get the title of the page
        String title = driver.getTitle();
// Get the current URL
        String url = driver.getCurrentUrl();
// Get the current page HTML source
        String html = driver.getPageSource();

        driver.quit();
    }
}
