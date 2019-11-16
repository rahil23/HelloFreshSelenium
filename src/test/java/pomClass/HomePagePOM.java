package pomClass;

import javax.xml.ws.WebEndpoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {
	
	WebDriver driver;
	
	@FindBy(linkText="Sign in")
	WebElement signIn;
	
	
	public HomePagePOM(WebDriver driver) {
		this.driver=driver;
		
	
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public void clickSignInPage()
	{
		 signIn.isDisplayed();
	
		signIn.click();
		
	}

}
