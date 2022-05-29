package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {

    public AutomationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id = "columns")
    public WebElement column;













}
