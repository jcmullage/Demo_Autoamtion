package payroll.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import payroll.utilities.Util;

import payroll.base.BasePage;

public class AddBankAccountPage extends BasePage{
	
	
	public WebDriver driver;
	private String SEARCH_BANK_NAME = "id=>xui-searchfield-1018-inputEl";
	//private String SEARCH_BANK = "xpath=>//ul[@class='x-component xui-contentblock ba-banklist--list x-component-default'and @componentid='dataview-1085']";
	//private String SEARCH_BANK = "xpath=>//li[text()='ANZ (NZ)' and @class='ba-banklist--item xui-contentblock--item'and @data-boundview='dataview-1085']";
	private String SEARCH_BANK = "xpath=>//ul[@id='dataview-1085']";
	private String SEARCH_ANZ_BANK = "xpath=>//li[text()='ANZ (NZ)']";
	
	
	private String ABC = "id=>common-page-title-1005";
	
	private static final Keys ENTER = null;
	
	private String ACCOUNT_NAME = "xpath=>/html/body/div[2]/div/div[2]/section/div[1]/div/div/div/div/div/div[2]/div[1]/div/div/input";
	private String ACCOUNT_TYPE = "xpath=>/html/body/div[2]/div/div[2]/section/div[1]/div/div/div/div/div/div[4]/div[1]/div/div[1]/input";
	private String ACCOUNT_NUMBER = "xpath=>/html/body/div[2]/div/div[2]/section/div[1]/div/div/div/div/div/div[5]/div/div/div[4]/div/div/div/div/div/div[1]/div[1]/div/div/input";
	private String CONTIUNE = "id=>common-button-submit-1015-btnInnerEl";
	
	private String ADD_BANK_ACCOUNT_NOTIFY = "xpath=>//*[@id=\"notify01\"]";
	
	
	public AddBankAccountPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		waitForElement(SEARCH_BANK_NAME,10);
	} 

	public void SerachBank(String email) throws InterruptedException {
		
		elementClick(SEARCH_ANZ_BANK, "Navigate to ANZ bank information page");
		Thread.sleep(10000);
	}

	public void AddBankAccount(String accountName, String accountNumber) throws InterruptedException {
		
		sendData(ACCOUNT_NAME, accountName, "Enter Account Name",true);
		Thread.sleep(5000);
		
		elementClick(ACCOUNT_TYPE,"Click");
		Thread.sleep(5000);
		
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div[1]/div/div/div/div/div/div[4]/div[1]/div/div[1]/input")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div[1]/div/div/div/div/div/div[4]/div[1]/div/div[1]/input")).sendKeys(Keys.TAB);
		Thread.sleep(10000);
		
		waitForElement(ACCOUNT_NUMBER,10);
		sendData(ACCOUNT_NUMBER, accountNumber, "Enter Account Number",true);
		
		waitForElement(CONTIUNE,10);
		elementClick(CONTIUNE, "Press Continue Button");
		
		waitForElement(ADD_BANK_ACCOUNT_NOTIFY,10);
		isDisplayed (ADD_BANK_ACCOUNT_NOTIFY,"Add Bank Account Nofification");
		
		Thread.sleep(5000);
	}
}
