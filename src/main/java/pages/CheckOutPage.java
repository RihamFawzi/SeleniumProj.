package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}


	@FindBy (id ="BillingNewAddress_CountryId")
	WebElement countryDDL;

	@FindBy (id="BillingNewAddress_City")
	WebElement cityName;

	@FindBy(id="BillingNewAddress_Address1")
	WebElement addresstext;

	@FindBy(id= "BillingNewAddress_ZipPostalCode")
	WebElement zip;

	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement phoneNumber;

	@FindBy (xpath =   "//*[@id=\"billing-buttons-container\"]/button[4]")
	WebElement billingAdress_continueBtn;

	@FindBy (xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
	WebElement shippingMethod_continueBtn;
	
	@FindBy (xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
	WebElement paymentMethod_continueBtn;
	
	@FindBy (xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
	WebElement paymentInfo_continueBtn;
	
	@FindBy (xpath = "//*[@id=\"confirm-order-buttons-container\"]/button")
	WebElement confirmOrderBtn;
	
	@FindBy (xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")
	public WebElement orderProcessed_message;
	
	public void registeredUserCanCheckout (String country, String city, String address, String zipNum, String phone) {

		select = new Select(countryDDL);
		select.selectByVisibleText(country);
		cityName.sendKeys(city);
		addresstext.sendKeys(address);
		zip.sendKeys(zipNum);
		phoneNumber.sendKeys(phone);
		billingAdress_continueBtn.click();
		shippingMethod_continueBtn.click();
		paymentMethod_continueBtn.click();
		paymentInfo_continueBtn.click();
		confirmOrderBtn.click();
	}
	
}
