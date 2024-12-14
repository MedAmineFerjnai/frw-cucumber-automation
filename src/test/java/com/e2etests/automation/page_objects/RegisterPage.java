package com.e2etests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;
import java.time.Duration;

public class RegisterPage {

	private ConfigFileReader configFileReader;
	public WebDriverWait wait;
	public JavascriptExecutor executor;

	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='REGISTER']")
	public static WebElement rejisterBtn;

	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement fname;

	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lname;

	@FindBy(how = How.NAME, using = "phone")
	public static WebElement numeroTel;

	@FindBy(how = How.XPATH, using = "//input[@id='userName']")
	public static WebElement email;

	@FindBy(how = How.NAME, using = "address1")
	public static WebElement adresseHome;

	@FindBy(how = How.NAME, using = "city")
	public static WebElement cityC;

	@FindBy(how = How.NAME, using = "state")
	public static WebElement stateC;

	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement codePostal;

	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public static WebElement userName;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement passe;

	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPasse;

	@FindBy(how = How.NAME, using = "submit")
	public static WebElement submitBtn;

	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Note: Your user name is test 1.']")
	public static WebElement messageRegis;

	public RegisterPage() {

		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
		this.wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		this.executor = (JavascriptExecutor) Setup.getDriver();

	}
	/* Create Method */

	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	public void clickRejister() {

		rejisterBtn.click();
	}

	public void fillFisrtName(String first) {

		fname.sendKeys(first);
	}

	public void fillLastName(String last) {

		lname.sendKeys(last);
	}

	public void fillTel(String tel) {

		numeroTel.sendKeys(tel);
	}

	public void fillEmail(String mail) {

		email.sendKeys(mail);
	}

	public void fillAdresse(String adresse) {

		adresseHome.sendKeys(adresse);
	}

	public void fillCity(String city1) {

		cityC.sendKeys(city1);
	}

	public void fillState(String state1) {

		stateC.sendKeys(state1);
	}

	public void fillCodePostal(String code) {

		codePostal.sendKeys(code);
	}

	public void choisieCountry(String country1) throws InterruptedException {

		Thread.sleep(5000);
		Select dropDownList = new Select(country);

		dropDownList.selectByValue(country1);

		// wait.until(ExpectedConditions.elementToBeClickable(country));

		// executor.executeScript("arguments[0].click();", country);
		// DropDownList.selectByValue("TUNISIA");

	}

	public void fillUser(String user) {

		userName.sendKeys(user);

	}

	public void fillPasseWord(String pWord) {

		passe.sendKeys(pWord);

	}

	public void fillConfirmPasseWord(String confirm) {

		confirmPasse.sendKeys(confirm);

	}

	public void clickSubmitBtn() {

		submitBtn.click();
	}

}
