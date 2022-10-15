package demo.guru99.guru99.TestDemoGuru;


import demo.guru99.guru99.Banus_Utilities.PropertiesReadingUtilBanus;
import demo.guru99.guru99.Banus_Utilities.WebDriverBanush;
import demo.guru99.guru99.Base.Test_Base;
import demo.guru99.guru99.Pages.GuruDemoLoginPage;
import demo.guru99.guru99.Pages.GuruDemoManagerPage;
import demo.guru99.guru99.Pages.NewCustomerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuruDemoLogin extends Test_Base {

    GuruDemoManagerPage guruDemoManagerPage = new GuruDemoManagerPage();
    GuruDemoLoginPage guruDemoLoginPage = new GuruDemoLoginPage();
    NewCustomerPage newCustomerPage=new NewCustomerPage();
  
    @Test(priority = 1)
    public void TC1_demoGuruLogin() {

        WebDriverBanush.getDriver().get(PropertiesReadingUtilBanus.getProperties("demo.Guru_url"));
        String expectedHeader = "Guru99 Bank";
        String actualHeader = guruDemoLoginPage.headerTextIsDisplayed();
        Assert.assertEquals(actualHeader, expectedHeader, "Guru demo assertion is FAILED!!");
        guruDemoLoginPage.loginGuruDemo(PropertiesReadingUtilBanus.getProperties("Guru_UserName"),
                PropertiesReadingUtilBanus.getProperties("Guru_Password"));
        String expectedHomePageText = "Manger Id : mngr443151";
        String actualHomePageText = guruDemoManagerPage.HomePageTextVerification();
        // SoftAssert softAssert=new SoftAssert();
        // softAssert.assertTrue(actualHomePageText.contains(expectedHomePageText),"Actual text does not contain expected text ,Assertion is failed!!");
        //softAssert.assertAll();
        Assert.assertTrue(actualHomePageText.contains(expectedHomePageText), "Assertion failed");
        guruDemoManagerPage.clickNewCustomerLink();
        String expectedNewCustomerPageUrl = "https://demo.guru99.com/V4/manager/addcustomerpage.php";
        String actualNewCustomerPageUrl = newCustomerPage.newCustomerPageVerification();
        Assert.assertEquals(actualNewCustomerPageUrl, expectedNewCustomerPageUrl, "Assertion is Failed!!!");
        newCustomerPage.customerInformationEntry();
        String expectedCustomerRegisteredText = "Customer Registered Successfully!!!";
        String actualCustomerRegisteredText = newCustomerPage.NewCustomerRegisteredText();

        Assert.assertEquals(actualCustomerRegisteredText, expectedCustomerRegisteredText, "Assertion Failed!!!");

    }

}





