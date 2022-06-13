package pages;

import baseclass.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class signuppageTest extends BaseClass {

    signuppage S1;

    public signuppageTest()
    {
        super();
    }

    @BeforeClass
    void init()
    {
        S1 = new signuppage(driver);
        System.out.println("Sign Up Test");
    }

    @Test
    void signupPerform() throws InterruptedException
    {
        S1.signupPerform();
    }
}