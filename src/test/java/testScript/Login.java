package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClass.CreateAccountPOM;
import pomClass.HomePagePOM;
import pomClass.LoginPagePOM;
import pomClass.MyAccouuntPagePOM;
import utility.ExcelOperation;

public class Login extends DriverInstance {
	
	String username,password;

	@Test
	public void loginUser() throws IOException
	{
		ExcelOperation excelObj = new ExcelOperation();
		
		HomePagePOM homePageObj= new HomePagePOM(driver);
		homePageObj.clickSignInPage();
		
		
	
	
		
		LoginPagePOM login =new LoginPagePOM(driver);
		login.signIn("i2@gmail.com", "sears@123");
		
		DriverInstance d = new DriverInstance();
		String expectedURL=	d.getUrl()+"?controller=my-account";
				String actualURL = driver.getCurrentUrl();
				Assert.assertEquals(expectedURL,actualURL);
				
				MyAccouuntPagePOM accountPOM = new MyAccouuntPagePOM(driver);
				accountPOM.isSignOutDisplayed();
				
				String actualName=accountPOM.returnUserDetails();
				
				Assert.assertEquals(actualName, "Rahil Kumar");
		
		
	
	

}
}