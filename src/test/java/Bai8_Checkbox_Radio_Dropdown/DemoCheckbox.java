package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import org.openqa.selenium.By;
import LocatorElement.LocatorCRM;

public class DemoCheckbox extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        loginCRM();

        driver.findElement(By.xpath(LocatorCRM.menuTask)).click();
        driver.findElement(By.xpath(LocatorCRM.buttonNewTask)).click();

        Thread.sleep(2000);

        //click vào checkbox
        driver.findElement(By.xpath("//input[@id = 'task_is_public']")).click();

        //Kiểm tra checkbox đã dđược click hay chưa
        boolean isSelected = driver.findElement(By.xpath("//input[@id = 'task_is_public']")).isSelected();
        System.out.println("isSelected is: " + isSelected);

        //Nếu chưa được click thì click vào checkbox
        if (isSelected == false){
            driver.findElement(By.xpath("//input[@id = 'task_is_public']")).click();
        }

        Thread.sleep(2000);
        closeDriver();
    }
}
