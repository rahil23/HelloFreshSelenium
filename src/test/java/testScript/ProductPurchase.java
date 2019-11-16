package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import pomClass.HomePagePOM;
import pomClass.LoginPagePOM;
import pomClass.MyAccouuntPagePOM;
import pomClass.OrderMyStore_POM;
import pomClass.PDP_POM;
import pomClass.WomenMyStorePOM;
import utility.ExcelOperation;

public class ProductPurchase extends DriverInstance {
	
	@Test
	public void orderProduct() throws IOException
	{
		ExcelOperation excelObj = new ExcelOperation();
		
		HomePagePOM homePageObj= new HomePagePOM(driver);
		homePageObj.clickSignInPage();
		LoginPagePOM login =new LoginPagePOM(driver);
		login.signIn("i2@gmail.com", "sears@123");

		MyAccouuntPagePOM myaccount = new MyAccouuntPagePOM(driver);
		myaccount.clickWomenHeader();
		
		WomenMyStorePOM womenStore = new WomenMyStorePOM(driver);
		womenStore.click_product();
		
		PDP_POM pdpObj = new PDP_POM(driver);
		pdpObj.addtoCart();
		
		OrderMyStore_POM orderMyStore_obj = new OrderMyStore_POM(driver);
		orderMyStore_obj.completingCheckout();
	
	
//excelObj.readExcel("C:\\Eclipsepractice\\HelloFresh", "SampleData.xlsx", "Credentials");

	

	
}
}
