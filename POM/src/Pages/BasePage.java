package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	
	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

}
