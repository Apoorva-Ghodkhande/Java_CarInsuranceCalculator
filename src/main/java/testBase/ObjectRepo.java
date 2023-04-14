package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.HomePageObjects;
import reusableComponents.CommonMethods;
import reusableComponents.ExtentSetup;

public class ObjectRepo {
	public static WebDriver driver;
	
	public static ExtentTest test;
	public static ExtentReports extent;
	 public static HomePageObjects homePage;
	 
	 public CommonMethods cm= new CommonMethods();
}
