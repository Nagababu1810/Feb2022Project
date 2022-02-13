package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumResources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("checkBoxOption1")).click();
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='checkBoxOption3']")).click();
	}

}
