package PageObjectModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountriesCurrency {
	
public WebDriver ldriver;
	
	public CountriesCurrency(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[name()='path' and contains(@class,'flagFocus')]")
	@CacheLookup
	WebElement countryflag;
		
	public void clickFlag() {
		countryflag.click();
	}
	
	public void getCurrencies() {
		List<WebElement> countriesName = ldriver.findElements(By.xpath("//div[@class='language-container']"));
		
		for(WebElement name: countriesName) {
			name.click();		
			String cur = ldriver.findElement(By.xpath("//span[@class='countrySelected']")).getText();
			System.out.println(cur);
	   }
		
	
	}

}
