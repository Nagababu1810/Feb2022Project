package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumResources\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		

		driver.findElement(By.name("txtJourneyDate")).click();
		
		driver.findElement(By.linkText("29")).click();
	}

}
