package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProductDetailsPage;

public class MenusHover extends TestBase {

	HomePage homeObject;
	ProductDetailsPage productObject;


	@When ("user hover category and select subcategory")
	public void user_hover_category_and_select_subcategory () {

		homeObject = new HomePage(driver);
		homeObject.selectApparelMenu();

	}

	@Then ("subcategory is displayed")
	public void subcategory_is_displayed() {

		Assert.assertTrue(driver.getCurrentUrl().contains("shoes"));

	}
}

