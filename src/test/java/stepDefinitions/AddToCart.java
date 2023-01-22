package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

public class AddToCart extends TestBase {
	
	HomePage homeObject;
	SearchPage searchObject;
	ProductDetailsPage productObject;
	ShoppingCartPage shoppigCartObject;
	
	
	@And ("user add product to cart")
	public void user_add_product_to_cart() {
		productObject =new ProductDetailsPage(driver);
		productObject.addToCart();
		Assert.assertTrue(productObject.validationMsg.getText().contains("The product has been added to your shopping cart"));
		
	}
	
	@And ("user navigate to shopping cart page")
	public void user_navigate_to_shopping_cart_page() {
		homeObject = new HomePage(driver);
		homeObject.openShoppingCartPage();
		
	}

	@And ("user can continue shopping")
	public void user_can_continue_shopping() {
		shoppigCartObject = new ShoppingCartPage(driver);
		shoppigCartObject.continueShopping();
	}
	
	@Then ("user can add different products")
	public void user_can_add_different_products () {
		searchObject = new SearchPage(driver);
		searchObject.productSearch("Nokia Lumia 1020");
		productObject.addToCart();
		Assert.assertTrue(productObject.validationMsg.getText().contains("The product has been added to your shopping cart"));
	}
}
