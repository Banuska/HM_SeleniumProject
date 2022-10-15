package demo.guru99.guru99.Pages;


import demo.guru99.guru99.Banus_Utilities.WebDriverBanush;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class  BasePageBanus {



    WebDriverWait driverWait=new WebDriverWait(WebDriverBanush.getDriver(), Duration.ofSeconds(60));

    /*
    IN POM Design you need to have some structure for each page :
1.PageFactory.initElements(driver, this);
		-> It creates connection in between driver and object of the class.
2. @FindBy annotation to locate webElements.
		-> Using this FindBy annotation, help us to locate web elements.
3. Create methods related webElements
     */
    public BasePageBanus(){
        PageFactory.initElements(WebDriverBanush.getDriver(),this);
    }
}

