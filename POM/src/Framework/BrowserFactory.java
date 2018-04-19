package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import Pages.BasePage;

public class BrowserFactory extends BasePage{
	
	public BrowserFactory(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	static WebDriver driver;
	
	public static WebDriver startBrowser(String Browsername, String Url)
	{
		
		if (Browsername.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (Browsername.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (Browsername.equals("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		
		 driver.manage().deleteAllCookies();
		 driver.get(Url);
		 driver.manage().window().maximize();
		 return driver;
	} 
	
	
	 

}
