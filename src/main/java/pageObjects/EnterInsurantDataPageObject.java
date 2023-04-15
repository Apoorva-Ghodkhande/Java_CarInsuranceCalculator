package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ObjectRepo;

public class EnterInsurantDataPageObject extends ObjectRepo{

	
	@FindBy(id="firstname")
	WebElement tBoxFirstName;
	
	@FindBy(id="lastname")
	WebElement tBoxLastName;
	
	@FindBy(id="birthdate")
	WebElement tboxBirthDate;
	
	
	@FindBy(xpath="//input[@name='Gender']/parent::label")
	List<WebElement> radioGender;	
	
	//input[@name='Gender']/parent::label
	
	@FindBy(id="streetaddress")
	WebElement tBoxStreetAddress;
	
	@FindBy(id="country")
	WebElement ddCountry;	
	
	@FindBy(id="zipcode")
	WebElement tBoxZipCode;
	
	@FindBy(id="city")
	WebElement tBoxCity;	
	
	@FindBy(id="occupation")
	WebElement ddOccupation;	
	
	@FindBy(xpath="//input[ @name='Hobbies']/parent::label")
	List<WebElement> checkBoxHobbies;		
	
	@FindBy(id="website")
	WebElement tboxWebsite;
	
	@FindBy(id="nextenterproductdata")
	WebElement btnNext;	
	
	public EnterInsurantDataPageObject() {
	PageFactory.initElements(driver, this);
	}
	
	
	public void enterInsurantData()
	{
		tBoxFirstName.sendKeys("aaaaa");
		tBoxLastName.sendKeys("bbbbb");
		tboxBirthDate.sendKeys("02/10/2000");
		cm.selectRadioButton(radioGender, "Female");
		tBoxStreetAddress.sendKeys("aa ss dd  ff  gg");
		cm.selectValueInDropdown(ddCountry, "India");
		tBoxZipCode.sendKeys("225364");
        tBoxCity.sendKeys("Shimla");
        cm.selectValueInDropdown(ddOccupation, "Employee");
        cm.selectCheckboxes(checkBoxHobbies, "Speeding,Other");
        tboxWebsite.sendKeys("zxc@gmail.com");
        btnNext.click();
	}
}
