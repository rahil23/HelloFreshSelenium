package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GenrateRandomData;

public class LoginPagePOM extends GenrateRandomData {
	GenrateRandomData randomData =new GenrateRandomData();

	WebDriver driver;
	
	@FindBy(id="email_create")
	WebElement signUpEmailAddress;
	
	//@FindBy(xpath="//*[contains(text(),'Create an account')]")
	@FindBy(id="SubmitCreate")
	WebElement createAccountButton;
	
	@FindBy(id="email")
	WebElement login_email_txtbx;
	
	@FindBy(id="passwd")
	WebElement passwd_txtbox;
	
	@FindBy(id="SubmitLogin")
	WebElement signIn_btn;
	
	public LoginPagePOM(WebDriver driver) {
		this.driver=driver;
		
	
		
		PageFactory.initElements(driver, this);
}

public void createAccount()
{
	
	String signUpEmail = "test"+randomData.randomFourDigit()+"@yopmail.com";
	signUpEmailAddress.clear();
	signUpEmailAddress.sendKeys(signUpEmail);
	boolean f=createAccountButton.isEnabled();
	System.out.println(f);
	createAccountButton.click();
}
public void signIn(String username,String password)
{
	login_email_txtbx.clear();
	login_email_txtbx.sendKeys(username);
	passwd_txtbox.clear();
	passwd_txtbox.sendKeys(password);
	signIn_btn.click();
}

}
