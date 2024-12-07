
@tag
Feature: je verifie la page d autentification    
  user story : en tant que utilisteur je souhaite me connecter au site Mercury

  @connexion
  Scenario: je verifie la page d autentification 
  
Given Je me connecte sur l application Mercury 
When Je saisi le Username "test" 
And je saisi le password "test"
And je clique sur le button Submit

Then Je me redirige vers la page home "Login Successfully"