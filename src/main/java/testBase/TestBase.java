package testBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageObjects;
import reusableComponents.PropertiesOperations;

public class TestBase extends ObjectRepo {


	@BeforeMethod
	public void setupMethod() throws IOException
	{
		launchBrowser();
		homePage=new HomePageObjects();
	}
	
	public void launchBrowser() throws IOException {
		String browser=PropertiesOperations.getValueForTheKey("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
			driver.get(PropertiesOperations.getValueForTheKey("url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
			driver.manage().window().maximize();
		}
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
