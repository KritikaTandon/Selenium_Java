package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class SeleniumPageObjects extends BasePage{

	public SeleniumPageObjects(WebDriver driver){
		super(driver);
	//PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "menu_download")
	public WebElement lnkDownload;
	
	@FindBy(xpath = "//*[@id='header']/h1/a")
	public WebElement lnkHome;

	public void ClickDownload()
	{
		lnkDownload.click();	
	}
	
	public void NavigateHome()
	{
		lnkHome.click();
	}
	
}
