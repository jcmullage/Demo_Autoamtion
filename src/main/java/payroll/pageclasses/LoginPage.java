package payroll.pageclasses;

import org.openqa.selenium.WebDriver;

import payroll.utilities.Util;

import payroll.base.BasePage;

public class LoginPage extends BasePage {
	
	public WebDriver driver;
	private String EMAIL = "id=>email";
	private String PASSWORD = "id=>password";
	private String LOGIN = "id=>submitButton";

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		waitForElement(LOGIN,10);
	}

	public void login(String email, String password) {
		sendData(EMAIL, email, "Enter Email",true);
		sendData(PASSWORD, password, "Enter Password",true);
		elementClick(LOGIN, "Press Login Button");
	
	}
	
	

}
