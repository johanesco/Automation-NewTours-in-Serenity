package com.newtourspagesobject;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/mercurysignon.php")
public class NewToursPagesObjectLogin extends PageObject {

	@FindBy(name = "userName")
	WebElementFacade user;

	@FindBy(name = "password")
	WebElementFacade pass;
	
	@FindBy(name ="login")
	WebElementFacade btnSubmit;
	
	@FindBy(xpath ="//a[contains(text(),'SIGN-OFF')]")
	WebElementFacade singOff;
	
	
	public void loginNewTours(String usuario,String password) {
		typeInto(user, usuario);
		typeInto(pass, password);
	}
	
	
	public void clickOnSubmit() {
		clickOn(btnSubmit);
	}
	
	public void singOff() {
		singOff.shouldBeVisible();
	}
}
