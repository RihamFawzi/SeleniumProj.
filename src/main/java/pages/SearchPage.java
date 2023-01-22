package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (id="small-searchterms")
	WebElement searchTxtBox;

	@FindBy (css="button.button-1.search-box-button")
	WebElement searchBtn;
	
	
	public void productSearch (String productName) {

		searchTxtBox.sendKeys(productName);
		searchBtn.click();
	}

}


