package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.GenrateRandomData;

public class CreateAccountPOM {
	
	GenrateRandomData randomData =new GenrateRandomData();
	WebDriver driver;
	String fn,ln;
	String password= "Random#1234";
	
	@FindBy(id="id_gender1")
	WebElement maleRadioBox;
	
	@FindBy(id="customer_firstname")
	WebElement firstNameTxtBox;
	
	@FindBy(id="customer_lastname")
	WebElement lastNameTxtBox;
	
	@FindBy(id="passwd")
	WebElement passwordTxtBox;
	
	@FindBy(id="firstname")
	WebElement addressFNTxtBox;
	
	@FindBy(id="lastname")
	WebElement addressLNTxtBox;
	
	@FindBy(id="company")
    WebElement companyTxtBox;
	
	@FindBy(id="address1")
	WebElement add1_TxtBox;
	
	@FindBy(id="address2")
	WebElement add2_TxtBox;
	
	@FindBy(id="days")
	WebElement days_dob;
	
	@FindBy(id="months")
	WebElement months_dob;
	
	@FindBy(id="years")
	WebElement years_dob;
	
	
	@FindBy(id="city")
	WebElement cityTxtBox;
	
	@FindBy(id="id_state")
WebElement state_SelectBox;
	
	@FindBy(id="postcode")
	WebElement postCodetxtBox;
	
	@FindBy(id="id_country")
	WebElement country;
	
	@FindBy(id="other")
	WebElement additionalInfo_txtBox;
	
	@FindBy(id="phone")
	WebElement HomePhone_txtBox;
	
	@FindBy(id="phone_mobile")
	WebElement mobile_txtbx;
	
	@FindBy(id="submitAccount")
	WebElement register_btn;

	public CreateAccountPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	public void createAccount()
	{
		maleRadioBox.click();
		 fn= randomData.generateRandomString(5);
		firstNameTxtBox.sendKeys(fn);
		ln= randomData.generateRandomString(5);
		lastNameTxtBox.sendKeys(ln);
		passwordTxtBox.sendKeys(password);
		
		Select dropday= new Select(days_dob);
		dropday.selectByIndex(3);
		
		Select dropMonths = new Select(months_dob);
		dropMonths.selectByIndex(3);
		
		Select dropYrs = new Select(years_dob);
		dropYrs.selectByValue("2000");
		
		
		
		
		//addressFNTxtBox.clear();
		//addressFNTxtBox.sendKeys("POBox 123");
		companyTxtBox.sendKeys("company");
		add1_TxtBox.sendKeys("POBox123");
		add2_TxtBox.sendKeys("add2");
		 
		
	
		cityTxtBox.sendKeys("chicago");
		Select dropState = new Select(state_SelectBox);
		dropState.selectByVisibleText("Montana");
		postCodetxtBox.sendKeys("10003");
		Select dropCountry = new Select(country);
		dropCountry.selectByVisibleText("United States"); 
	
		additionalInfo_txtBox.sendKeys("additonal");
		HomePhone_txtBox.sendKeys("9872090912");
		mobile_txtbx.sendKeys("9872090912");
		register_btn.click();
		
		
		
		
		
		
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
