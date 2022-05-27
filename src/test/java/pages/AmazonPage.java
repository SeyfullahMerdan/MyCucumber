package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "(//div[@class='nav-left'])[3]" )
    public WebElement allButton;

    @FindBy (xpath = "//a[@data-menu-id='5']")
    public WebElement electronics;

    @FindBy ( xpath = "//*[@id=\"hmenu-content\"]/ul[5]/li[7]/a" )
    public WebElement computersAccessories;













}
