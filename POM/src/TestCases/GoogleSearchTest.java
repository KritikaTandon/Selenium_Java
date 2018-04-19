package TestCases;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

//import Framework.*;
import Pages.*;

public class GoogleSearchTest {

	@Test
	public void application_URL_is() throws Throwable {
		
	   //  WebDriver driver = BrowserFactory.startBrowser("Chrome","http://www.google.com");
		
		
		// TODO Auto-generated method stub
		 String chromepath = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", chromepath);
         WebDriver driver = new ChromeDriver();
         driver.get("http://www.google.com");
         driver.manage().window().maximize();

		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		 page.Searchtxt("Selenium");
		 Thread.sleep(5000);
		 page.LinkSelenium();
		 
		 SeleniumPageObjects selPage = new SeleniumPageObjects(driver);
		 
		 Thread.sleep(5000);
		 selPage.NavigateHome();
		 Thread.sleep(5000);
		 selPage.ClickDownload();
		 
		 SeleniumDownloadPage selDownPage = new SeleniumDownloadPage(driver);
		 selDownPage.SearchInfo();
		 selDownPage.SelectInfo();
		 
		 //Close the Browser
		 driver.close();
	}
		 
	

}

