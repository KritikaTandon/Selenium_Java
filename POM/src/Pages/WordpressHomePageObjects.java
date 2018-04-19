package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

//import junit.framework.*;




public class WordpressHomePageObjects extends BasePage{
	
	public WordpressHomePageObjects(WebDriver driver)
	{
		super (driver);
	}
	
	@FindBy(className = "welcome-panel-content")
	public WebElement txtverify;
	
	public void VerifyPage()
	{
		txtverify.getText();
		//Assert.assertEquals(txtverify.getText(), "Welcome to WordPress!");
		
	}

}
