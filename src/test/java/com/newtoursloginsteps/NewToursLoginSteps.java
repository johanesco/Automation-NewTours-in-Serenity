package com.newtoursloginsteps;

import com.newtourspagesobject.NewToursPagesObjectLogin;

import net.thucydides.core.annotations.Step;

public class NewToursLoginSteps {

	private NewToursPagesObjectLogin loginPage;
	
	@Step
	public void goToNewToursLogin()
	{
		loginPage.open();
		loginPage.getDriver().manage().window().maximize();
	}
	
	@Step
	public void writeUserAndPassword(String user,String password)
	{
	
		loginPage.loginNewTours(user, password);
	}
	
	@Step
	public void clickOnSubmit()
	{
		loginPage.clickOnSubmit();
	}
	
	@Step
	public void watchSingOff()
	{
		loginPage.singOff();
	}
}
