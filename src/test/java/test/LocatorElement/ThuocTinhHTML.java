package test.LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ThuocTinhHTML {
    public static void main(String[] args) throws InterruptedException {
        //Setup trình duyệt
        WebDriver driver; //Khai báo biến driver
        driver = new ChromeDriver(); //Khởi tạo trình duyệt
        driver.manage().window().maximize();//Phóng to trình duyệt
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//giới hạn thời gian chờ

        //Code auto thao tác
        //Mở website
        driver.get("https://crm.anhtester.com/admin/authentication");//Mở trang web
        Thread.sleep(1000);
        //Điền email
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        Thread.sleep(1000);
        //Điền pass
        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(1000);

        driver.findElement(By.tagName("button")).click();

        //driver.findElement(By.linkText("Forgot Password?")).click();
        //driver.findElement(By.partialLinkText("Password")).click();
        Thread.sleep(2000);
        //Click nút Login
//        driver.findElement(By.className("btn-primary")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.id("search_input")).sendKeys("Ahihi");
//        Thread.sleep(2000);


        //Tắt trình duyệt
        driver.quit();
    }
}
