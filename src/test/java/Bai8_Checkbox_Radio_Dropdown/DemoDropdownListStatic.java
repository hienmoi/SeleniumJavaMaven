package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DemoDropdownListStatic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("https://demoqa.com/select-menu");

        Thread.sleep(2000);
        //Scroll chuột đến element
        WebElement element = driver.findElement(By.xpath("//div[@class = 'col-md-6 col-sm-12' and normalize-space() = 'Old Style Select Menu']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //Tạo class Select từ Selenium
        Select select = new Select(driver.findElement(By.xpath("//select[@id= 'oldSelectMenu']")));

        Thread.sleep(2000);
        //Select option theo text hiển thị
        //select.selectByContainsVisibleText("Blue");

        //Select option theo value
        //select.selectByValue("2");

        //Select option theo index
        select.selectByIndex(7);
        Thread.sleep(1000);

        //Get giá trị sau khi đã chọn
        System.out.println(select.getFirstSelectedOption().getText());

        Thread.sleep(1000);
        closeDriver();

    }
}
