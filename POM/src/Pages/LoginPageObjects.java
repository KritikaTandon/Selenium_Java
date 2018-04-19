package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects extends BasePage {
	
	
	public LoginPageObjects(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id = "user_login")
	public WebElement txtID;
	
	@FindBy(id = "user_pass")
	public WebElement txtPassword;
	
	@FindBy(id = "wp-submit")
	public WebElement btnClick;
	
	public void Login(String ID, String Pass )
	{
		txtID.clear();
		txtID.sendKeys(ID);
		txtPassword.clear();
		txtPassword.sendKeys(Pass);
		btnClick.click();
	}

	
}
