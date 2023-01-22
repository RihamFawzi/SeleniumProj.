package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id="gender-female")
	WebElement genderRdoBtn ;

	@FindBy(id="FirstName")
	WebElement fnTxtBox;

	@FindBy (id="LastName")
	WebElement lntxtBox;

	@FindBy (id="Email")
	WebElement emailTxtBox;

	@FindBy(id="Password")
	WebElement passwordTxtBox;

	@FindBy (id="ConfirmPassword")
	WebElement confirmPasswordTxtBox;

	@FindBy (id="register-button")
	WebElement regitserBtn;

	@FindBy (linkText = "Log out")
	WebElement logoutLink;
	
	@FindBy (css="div.result")
	public WebElement successMessage;
	
	@FindBy (css ="a[class=\"button-1 register-continue-button\"]")
	WebElement continueBtn;

	public void userRegistration (String firstName, String lastName, String email, String password) {

		genderRdoBtn.click();
		fnTxtBox.sendKeys(firstName);
		lntxtBox.sendKeys(lastName);
		emailTxtBox.sendKeys(email);
		passwordTxtBox.sendKeys(password);
		confirmPasswordTxtBox.sendKeys(password);
		regitserBtn.click();
	}

	public void userLogout() {
		logoutLink.click();
	}
	
	public void retrunToHomePage () {
		continueBtn.click();
	}
}
