package pomClass;

import org.apache.poi.ss.formula.functions.EOMonth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccouuntPagePOM {
	
	
WebDriver driver;
	
	@FindBy(linkText="Sign out")
	WebElement signOutlink;

	@FindBy(className="account")
	WebElement accountName;
	
	@FindBy(linkText="Women")
	WebElement womenheader_link;
	
	public MyAccouuntPagePOM(WebDriver driver) {
		this.driver=driver;
		
	
		
		PageFactory.initElements(driver, this);
}

public void isSignOutDisplayed()
{
	
	Assert.assertEquals(signOutlink.isDisplayed(),true);
	Assert.assertEquals(signOutlink.isEnabled(),true);
	
}
public void signout()
{
	signOutlink.click();
}
public String returnUserDetails()
{
	String userName = accountName.getText();
	return userName;
	
}
public void clickWomenHeader()
{
	womenheader_link.click();
}
}
