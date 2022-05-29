package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.AutomationPage;
import utilities.Driver;

public class AutomationStepDefinitions {

    AutomationPage automationPage = new AutomationPage();
    JavascriptExecutor js;

    @And("der Benutzer prüft, ob er auf der Startseite ist.")
    public void derBenutzerPrüftObErAufDerStartseiteIst() {

        js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView()",automationPage.column);
        Assert.assertTrue(automationPage.column.isDisplayed());



    }



















}
