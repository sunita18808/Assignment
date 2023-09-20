package PageObjectModel;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortedProducts {
	
public WebDriver ldriver;
	
	public SortedProducts(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@aria-label='Handbags main.nav.keyboardGuide']")
	@CacheLookup
	WebElement handbags;
	
	@FindBy(xpath="//button[normalize-space()='Featured']")
	@CacheLookup
	WebElement featured;
	
	@FindBy(xpath = "//a[normalize-space()='price high to low']")
	@CacheLookup
	WebElement price;
	
	
	public void clickHandbags()
	{
		handbags.click();
	}
	
	public void clickFeatured() {
		featured.click();
	}
	
	public void clickPrice() {
		price.click();
	}
	
	public void getSorted() {
		List<WebElement> list = ldriver.findElements(By.xpath("//span[@class='ada-link']"));
		
		List<String> before_sort = list.stream().map(item->item.getText()).collect(Collectors.toList());
		List<String> after_sort = list.stream().map(item->item.getText()).sorted().collect(Collectors.toList());
		
		if(before_sort.equals(after_sort)) {
			System.out.println("Product list is sorted");
		} else
		{
			System.out.println("Product list is not sorted");
		}
	}

}
