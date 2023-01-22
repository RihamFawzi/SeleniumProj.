package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class AddToWishlist extends TestBase {
	
	SearchPage searchObject;
	ProductDetailsPage productObject;
	
	
	@And ("user add product to Wishlist")
	public void user_add_product_to_Wishlist() {
		productObject =new ProductDetailsPage(driver);
		productObject.addToWishlist();
		Assert.assertTrue(productObject.validationMsg.getText().contains("The product has been added to your wishlis"));
	}
	
	@Then ("user can add different products to Wishlist")
	public void user_can_add_different_products_to_Wishlist() {
		searchObject = new SearchPage(driver);
		searchObject.productSearch("Nokia Lumia 1020");
		productObject.addToWishlist();
		Assert.assertTrue(productObject.validationMsg.getText().contains("The product has been added to your wishlis"));
	}

}
