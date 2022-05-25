package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {

    public GooglePage() { PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id = "L2AGLb")
    public WebElement cookie;

    @FindBy (xpath = "//input[@name='q']")
    public WebElement benutzersuchfeld;

    @FindBy (xpath = "(//input[@class=\"gNO89b\"])[2]")
    public WebElement sucheButton;









}
