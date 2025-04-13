package LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathTuyetDoi {
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
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("admin@example.com");
        Thread.sleep(1000);
        //Điền pass
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
        Thread.sleep(1000);
        //Click login
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/button")).click();
        Thread.sleep(2000);
        //Tắt trình duyệt
        driver.quit();
    }
}
