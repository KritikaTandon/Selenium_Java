package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumDownloadPage extends BasePage{
	
	public SeleniumDownloadPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath = "//*[@id='side']/div/form/input[3]")
	public WebElement imgClick;
	
	@FindBy(name="recurringCheckbox")
	public WebElement chckboxClick;
	
	public void SearchInfo()
	{
		imgClick.click();
	}
	
	public void SelectInfo()
	{
		chckboxClick.click();
	}
}
