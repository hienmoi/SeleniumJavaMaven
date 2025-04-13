package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DemoRadioButton extends BaseTest {
    public static void main(String[] args) throws InterruptedException {

        createDriver();
        loginCRM();

        driver.findElement(By.xpath("//span[@class = 'menu-text' and normalize-space() = 'Sales' ]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class = 'sub-menu-text' and normalize-space() = 'Proposals' ]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@class, 'new-proposal-btn')]")).click();

        //scroll đến element
        WebElement element = driver.findElement(By.xpath("//input[@type='radio' and @id = '1']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);

        //Chọn Hours
        driver.findElement(By.xpath("//input[@type='radio' and @id = '2']")).click();
        Thread.sleep(1000);

        //Kiểm tra radio button đã được chọn hay chưa
        boolean isSeleted = driver.findElement(By.xpath("//input[@type='radio' and @id = '2']")).isSelected();

        if (isSeleted == true){
            System.out.println("Đã chọn");
        }else {
            System.out.println("Chưa chọn");
        }

        closeDriver();
    }
}
