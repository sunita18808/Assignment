package StepsDefinition;

import PageObjectModel.CountriesCurrency;
import io.cucumber.java.en.Then;

public class CountriesTheCurrency {
	public CountriesCurrency cc;
	
	@Then("validate currency")
	public void validate_currency() {
	    cc.getCurrencies();
	}

}
