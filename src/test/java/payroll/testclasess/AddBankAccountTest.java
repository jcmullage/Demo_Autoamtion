package payroll.testclasess;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import payroll.pageclasses.AddBankAccountPage;
import payroll.pageclasses.BankAccountPage;
import payroll.pageclasses.HomePage;
import payroll.pageclasses.LoginPage;
import payroll.utilities.ExcelUtility;
import java.util.Random;

import payroll.base.BaseTest;

public class AddBankAccountTest extends BaseTest {
	
	 @DataProvider(name = "AddBankAccount")
	    public Object[][] getVerifySearchCourseData(){
	        Object[][] testData = ExcelUtility.getTestData("verify_login");
	        return testData;
	    }
	 
 
	 
	 @Test(dataProvider = "AddBankAccount")
	    public void logTotheSystem(String userName, String password) throws InterruptedException {
		 
	        LoginPage login = new LoginPage(driver);
	        HomePage  home = new HomePage(driver);
	        BankAccountPage bankAccount =new BankAccountPage(driver);
	        AddBankAccountPage addBankAccount = new AddBankAccountPage(driver);
	        
	        
	        //Login to the application
	        login.login(userName,password);
	        
	        //Navigate to account page through the home page
	        home.NavigateAccountingPage();
	        
	        //Navigate to bank account page
	        bankAccount.NavigateBankAccountPage();
	    
	        //Add all bank account information
	        addBankAccount.SerachBank("ANZ");
	       
	       
	        Random rnd = new Random();
	        int number = rnd.nextInt(999999);
	        long number1 = (long) (Math.random() * 100000000000000L);
	       
	        String accountName = Integer.toString(number);
	        String accountNumber = Long.toString(number1);
	        
	         addBankAccount.AddBankAccount(accountName,accountNumber);
	    }
}
	 
	


