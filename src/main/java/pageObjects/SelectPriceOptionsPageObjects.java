package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ObjectRepo;

public class SelectPriceOptionsPageObjects extends ObjectRepo {

@FindBy(id="nextsendquote")	
WebElement btnNext;
	
	
	public SelectPriceOptionsPageObjects() {
	PageFactory.initElements(driver, this);
	}
	
	
	public String pricePerYearOfPlan(String plan)
	{
		return driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td[@data-label='"+plan+"']/span")).getText();
	}
	
	public void selectPlanOptionAndClickNext(String plan)
	{
		driver.findElement(By.xpath("//input[@name='Select Option' and @value='"+plan+"']/parent::label")).click();
		btnNext.click();
	}
	
}
