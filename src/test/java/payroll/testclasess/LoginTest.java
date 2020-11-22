package payroll.testclasess;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import payroll.pageclasses.LoginPage;
import payroll.utilities.ExcelUtility;

import payroll.base.BaseTest;

public class LoginTest extends BaseTest {
	
	
    @DataProvider(name = "loginDetails")
    public Object[][] getVerifySearchCourseData(){
        Object[][] testData = ExcelUtility.getTestData("verify_login");
        return testData;
    }

    @Test(dataProvider = "loginDetails")
    public void logTotheSystem(String userName, String password) {
        LoginPage login = new LoginPage(driver);
        login.login(userName,password);
       // boolean result = mp.verifyTitle(verification);

    }
	
	
}
