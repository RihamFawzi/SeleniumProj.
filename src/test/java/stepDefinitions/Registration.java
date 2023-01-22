package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserRegistrationPage;

public class Registration extends TestBase {

	HomePage homeObject;
	UserRegistrationPage registerObject;
	String firstName = "Reham";
	String lastName = "Fawzy";
	String email = "Rehamfawzy001@gmail.com";
	String oldPassword = "123456";

	@Given ("user opens the website")
	public void user_open_Website () {
		homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
	}

	@When ("user clicks on RegistrationLink")
	public void the_user_click_on_register_link() {

		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
	}

	@And ("user enters RequiredData")
	public void user_enter_required_data() {

		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegistration(firstName, lastName, email, oldPassword);

	}
	
	@Then ("user successfully registered")
	public void user_can_register_successfully() {
		
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		registerObject.retrunToHomePage();
	}

}
