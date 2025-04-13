package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import org.openqa.selenium.By;

import java.util.Base64;

public class DemoDropdownListDynamic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Thread.sleep(2000);

        //Click vào Dropdown category
        driver.findElement(By.xpath("//span[normalize-space() = 'Select a Country']")).click();

        //Search giá trị cần chọn
        driver.findElement(By.xpath("(//span[normalize-space() = 'Select a Country']/parent::a)/following-sibling::div//input")).sendKeys("Chile");

        //Click chọn giá trị
        driver.findElement(By.xpath("//li[normalize-space(.)='Chile']")).click();

        Thread.sleep(2000);
        closeDriver();
    }
}
