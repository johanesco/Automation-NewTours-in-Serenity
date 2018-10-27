package com.newtours.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="resources/features",
				glue="com.newtours.stepsdefinitions")
public class NewToursTestRunner {

}
