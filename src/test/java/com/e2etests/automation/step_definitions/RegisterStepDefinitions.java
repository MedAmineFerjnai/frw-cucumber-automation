package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.page_objects.RegisterPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RegisterStepDefinitions {

	public WebDriver driver;
	private RegisterPage registerPage;
	public WebDriverWait wait;

	public RegisterStepDefinitions() {

		this.registerPage = new RegisterPage();
		this.wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));

	}

	@Given("Je me connecte sur l application Merc")
	public void jeMeConnecteSurLApplicationMerc() {

		registerPage.goToUrl();
	}

	@When("je click sur le button register")
	public void jeClickSueLeButtonRegister() {

		registerPage.clickRejister();

	}

	@When("Je saisi le first name {string}")
	public void jeSaisiLeFirstName(String first) {

		registerPage.fillFisrtName(first);

	}

	@When("je saisi le last name {string}")
	public void jeSaisiLeLastName(String last) {

		registerPage.fillLastName(last);
	}

	@When("je saisi le Tel {string}")
	public void jeSaisiLeTel(String tel) {

		registerPage.fillTel(tel);

	}

	@When("je saisi email {string}")
	public void jeSaisiEmail(String mail) {

		registerPage.fillEmail(mail);
	}

	@When("je saisi adresse {string}")
	public void jeSaisieAdresse(String adresse) {

		registerPage.fillAdresse(adresse);

	}

	@When("je saisi city {string}")
	public void jeSaisieCity(String city1) {

		registerPage.fillCity(city1);

	}

	@When("je saisi State Province {string}")
	public void jeSaisieStateProvince(String state1) {

		registerPage.fillState(state1);

	}

	@When("je saisi le code postal {string}")
	public void jeSaisieCodePostal(String code) {

		registerPage.fillCodePostal(code);

	}

	@When("je choisie le country {string}")
	public void jeChoisieLeCountry(String country ) throws InterruptedException {

		registerPage.choisieCountry(country);

	}

	@When("Je saisie le Username {string}")
	public void jeSaisieLeUsername(String user) {

		registerPage.fillUser(user);

	}

	@When("Je saisie le passeword {string}")
	public void jeSaisieLePasseWord(String pWord) {

		registerPage.fillPasseWord(pWord);

	}

	@When("Je saisie le confirm password {string}")
	public void jeSaisieLeConfirmPasseWord(String confirm) {

		registerPage.fillConfirmPasseWord(confirm);

	}

	@When("Je click sur le button submit")
	public void jeClickSurLeButtonSubmit() {

		registerPage.clickSubmitBtn();

	}

	@Then("Je me redirige a la page home {string}")
	public void jeMeRedirigeALaPageHome(String textR) {

		wait.until(ExpectedConditions.visibilityOf(RegisterPage.messageRegis));
		String mes = RegisterPage.messageRegis.getText();

		assertTrue(mes.contains(textR));

	}

}