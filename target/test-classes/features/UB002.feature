Feature: 002_Exercise

  Scenario Outline: bei Amazon ein Produkt wählen

    Given der Benutzer geht zur Seite "AmazonUrl"
    And der Benutzer klickt All menu
    Then der Benutzer klickt Electronics
    Then der Benutzer klickt Computers & Accessories
    When der Benutzer überprüft,ob das Ergebnis "<section>" enthält
    Then der Benutzer schließt die Webseite

    Examples:
      | section |
      | computers |