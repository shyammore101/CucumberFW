package StepDefinitions;

import java.io.IOException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitions extends Base {

	@Given("User is on home page")
	public void user_is_on_Amazon_login_page() throws IOException {
		super.setUp();
		driver.get(property.getProperty("AppURL"));

	}

	@When("User navigate to login page")
	public void user_navigate_to_login_page() {
		loginPage.getDismiss().click();
		loginPage.getMyAccLink().click();
	}

	@And("User enters \"(.*)\" and \"(.*)\"")
	public void user_enters_username_password(String Username, String Password) {
		loginPage.getUsrname().sendKeys(Username);
		loginPage.getPwd().sendKeys(Password);
		loginPage.getLogInBtn().click();
		
	}
	
	

}
