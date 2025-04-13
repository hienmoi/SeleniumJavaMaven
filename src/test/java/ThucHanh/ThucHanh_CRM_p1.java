package ThucHanh;

import Common.BaseTest;
import LocatorElement.LocatorCRM;
import org.openqa.selenium.By;

public class ThucHanh_CRM_p1 extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        loginCRM();

        //Mở màn Customer
        driver.findElement(By.xpath(LocatorCRM.menuCustomer)).click();
        System.out.println(driver.findElement(By.xpath(LocatorCRM.headerCustomer)).getText());
        //Tạo mới customer
        driver.findElement(By.xpath(LocatorCRM.AddNewCustomer)).click();
        driver.findElement(By.xpath(LocatorCRM.inputCompany)).sendKeys("Đá quý 3");
        driver.findElement(By.xpath(LocatorCRM.inputPhone)).sendKeys("09876543");
        driver.findElement(By.xpath(LocatorCRM.inputVAT)).sendKeys("09876543");
        driver.findElement(By.xpath(LocatorCRM.inputWebsite)).sendKeys("https://crm.anhtester.com/admin/clients/client");
        driver.findElement(By.xpath(LocatorCRM.dropdownGroup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.inputSearchGroup)).sendKeys("VIP");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.optionVIP)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.dropdownGroup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.dropdownLanguage)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.optionVietnamese)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.inputAddress)).sendKeys("Hà Nội");
        driver.findElement(By.xpath(LocatorCRM.inputCity)).sendKeys("HN");
        driver.findElement(By.xpath(LocatorCRM.inputState)).sendKeys("Vui vẻ");
        driver.findElement(By.xpath(LocatorCRM.inputZipCode)).sendKeys("12345678");
        driver.findElement(By.xpath(LocatorCRM.dropdownCountry)).click();
        driver.findElement(By.xpath(LocatorCRM.inputSearchCountry)).sendKeys("Vietnam");
        driver.findElement(By.xpath(LocatorCRM.optionVietnam)).click();
        driver.findElement(By.xpath(LocatorCRM.buttonSave)).click();
        Thread.sleep(3000);

        //Kiểm tra customer đã tạo ở màn List customer
        driver.findElement(By.xpath(LocatorCRM.menuCustomer)).click();
        driver.findElement(By.xpath(LocatorCRM.searchListCustomer)).sendKeys("Đá quý 3");
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.itemCustomerFirst)).isDisplayed();
        driver.findElement(By.xpath(LocatorCRM.itemCustomerFirst)).getText();

        //Kểm tra customer mới add đúng thông tin đã nhập
        driver.findElement(By.xpath(LocatorCRM.itemCustomerFirst)).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath(LocatorCRM.inputCompany)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorCRM.inputPhone)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorCRM.inputVAT)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorCRM.inputWebsite)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorCRM.dropdownGroup)).getAttribute("title"));
        System.out.println(driver.findElement(By.xpath(LocatorCRM.dropdownLanguage)).getAttribute("title"));

        closeDriver();
    }

}
