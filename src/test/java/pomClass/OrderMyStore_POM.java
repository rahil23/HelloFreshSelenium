package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderMyStore_POM {

	WebDriver driver;
	
	@FindBy(linkText="Proceed to checkout")
	WebElement proceedToCheckout_btn;
	
	@FindBy(id="cgv")
	WebElement termsCondition_Checkbox;
	
	//@FindBy(xpath ="//*[contains(text(),'Proceed to checkout')]")
	@FindBy(xpath="//p[@class='cart_navigation clearfix']/button/span")
	WebElement add_checkout_btn;
	
	
		
	@FindBy(partialLinkText="Pay by bank wire")
	WebElement click_payByBankWire;
	
	@FindBy(xpath="//*[contains(text(),'I confirm my order')]")
	WebElement confirmOrder_btn;
	
	public OrderMyStore_POM(WebDriver driver) {
		this.driver=driver;
		
	
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public void completingCheckout()
	{
		proceedToCheckout_btn.isDisplayed();
	
		proceedToCheckout_btn.click();
		add_checkout_btn.isDisplayed();
		
		add_checkout_btn.click();
		termsCondition_Checkbox.isEnabled();
		termsCondition_Checkbox.click();
add_checkout_btn.isDisplayed();
		
		add_checkout_btn.click();
		
		click_payByBankWire.click();
		
		confirmOrder_btn.click();
		
	}
	
}
