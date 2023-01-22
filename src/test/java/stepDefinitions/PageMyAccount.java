package stepDefinitions;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class PageMyAccount extends TestBase {
	
	HomePage homeObject;
	LoginPage loginObject;
	UserRegistrationPage registerObject;
	MyAccountPage myAccountObject;
	String firstName= "Reham";
	String lastName= "Fawzy";
	String email = "Rehamfawzy001@gmail.com";
	String oldPassword = "123456";
	String newPassword= "12345678";
	
	
	@Given ("The user enter my account link")
	public void The_user_enter_my_account_link() {
		
		homeObject = new HomePage(driver);
		homeObject.openMyAccountPage();
		myAccountObject = new MyAccountPage(driver);
		myAccountObject.openChangePassword();
	}
	
	@When ("The user click on change password and enter the new password") 
	public void The_user_click_on_change_password_and_enter_the_new_password() {
		
		
		myAccountObject.ChangePassword (oldPassword , newPassword);
	}
	
	@Then ("The user reset the password successfully")
	public void The_user_reset_the_password_successfully(){
		
		Assert.assertTrue(myAccountObject.result.getText().contains("Password was changed"));
	}
	
}

