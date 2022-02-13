package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration {
public WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumResources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		
	}
	@Test
	public void signin() throws InterruptedException {
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("email_create")).sendKeys("mdd@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("naga");
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("babu");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		
		Select day=new Select(driver.findElement(By.name("days")));
		day.selectByVisibleText("18");
		Thread.sleep(2000);
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByIndex(9);
		
		
		Select year=new Select(driver.findElement(By.name("years")));
		year.selectByValue("1992");
		
		
		
	}
}
