package org.stepdef;

import org.basemethods.BaseClass;
import org.openqa.selenium.WebElement;

import com.pom.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseClass {
	BaseClass c = new BaseClass();
	@Given("user needs to launch {string} on chrome")
	public void user_needs_to_launch_on_chrome(String string) throws InterruptedException {
		driverInitiate("chrome");
		launchUrl(string);
		
	}

	@When("user needs to enter valid username {string} and valid password {string}")
	public void user_needs_to_enter_valid_username_and_valid_password(String string, String string2) {
		LoginPage l = new LoginPage();
		 c.passText(l.getUsername(), string);
		 c.passText(l.getPassword(), string2);
	}

	@When("user needs to click on the login button")
	public void user_needs_to_click_on_the_login_button() {
		LoginPage l = new LoginPage();
		c.elementClick(l.getLoginBtn());
	}

	@Then("user needs to validate login functionality")
	public void user_needs_to_validate_login_functionality() {
		System.out.println("Login Validated!!!");
	}

}
