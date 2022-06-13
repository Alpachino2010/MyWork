package pages;

import baseclass.BaseClass;
import helper.log;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homepageTest extends BaseClass
{
    public homepageTest()
    {
        super();
    }
    homepage H1;

    @BeforeClass
    void setUp()
    {
        H1= new homepage(driver);
        //log.startTestCase("Start homepageTest");

    }

    @Test(enabled=false)
    void clickHomeLogo() throws InterruptedException {
        H1.clickLogo();
    }

    @Test(enabled=false)
    void clickCategory(){
        H1.clickCategory("category-3");

    }
    /*@Test(enabled=false)
    void scroll()
    {
        Reporter.log("We used Google Chrome Ver 80 for this test");
        //Assert.assertEquals(true, true);

           H1.scrollToBottom();
//        action.rightClick(driver.findElement(By.id("rightClickBtn")));
    }*/

    @Test(enabled=false)
    void  clickLogin() throws InterruptedException
    {
        //log.info("Click on Login");
        H1.clickLogin();
    }
    @Test
    void clickProduct()
    {
        H1.featureProduct();
    }

    //@AfterClass
    //public void tearDown() throws InterruptedException
    //{
    //og.endTestCase("End homepageTest");
    // super.tearDown();
    // }

}

