package InsuranceCalculator_Motorcycle;

import java.io.IOException;

import org.testng.annotations.Test;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class EndToEndTest extends TestBase {
	ExcelOperations ex =new ExcelOperations();
 @Test
	public void InsuranceMotorcycle() throws IOException
	{
	 homePage.clickOnMotorcycleLink();
	 enterVehicleDataPage.enterVehicleData();
	 enterInsurantDataPage.enterInsurantData();
	 enterProductDataPage.enterProductData();
	 enterPriceOption.selectPlanOptionAndClickNext("Silver");
	}
	}

