package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}

	@FindBy (linkText="Register")
	WebElement registerLink;

	@FindBy (linkText="Log in")
	WebElement loginLink;

	@FindBy (linkText = "My account")
	public WebElement myAccountLink;

	@FindBy (id= "customerCurrency")
	public WebElement changeCurrencies;

	@FindBy (linkText = "Apparel")
	WebElement ApparelsMenu;

	@FindBy (linkText = "Shoes")
	WebElement ShoesItem;

	@FindBy (linkText ="Shopping cart")
	WebElement shoppingCartLink;

	@FindBy (linkText = "Wishlist")
	WebElement wishListLink;

	public void openRegistrationPage() {

		registerLink.click();
	}

	public void openLoginPage() {

		loginLink.click();
	}

	public void openMyAccountPage() {

		myAccountLink.click();
	}

	public void changeCurrencies () {

		Select chnageCurrency = new Select(changeCurrencies);
		chnageCurrency.selectByVisibleText("Euro");
	}

	public void selectApparelMenu () {

		action.moveToElement(ApparelsMenu).perform();
		action.moveToElement(ShoesItem).perform();
		action.click().build().perform();
	}

	public void openShoppingCartPage() {
		shoppingCartLink.click();
	}

	public void openWishlistPage () {
		wishListLink.click();
	}
}

