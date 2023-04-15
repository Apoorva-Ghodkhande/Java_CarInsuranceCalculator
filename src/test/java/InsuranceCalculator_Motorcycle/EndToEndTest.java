package InsuranceCalculator_Motorcycle;

import java.io.IOException;

import org.testng.annotations.Test;

import testBase.TestBase;

public class EndToEndTest extends TestBase {
	
 @Test
	public void InsuranceMotorcycle() throws IOException
	{
	 homePage.clickOnMotorcycleLink();
	 enterVehicleDataPage.enterVehicleData();
	 enterInsurantDataPage.enterInsurantData();
	 enterProductDataPage.enterProductData();
	}
	}

