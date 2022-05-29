package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.Driver;
import utilities.Reusable;

public class AmazonStepDefinitions {

    AmazonPage amazonPage=new AmazonPage();
    Select select;
    Actions actions;

    @Given("der Benutzer klickt All menu")
    public void der_benutzer_klickt_all_menu() {

        amazonPage.allButton.click();


    }



    @Then("der Benutzer klickt Electronics")
    public void der_benutzer_klickt_electronics() {

      actions=new Actions(Driver.getDriver());
      actions.moveToElement(amazonPage.electronics).click().perform();



    }


    @Then("der Benutzer klickt Computers & Accessories")
    public void derBenutzerKlicktComputersAccessories() {

        actions=new Actions(Driver.getDriver());
        actions.moveToElement(amazonPage.computersAccessories).click().perform();


    }



}
