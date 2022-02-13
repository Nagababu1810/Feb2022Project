package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiondp {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumResources\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("source")).sendKeys("kakina");
		Thread.sleep(2000);
		driver.findElement(By.linkText("KAKINADA")).click();
		driver.findElement(By.name("destination")).sendKeys("vijayawada");
		Thread.sleep(2000);
		driver.findElement(By.linkText("VIJAYAWADA")).click();
	}

}
