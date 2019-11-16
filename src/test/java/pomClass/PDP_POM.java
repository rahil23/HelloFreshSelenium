package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDP_POM {

	
	
WebDriver driver;
	
	@FindBy(id="add_to_cart")
	WebElement addTocart_btn;
	
	@FindBy(linkText="Proceed to checkout")
	WebElement proceedToCheckout_btn;
	
	public PDP_POM(WebDriver driver) {
		this.driver=driver;
		
	
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public void addtoCart()
	{
		addTocart_btn.isEnabled();
		addTocart_btn.click();
		proceedToCheckout_btn.isEnabled();
		proceedToCheckout_btn.click();
	}
	
	
}
