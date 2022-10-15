package demo.guru99.guru99.Base;


import demo.guru99.guru99.Banus_Utilities.BrowserUtilBAnu;
import demo.guru99.guru99.Banus_Utilities.WebDriverBanush;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class Test_Base {
    WebDriver driver;
    @BeforeMethod
    public void setup(){

    WebDriverBanush.getDriver().manage().window().maximize();
    WebDriverBanush.getDriver().manage().deleteAllCookies();
    WebDriverBanush.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    //WebDriverBanush.getDriver().get(PropertiesReadingUtilBanus.getProperties("Guru_Url"));


        }                                                              //
    @AfterMethod
    public void closing() throws InterruptedException {

        BrowserUtilBAnu.staticWait(5);
       //  WebDriverBanush.closingDriver();
        }


    }
