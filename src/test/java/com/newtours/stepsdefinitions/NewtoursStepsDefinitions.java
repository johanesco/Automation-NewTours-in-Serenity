package com.newtours.stepsdefinitions;

import com.newtoursloginsteps.NewToursLoginSteps;
import com.newtourspagesobject.NewToursPagesObjectLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NewtoursStepsDefinitions {
	@Steps
	NewToursLoginSteps loginSteps;
	
	@Given("the user open the browser in the login page of newtours.com")
	public void the_user_open_the_browser_in_the_login_page_of_newtours_com() {

		loginSteps.goToNewToursLogin();
	}

	@When("this user write the username (.*) in User Name: and the password (.*) in Password:")
	public void this_user_write_the_username_in_User_Name_and_the_password_in_Password(String user, String password) {
		loginSteps.writeUserAndPassword(user, password);
	}

	@When("the user presses click on the submit button")
	public void the_user_presses_click_on_the_submit_button() {
	loginSteps.clickOnSubmit();
	}

	@Then("the user should see the option (.*)")
	public void the_user_should_see_the_option(String option) {
	  loginSteps.watchSingOff();
	}


}
