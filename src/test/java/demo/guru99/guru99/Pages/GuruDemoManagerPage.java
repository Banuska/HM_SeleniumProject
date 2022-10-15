package demo.guru99.guru99.Pages;

import demo.guru99.guru99.Banus_Utilities.BrowserUtilBAnu;
import demo.guru99.guru99.Banus_Utilities.WebDriverBanush;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GuruDemoManagerPage extends BasePageBanus{

    //Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
    //Step 5) Click on new customer button and verify you are in New Customer Entry Page

        @FindBy(xpath = "//td[.='Manger Id : mngr443151']")
        public WebElement managerIdText;
        @FindBy(xpath = "//a[text()='New Customer']")
        public WebElement newCustomerLink;

        public String HomePageTextVerification(){

            return managerIdText.getText();
        }
        public void clickNewCustomerLink(){

            newCustomerLink.click();
            BrowserUtilBAnu.staticWait(3);
            Actions actions=new Actions(WebDriverBanush.getDriver());
            actions.moveByOffset(0,0).click().build().perform();
        }




}
