package testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.xml.XmlTest;

import utility.ReadProperties;

public class DriverInstance {

	String 	url= ReadProperties.getConfigProperties("URL");
	WebDriver driver;
	


/*	@BeforeTest
	public void openBrowser()
	{
		url = ReadProperties.getConfigProperties("URL");
		System.setProperty("webdriver.gecko.driver", "C:\\Eclipsepractice\\HelloFresh\\Drivers\\geckodriver\\geckodriver.exe");
		driver  = new FirefoxDriver();
	
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}*/
		@BeforeTest
		public void pre_driver(XmlTest xmltest)
		{

				 String browser = xmltest.getParameter("browser");
				if(browser.equals("GC"))
				{
					String key="webdriver.chrome.driver";
					String value="./Drivers/ChromeDriver/chromedriver.exe";
					System.setProperty(key,value);
					//driver= new ChromeDriver();
					driver= new ChromeDriver();
					
				}
			else if(browser.equals("IE"))
				{
					String key="webdriver.ie.driver";
					String value="./Drivers/IEDriver/IEDriverServer.exe";
					System.setProperty(key,value);
					driver= new InternetExplorerDriver();
					
					
				}
				else
				{	
				//driver=new FirefoxDriver();
					System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver/geckodriver.exe");
					driver= new FirefoxDriver();
				
				}
				
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.manage().window().maximize();
		
			}
		
			
	  @AfterTest
	  public void post() {
		driver.close();
	  }
		
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
