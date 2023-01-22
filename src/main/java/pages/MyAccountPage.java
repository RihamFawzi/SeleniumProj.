package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (linkText = "Change password")
	WebElement changepasswordLink;
	
	@FindBy (id = "OldPassword")
	WebElement oldPasswordTxt;
	
	@FindBy (id = "NewPassword")
	WebElement newPasswordTxt;
	
	@FindBy (id = "ConfirmNewPassword")
	WebElement confirmPasswordTxt;
	
	@FindBy (css = "button.button-1.change-password-button")
	WebElement ChangePasswordBtn;
	
	@FindBy (css = "div.bar-notification.success")
	public WebElement result;
	
	
	public void openChangePassword () {
		changepasswordLink.click();
	}
	
	public void ChangePassword (String oldpassword, String newpassword) {
	
		oldPasswordTxt.sendKeys(oldpassword);
		newPasswordTxt.sendKeys (newpassword);
		confirmPasswordTxt.sendKeys(newpassword);
		ChangePasswordBtn.click();
	}
}
