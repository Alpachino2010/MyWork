package pages;

import baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginpageTest extends BaseClass
{
    loginpage L1;

    public loginpageTest()
    {
        super();
    }

    @BeforeClass
    void  init()
    {
        L1 = new  loginpage(driver);
        //Log.info("Start loginpageTest");
    }

    @Test
    void loginPerform() throws InterruptedException
    {
        L1.loginPerform();
    }
}


