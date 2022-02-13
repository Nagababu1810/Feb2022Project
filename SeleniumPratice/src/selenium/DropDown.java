package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumResources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		

		Select dp1=new Select(driver.findElement(By.name("dropdown-class-example")));
		dp1.selectByVisibleText("Option1");
		
		
		Select dp2=new Select(driver.findElement(By.id("dropdown-class-example")));
		dp2.selectByVisibleText("Option2");
		
		Select dp3=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		dp3.selectByVisibleText("Option3");
	
	}

}
