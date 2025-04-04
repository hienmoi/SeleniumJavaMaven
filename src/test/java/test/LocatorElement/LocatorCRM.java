package test.LocatorElement;

public class LocatorCRM {

    //Login Page
    public static String headerLogin = "//h1[normalize-space() = 'Login']";
    public static String inputEmail = "//input[@id = 'email']";
    public static String inputPassword = "//input[@id = 'password']";
    public static String checkboxRememberMe = "//input[@id = 'remember']";
    public static String buttomLogin = "//button[normalize-space() = 'Login']";
    public static String linkFogotPassword = "public static String";
    public static String alertErrorMessage = "//div[normalize-space() = 'Invalid email or password' and @class = 'text-center alert alert-danger']";

    //Dashboard page
    public static String menuDashBoard = "//span[normalize-space() = 'Dashboard']";
    public static String iconProfile = "//li[contains(@class , 'icon header-user-profile')]/descendant::img";
    public String totalInvoicesAwaitingPayment = "(//span[normalize-space() = 'Invoices Awaiting Payment']/parent::div)/following-sibling::span";
    public String totaConvertedLeads = "(//span[normalize-space() = 'Converted Leads']/parent::div)/following-sibling::span";


    //Customer page

}
