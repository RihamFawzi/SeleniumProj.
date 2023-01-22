package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.ProductDetailsPage;

public class DifferentColorSelection extends TestBase {

	ProductDetailsPage productObject;

	@Then ("user can filter with color")
	public void user_can_filter_with_color() {

		productObject = new ProductDetailsPage(driver);
		productObject.filterWithColor();
	}

}
