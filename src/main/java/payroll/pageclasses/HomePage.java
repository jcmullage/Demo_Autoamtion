package payroll.pageclasses;

import org.openqa.selenium.WebDriver;

import payroll.utilities.Util;

import payroll.base.BasePage;

public class HomePage extends BasePage {
	
	public WebDriver driver;
	private String ACCOUNTING = "xpath=>//*[@id=\"header\"]/header/div/ol[1]/li[3]/button";
	private String BANK_ACCOUNT = "xpath=>//a[text()='Bank accounts']";

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		waitForElement(ACCOUNTING,10);
	}

	public void NavigateAccountingPage() throws InterruptedException {
		elementClick(ACCOUNTING, "Press Accounting Button");
		
		elementClick(BANK_ACCOUNT, "Press Bank Account dropdown option");
		
		Thread.sleep(10000);
	}

}
