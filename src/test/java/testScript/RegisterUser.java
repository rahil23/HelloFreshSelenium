package testScript;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.util.ArrayUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomClass.CreateAccountPOM;
import pomClass.HomePagePOM;
import pomClass.LoginPagePOM;
import pomClass.MyAccouuntPagePOM;
import utility.ExcelOperation;

public class RegisterUser extends DriverInstance {

	@Test
	public void registerUser() throws IOException
	{
		ExcelOperation excelObj = new ExcelOperation();
		
		HomePagePOM homePageObj= new HomePagePOM(driver);
		homePageObj.clickSignInPage();
		
		LoginPagePOM loginPagePOM = new LoginPagePOM(driver);
		loginPagePOM.createAccount();
		
		
		CreateAccountPOM createAccount = new CreateAccountPOM(driver);
		createAccount.createAccount();
	
		
		ArrayList<String> ar = new ArrayList<String>();
		String[] credentals = new String[2];
		credentals[0]=createAccount.getFn();
		credentals[1]=createAccount.getPassword();
		ar.add(createAccount.getFn());
		ar.add(createAccount.getPassword());
		
		String filePath = "C:\\Eclipsepractice\\HelloFresh\\";
		String fileName= "SampleData.xlsx";
		String sheetName = "Credentials";
		try {
			excelObj.writeExcel(filePath, fileName, sheetName, credentals);
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	DriverInstance d = new DriverInstance();
String expectedURL=	d.getUrl()+"?controller=my-account";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL,actualURL);
		
		MyAccouuntPagePOM accountPOM = new MyAccouuntPagePOM(driver);
		accountPOM.isSignOutDisplayed();
		
		String actualName=accountPOM.returnUserDetails();
		String expectedName=createAccount.getFn()+" "+createAccount.getLn();
		Assert.assertEquals(actualName, expectedName);
		
		excelObj.readExcel("C:\\Eclipsepractice\\HelloFresh", "SampleData.xlsx", "Credentials");
		
		accountPOM.signout();
		
		
		
		
	
	}
}
