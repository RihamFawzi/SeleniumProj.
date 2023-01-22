package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ProductDetailsPage;

public class DifferentTagSelection extends TestBase {

	ProductDetailsPage productObject;


	@And ("user can select different tag") 
	public void user_can_select_different_tag() {


		productObject = new ProductDetailsPage(driver);
		productObject.selectTagOnPage();

	}

	@Then ("selected tag is displayed")
	public void selected_tag_is_displayed() {

		Assert.assertTrue(driver.getCurrentUrl().contains("jewelry-2"));
	}

}
