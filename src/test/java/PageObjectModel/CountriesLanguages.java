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

public class CountriesLanguages {
	
public WebDriver ldriver;
	
	public CountriesLanguages(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[name()='path' and contains(@class,'flagFocus')]")
	@CacheLookup
	WebElement countryflag;
	
	
	public void clickFlag() {
		countryflag.click();
	}
	
	public void getLanguages() {
		List<WebElement> countriesLang = ldriver.findElements(By.xpath("//li[@class='multi-language-list-item']"));
		List<WebElement> countriesName = ldriver.findElements(By.xpath("//div[@class='language-container']"));
		
		Map<String, String> pl = new HashMap<String, String>();
		
		for(int i=0; i<countriesName.size();i++) {
			String Name = countriesName.get(i).getText();
			String Lang = countriesLang.get(i).getText();
			
			pl.put(Name, Lang);
	}
		pl.forEach((n,l)->System.out.println(n+" "+l));
	
	
	}
}
