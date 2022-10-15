package demo.guru99.guru99.Pages;

import com.github.javafaker.Faker;
import demo.guru99.guru99.Banus_Utilities.BrowserUtilBAnu;
import demo.guru99.guru99.Banus_Utilities.WebDriverBanush;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NewCustomerPage extends BasePageBanus {

    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerNameBox;
    @FindBy(xpath = "//input[@value='m']")
    public WebElement genderMale;
    @FindBy(xpath = "//input[@value='f']")
    public WebElement genderFemale;
    @FindBy(id = "dob")
    public WebElement birthOfDateBox;
    @FindBy(name = "addr")
    public WebElement addressBox;
    @FindBy(name ="city")
    public WebElement cityBox;
    @FindBy(name = "state")
    public WebElement stateBox;
    @FindBy(name = "pinno")
    public WebElement pinBox;

    @FindBy(name = "telephoneno")
    public WebElement mobileNumberBox;
    @FindBy(name ="emailid")
    public WebElement emailBox;
    @FindBy(name = "password")
    public WebElement passwordBox;
    @FindBy(xpath = "//input[@name='sub']")
    public WebElement submitButon;
    @FindBy(xpath = "//input[@name='res']")
    public WebElement resetButton;
    @FindBy(className ="heading3" )
    public WebElement customerRegisteredText;

    public String newCustomerPageVerification(){
        return WebDriverBanush.getDriver().getCurrentUrl();
    }
    public void customerInformationEntry(){
        Faker faker=new Faker();
        customerNameBox.sendKeys(faker.name().name());
        genderFemale.click();
        birthOfDateBox.sendKeys("2003");
        birthOfDateBox.sendKeys(Keys.TAB);
        birthOfDateBox.sendKeys("05");
        birthOfDateBox.sendKeys("05");
        addressBox.sendKeys(faker.address().streetAddress());
        cityBox.sendKeys(faker.address().cityName());
        stateBox.sendKeys(faker.address().state());
        pinBox.sendKeys(faker.number().digits(6));
        mobileNumberBox.sendKeys("4127457680");
        //mobileNumberBox.sendKeys(faker.phoneNumber().phoneNumber().replaceAll("-",""));
        emailBox.sendKeys(faker.internet().emailAddress());
        passwordBox.sendKeys(faker.internet().password());
        BrowserUtilBAnu.staticWait(4);
        submitButon.click();
    }
    public String NewCustomerRegisteredText(){
        return  customerRegisteredText.getText();
    }


}
