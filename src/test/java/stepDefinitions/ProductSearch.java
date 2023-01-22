package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SearchPage;

public class ProductSearch extends TestBase {

	SearchPage searchObject;

	@Given ("navigate to HomePage")
	public void navigate_to_HomePage () {

		driver.navigate().to("https://demo.nopcommerce.com/");
	}

	@And ("search for product in search box")	
	public void search_for_product_in_search_box () {

		searchObject = new SearchPage(driver);
		searchObject.productSearch("HTC One Mini Blue");
	}

	@Then ("product details appears")
	public void product_details_appears () {

		Assert.assertTrue(driver.getCurrentUrl().contains("HTC"));		
	}

}
