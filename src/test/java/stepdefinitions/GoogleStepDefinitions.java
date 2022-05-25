package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Reusable;

public class GoogleStepDefinitions {

    GooglePage googlePage=new GooglePage();


    @Given("der Benutzer geht zur Seite {string}")
    public void der_benutzer_geht_zur_seite(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
        Reusable.waitFor(3);
        googlePage.cookie.click();
    }


    @Given("der Benutzer schreibt {string} in das Benutzersuchfeld ein")
    public void der_benutzer_schreibt_in_das_benutzersuchfeld_ein(String string) {
        googlePage.benutzersuchfeld.sendKeys(string);
    }


    @When("der Benutzer klickt auf das Benutzersuchfeld")
    public void der_benutzer_klickt_auf_das_benutzersuchfeld() {
        googlePage.sucheButton.click();
    }


    @Then("der Benutzer überprüft,ob das Ergebnis {string} enthält")
    public void der_benutzer_überprüft_ob_das_ergebnis_enthält(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
        System.out.println("Bestanden!");
    }


    @Then("der Benutzer schließt die Webseite")
    public void derBenutzerSchließtDieWebseite() {
        Driver.closeDriver();
    }

}
