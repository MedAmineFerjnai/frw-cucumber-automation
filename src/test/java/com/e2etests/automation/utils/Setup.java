package com.e2etests.automation.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.cucumber.java.Before;

public class Setup {

	private static WebDriver driver;

	/**
	 * This method is used to open browser. This method is called before the
	 * invocation of each test method in the given class. In this method we need to
	 * pass browser name which will invoke the respective driver.
	 *
	 * @throws MalformedURLException the malformed URL exception
	 * @Before Methods annotated with @Before will execute before every scenario.
	 */

	@Before
	public void setWebDriver() {
		;

		String browcer = System.getProperty("browcer"); // Ici null, si non ("browser", "chrome");("browser", "firefox");

		if (browcer == null) {
			browcer = "chrome";
		}
		switch (browcer) {

		case "chrome":

			ChromeOptions chromeoptions = new ChromeOptions();

			driver = new ChromeDriver(chromeoptions);
			driver.manage().window().maximize();
			break;

		case "firefox":

			FirefoxProfile profile = new FirefoxProfile();
			FirefoxOptions fireFoxOptions = new FirefoxOptions();
			fireFoxOptions.setCapability("platform", Platform.WIN10);
			fireFoxOptions.setProfile(profile); // Supplementary Options comme options
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		// vous pouvez effectivement débuter avec un if et ensuite, au lieu de
		// continuer avec une chaîne de else-if, utiliser un switch pour les autres
		// conditions.
			
		default:

			throw new IllegalArgumentException("browcer \"" + browcer + "\" is not supported.");

		}
		
		
	}

/*GETTER*/
public static WebDriver getDriver() {
	return driver;
}

}


