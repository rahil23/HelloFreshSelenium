package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ReadProperties;

public class WomenMyStorePOM {
	

	
WebDriver driver;
//ReadProperties.getConfigProperties("NAME_OF_DRESS");
	@FindBy(linkText="Faded Short Sleeve T-shirts")
	WebElement fadedShortSleeveTShirt_linkTxt;
	
	public WomenMyStorePOM(WebDriver driver) {
		this.driver=driver;
		
	
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
public void click_product()
{
	fadedShortSleeveTShirt_linkTxt.click();
}
}
