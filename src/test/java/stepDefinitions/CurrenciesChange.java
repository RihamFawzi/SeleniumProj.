package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;



public class CurrenciesChange extends TestBase {

	HomePage homeObject;


	@When ("select another currency from DDL")
	public void select_another_currency_from_DDL() throws InterruptedException {
		
		homeObject = new HomePage(driver);
		homeObject.changeCurrencies();
		Thread.sleep(3000);
	}

	@Then ("currency is changed successfully")
	public void currency_is_changed_successfully() {

		Assert.assertTrue(homeObject.changeCurrencies.getText().contains("Euro"));	
	}



}
