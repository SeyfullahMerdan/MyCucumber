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

    @FindBy (linkText = "href=\"/s?bbn=16225009011&rh=i%3Aspecialty-aps%2Cn%3A%2116225009011%2Cn%3A541966&ref_=nav_em__nav_desktop_sa_intl_computers_and_accessories_0_2_5_6\"")
    public WebElement computer;













}
