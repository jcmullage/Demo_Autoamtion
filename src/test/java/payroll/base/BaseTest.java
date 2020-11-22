package payroll.base;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import payroll.utilities.Constants;
import payroll.utilities.ExcelUtility;

import static payroll.utilities.Constants.*;

public class BaseTest {
	public WebDriver driver;


	
	
	@BeforeClass
	@Parameters({"browser","excel"})
	public void commonSetUp(String browser,String excel) {
		
		ExcelUtility.setExcelFile(Constants.EXCEL_FILE, excel);

	/*	// set test rail values. 
		TestRailValues.testRunId = testRunId;
		TestRailValues.testCaseId = testCaseId;
		TestRailValues.testRail = testRail; */
		
		
		driver = WebDriverFactory.getInstance().getDriver(browser);
		driver.get(BASE_URL);
	}

	@AfterClass
	public void commonTearDown() {
		WebDriverFactory.getInstance().quitDriver();
		// driver.quit();
	}
}
