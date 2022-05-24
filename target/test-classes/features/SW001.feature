
 Feature: 001_Exercise1


   Scenario Outline: bei Google ein Produkt Recherchieren

     Given der Benutzer geht zur Seite "GoogleUrl"
     And der Benutzer schreibt "<ersteProdukt>" in das Benutzersuchfeld ein
     When der Benutzer klickt auf das Benutzersuchfeld
     Then der Benutzer überprüft,ob das Ergebnis "<ersteProdukt>" enthält


     Examples:
       | ersteProdukt |
       | Apple        |