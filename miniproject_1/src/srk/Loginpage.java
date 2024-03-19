package srk;



//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Loginpage {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		}
	
	@Test

	public void verifytitle()
	{
	String actualTitle=driver.getTitle();
	String expectedTitle="Login | Salesforce";
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterMethod
	public void tear()
	{
		 driver.quit();
		
	}
	
	

}
