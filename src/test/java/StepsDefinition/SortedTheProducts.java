package StepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.SortedProducts;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SortedTheProducts  {
	public WebDriver driver;
	public SortedProducts sp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "D://Drivers001/chromedriver.exe");
		driver  = new ChromeDriver();
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
		
	    
	}

	@When("navigate to HANDBAGS Category")
	public void navigate_to_handbags_category() {
		sp.clickHandbags();
	    
	}

	@Then("Click on Featured")
	public void click_on_featured() {
	    sp.clickFeatured();
	}

	@Then("select Price HIGH to LOW")
	public void select_price_high_to_low() {
		sp.clickPrice();
	    
	}

	@Then("I validate the order of products should be sorted")
	public void i_validate_the_order_of_products_should_be_sorted() {
		
	    sp.getSorted();
	}

	
	}

