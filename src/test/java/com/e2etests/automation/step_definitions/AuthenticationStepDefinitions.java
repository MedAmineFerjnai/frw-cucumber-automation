package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.e2etests.automation.page_objects.AuthenticationPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinitions {

	public WebDriver driver;
	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinitions() {

		this.authenticationPage = new AuthenticationPage();

	}

	@Given("Je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {

		authenticationPage.goToURL();
	}

	@When("Je saisi le Username {string}")
	public void jeSaisiLeUsername(String name) {

		authenticationPage.fillUserName(name);

	}

	@When("je saisi le password {string}")
	public void jeSaisiLePassword(String passWord) {

		authenticationPage.fillPassword(passWord);
	}

	@When("je clique sur le button Submit")
	public void jeCliqueSurLeButtonSubmit() {

		authenticationPage.clickSubmit();

	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {

		String message = authenticationPage.welcomeMessage.getText();

		assertEquals(text, message);

	}

}
