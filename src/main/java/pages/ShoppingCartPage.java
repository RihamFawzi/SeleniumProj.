package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ShoppingCartPage extends PageBase {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (name = "continueshopping")
	WebElement continueShoppingBtn;

	@FindBy (id = "checkout")
	WebElement checkOutBtn;

	@FindBy (id = "termsofservice")
	WebElement termsCheckbox;


	public void continueShopping () {
		continueShoppingBtn.click();
	}


	public void checkOut () {

		termsCheckbox.click();
		checkOutBtn.click();
	}


}