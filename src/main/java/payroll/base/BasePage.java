package payroll.base;

import org.openqa.selenium.WebDriver;

import payroll.utilities.Util;

public class BasePage extends CustomDriver {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean verifyTitle(String expectedTitle) {
        //return getTitle().equalsIgnoreCase(expectedTitle);
    	System.out.println(getTitle());
    	return Util.verifyTextMatch(getTitle(), expectedTitle);
    }
}
