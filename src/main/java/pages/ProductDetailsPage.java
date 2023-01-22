package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (id= "attribute-option-15")
	WebElement filterRedColor;

	@FindBy (linkText = "jewelry")
	WebElement jewelryTag;

	@FindBy (className = "button-2")
	WebElement addToCartBtn;
	
	@FindBy (css = "button[title=\"Add to wishlist\"]")
	WebElement addToWishlistBtn;
	
	@FindBy (css= "button[title=\"Add to compare list\"]")
	WebElement addToComparelistBtn;
	
	@FindBy (css = "p[class=\"content\"]")
	public WebElement validationMsg;


	public void filterWithColor () {
		filterRedColor.click();

	}

	public void selectTagOnPage () {
		jewelryTag.click();
	}

	public void addToWishlist () {
		addToWishlistBtn.click();
	}
	
	public void addToCart () {
		addToCartBtn.click(); 
	}
	
	public void addtoComparelist () {
		addToComparelistBtn.click();
	}
}