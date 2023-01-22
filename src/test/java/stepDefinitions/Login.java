package stepDefinitions;

import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Login extends TestBase {

	HomePage homeObject;
	LoginPage loginObject;
	String email = "rehamfawzy001@gmail.com";
	String oldPassword = "123456";
	String newPassword = "12345678";


	@Given ("The user click on login link")
	public void The_user_click_on_login_link () {
		
		homeObject = new HomePage(driver);
		homeObject.openLoginPage();
	}

	@When ("The user enter the valid email and password")
	public void The_user_enter_the_valid_email_and_password() {
		
		loginObject = new LoginPage(driver);
		loginObject.userLogin(email, oldPassword);
	}

	@Then("The user can login successfully")
	public void The_user_can_login_successfullye() {
		
		Assert.assertTrue(homeObject.myAccountLink.isDisplayed());

	}

}




