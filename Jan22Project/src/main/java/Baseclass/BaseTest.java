package Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static WebDriver driver;
	
		
	public static void setup()
	{
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumResources\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	}
	
	public static void waitforTime() {
		
		
		
	}
	
}
