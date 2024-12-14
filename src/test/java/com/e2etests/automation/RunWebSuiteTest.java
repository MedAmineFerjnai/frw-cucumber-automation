package com.e2etests.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


/**
* The Test Runner File uses the @RunWith() Annotation from JUnit for executing tests.
*/


/**
* The @CucumberOptions Annotation is used to define the location of feature files, step definitions, reporting
* integration.
*/

@RunWith(Cucumber.class)

@CucumberOptions(
		
	features = 	{"src/spec/features"}, //tu peut mettre nom specifie, comme authentication.feature
	plugin = {"pretty","html:target/cucumber-report.html"}, //Rapport : mnathem / de type HTML wathaka esmo wblasa
	//glue = {.com.e2etests.automation.step_definitions"},
	tags = ("@Module_register"), //tags de spec, en place de  @tag1
	monochrome = true,   // organise rapport et resultat en console
	snippets = CAMELCASE //
	)

public class RunWebSuiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
