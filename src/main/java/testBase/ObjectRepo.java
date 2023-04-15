package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.EnterInsurantDataPageObject;
import pageObjects.EnterProductDataPageObjects;
import pageObjects.EnterVehicleDataPageObject;
import pageObjects.HomePageObjects;
import reusableComponents.CommonMethods;
import reusableComponents.ExtentSetup;

public class ObjectRepo {
	public static WebDriver driver;
	
	public static ExtentTest test;
	public static ExtentReports extent;
	 public static HomePageObjects homePage;
	 public static EnterVehicleDataPageObject enterVehicleDataPage;
	 public static EnterInsurantDataPageObject enterInsurantDataPage;
	 public static EnterProductDataPageObjects enterProductDataPage;
	 
	 public CommonMethods cm= new CommonMethods();
}
