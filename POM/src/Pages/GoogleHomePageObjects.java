package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class GoogleHomePageObjects extends BasePage
{
	
	public GoogleHomePageObjects(WebDriver driver) 
	{
		super(driver);
	//PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	@CacheLookup
	public WebElement txtSearch;
	
	@FindBy(name = "btnK")
	@CacheLookup
	public WebElement btnClick;
	
	@FindBy(linkText = "Selenium - Web Browser Automation")
	
	public WebElement lnkText;
	
	public void Searchtxt(String text)
	{
		// Search for text and click search button
		txtSearch.sendKeys(text);
		btnClick.click();	
	}
	
	public void LinkSelenium()
	{
		// Click on link-Selenium
		lnkText.click();
		//return new SeleniumPageObjects();
	}
	
}
