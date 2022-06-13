package pages;

import baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signuppage extends BaseClass
{
    @FindBy(xpath = "//a[@href=\"https://prestashop.webkul.com/ps17/ps-mobikul/gb/login?create_account=1\"]")
    private WebElement signup;

    @FindBy(xpath = "//input[@name=\"id_gender\" and @value=\"1\"]")
    private WebElement gender;

    @FindBy(xpath = "//input[@name=\"firstname\"]")
    private WebElement firstname;

    @FindBy(xpath = "//input[@name=\"lastname\"]")
    private WebElement lastname;

    @FindBy(xpath = "//input[@class=\"form-control\"][@name=\"email\"]")
    private WebElement Email;

    @FindBy(xpath = "//input[@class=\"form-control js-child-focus js-visible-password\"][@name=\"password\"]")
    private WebElement Password;

    @FindBy(xpath = "//input[@name=\"psgdpr\"][@value=\"1\"]")
    private WebElement checkbox;

    @FindBy(xpath = "//button[@class=\"btn btn-primary form-control-submit float-xs-right\"][@type=\"submit\"]")
    private WebElement save;

    public signuppage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void signupPerform() throws InterruptedException {
        signup.click();
        gender.click();
        firstname.sendKeys(super.pros.getProperty("firstname"));
        lastname.sendKeys(super.pros.getProperty("lastname"));
        Email.clear();
        Email.sendKeys(super.pros.getProperty("Email"));
        Password.clear();
        Password.sendKeys(super.pros.getProperty("Password"));
        checkbox.click();
        save.click();
        Thread.sleep(10000);
    }
}