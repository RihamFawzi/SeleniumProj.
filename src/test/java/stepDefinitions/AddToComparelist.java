package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class AddToComparelist extends TestBase {
	SearchPage searchObject;
	ProductDetailsPage productObject;
	
	
	@And ("user add product to compare list")
	public void user_add_product_to_compare_list() {
		productObject =new ProductDetailsPage(driver);
		productObject.addtoComparelist();
		Assert.assertTrue(productObject.validationMsg.getText().contains("The product has been added to your product comparison"));
	}
	
	@Then ("user can add different products to compare list")
	public void user_can_add_different_products_to_compare_list() {
		searchObject = new SearchPage(driver);
		searchObject.productSearch("Nokia Lumia 1020");
		productObject.addtoComparelist();
		Assert.assertTrue(productObject.validationMsg.getText().contains("The product has been added to your product comparison"));

	}	
}
