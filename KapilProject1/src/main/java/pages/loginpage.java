package pages;

import baseclass.BaseClass;
import helper.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class loginpage extends BaseClass
{
    @FindBy(xpath = "//input[@class=\"form-control\"]")
    private WebElement email;

    @FindBy(xpath = "//input[@class=\"form-control js-child-focus js-visible-password\"]")
    private WebElement password;

    @FindBy(xpath = "//button[@id=\"submit-login\"]")
    private WebElement loginBtn;

    public  loginpage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void loginPerform() throws InterruptedException
    {
        Reporter.log("onFinish method finished homepages");
        email.clear();
        email.sendKeys(super.pros.getProperty("userName"));
        password.sendKeys(super.pros.getProperty("password"));
        loginBtn.click();
        Thread.sleep(10000);
    }
}