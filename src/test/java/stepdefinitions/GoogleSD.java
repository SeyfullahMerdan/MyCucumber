package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.GooglePage;

public class GoogleSD {

    GooglePage googlePage=new GooglePage();


    @Given("der Benutzer geht zur Seite {string}")
    public void der_benutzer_geht_zur_seite(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("der Benutzer schreibt {string} in das Benutzersuchfeld ein")
    public void der_benutzer_schreibt_in_das_benutzersuchfeld_ein(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("der Benutzer klickt auf das Benutzersuchfeld")
    public void der_benutzer_klickt_auf_das_benutzersuchfeld() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("der Benutzer überprüft,ob das Ergebnis {string} enthält")
    public void der_benutzer_überprüft_ob_das_ergebnis_enthält(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }















}
