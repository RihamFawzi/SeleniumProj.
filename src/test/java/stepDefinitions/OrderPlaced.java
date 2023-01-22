package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckOutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ShoppingCartPage;

public class OrderPlaced extends TestBase {
	
	HomePage homeObject;
	LoginPage loginObject;
	ShoppingCartPage shoppigCartObject;
	CheckOutPage checkOutObject;
	String email = "rehamfawzy@gmail.com";
	String newPassword= "12345678";

	@And ("user enter the valid email and new password")
	public void user_enter_the_valid_email_and_new_password() {
		homeObject = new HomePage(driver);
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userLogin_newPassword(email, newPassword);
	}
	
	@And ("user can click on checkout")
	public void user_can_click_on_checkout() {
		shoppigCartObject = new ShoppingCartPage(driver);
		shoppigCartObject.checkOut();
	}

	@Then ("user can order product successfully")
	public void user_can_order_product_successfully(){
		checkOutObject = new CheckOutPage(driver);
		checkOutObject.registeredUserCanCheckout("Egypt","Cairo", "16 Street", "1234", "01001010");  
		Assert.assertTrue(checkOutObject.orderProcessed_message.getText().contains("Your order has been successfully processed!"));

	}

}
