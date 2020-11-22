package payroll.pageclasses;

import org.openqa.selenium.WebDriver;

import payroll.utilities.Util;

import payroll.base.BasePage;

public class BankAccountPage extends BasePage {
	
	public WebDriver driver;
	private String ADD_BANK_ACCOUNT = "xpath=>//span[@data-automationid='Add Bank Account-button']";

	public BankAccountPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		waitForElement(ADD_BANK_ACCOUNT,10);
	}

	public void NavigateBankAccountPage() {
		elementClick(ADD_BANK_ACCOUNT, "Press Add Bank Account Button");
	}
}
