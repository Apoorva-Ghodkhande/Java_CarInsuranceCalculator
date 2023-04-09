package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageObjects extends TestBase {

@FindBy(id="nav_motorcycle")
WebElement linkMotorcycle;

public HomePageObjects() {
PageFactory.initElements(driver, this);
}
	
public void clickOnMotorcycleLink()
{
linkMotorcycle.click();
}
}
