package StepsDefinition;


import org.openqa.selenium.WebDriver;

import PageObjectModel.CountriesLanguages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountriesLang {
	
	public WebDriver driver;
	
	public CountriesLanguages cl;
	
	@When("Click on country flag")
	public void click_on_country_flag() {
	    cl.clickFlag();
	}

	@Then("validate the list of countries with langauges")
	public void validate_the_list_of_countries_with_langauges() {
	    cl.getLanguages();
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}
}
