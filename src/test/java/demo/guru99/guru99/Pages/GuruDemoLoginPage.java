package demo.guru99.guru99.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuruDemoLoginPage extends BasePageBanus {

    //locate : username,password,Login and Guru99 Bank text
    @FindBy(xpath = "//h2[@class='barone']")
    public WebElement headerText;
    @FindBy(xpath = "//input[@name='uid']")
    public WebElement loginBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//input[@name='btnLogin']")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@name='btnReset']")
    public WebElement resetButton;

    public String headerTextIsDisplayed(){

        return headerText.getText();
    }
    public void loginGuruDemo(String userId, String password){

        loginBox.sendKeys(userId);
        passwordBox.sendKeys( password);
        loginButton.click();
    }


}
