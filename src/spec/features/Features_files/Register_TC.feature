@tag
Feature: Je rempli le formilaire
  Entant que utulisateur je souhaite remplir le formulaire afin de m enregistrer

  @Module_register
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l application Mercury
    When je click sur le button register
    When Je saisie un data dans le champs firstname"<firstname>"
    When Je saisie un data dans le champs lastname "<lastname>"
    When Je saisie un data dans le champs tel "<tel>"
    When Je saisie un data dans le champs email "<email>"
    When Je saisie un data dans le champs adresse "<adresse>"
    When Je saisie un data dans le champs city "<city>"
    When Je saisie un data dans le champs state "<state>"
    When Je saisie un data dans le champs code postal "<codepostal>"
    When Je saisie un data dans le champs country "<country>"
    When Je saisie un data dans le champs username "<username>"
    When Je saisie un data dans le champs passeword "<passeword>"
    When Je saisie un data dans le champs confirm passeword "<confirmpasseword>"
    When Je click sur le button submit
    When Je redirige a la page home "<home>"

    Examples: 
      | firstname | lastname |tel     |email        |adresse                   |city      |state   |codepostal|country|username|passeword|confirmpasseword|home                     |
      | ahmed     | hamza    |20568854|med@gmail.com|tunisie manouba mornaguia |mornaguia |manouba |1110      |TUNISIA|test1   |test2    |test2           |Your user name is test 1.|
      | amine     | ferjani  |20235586|maf@gmail.com|tunisie mornaguia         |mornaguia1|manouba2|1256      |TUNISIA|test1   |test2    |test2           |Your user name is test 1.|
|