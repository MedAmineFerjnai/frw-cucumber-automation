Feature: rejister test
  user story : en tant que utilisteur je souhaite me faire registration

  @Registration
  Scenario: rejister test
    Given Je me connecte sur l application Merc
    When je click sur le button register
    And Je saisi le first name "mohamed amine"
    And je saisi le last name "ferjani"
    And je saisi le Tel "20568854"
    And je saisi email "med@gmail.com"
    And je saisi adresse "tunisie manouba mornaguia"
    And je saisi city "mornaguia"
    And je saisi State Province "manouba"
    And je saisi le code postal "1110"
    And je choisie le country "TUNISIA"
    And Je saisie le Username "test 1"
    And Je saisie le passeword "test 1"
    And Je saisie le confirm password "test 1"
    And Je click sur le button submit
    Then Je me redirige a la page home "Note: Your user name is test 1."
