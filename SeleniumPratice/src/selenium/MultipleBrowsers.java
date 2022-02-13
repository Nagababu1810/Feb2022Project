package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;

public class MultipleBrowsers {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	if(Browser.CHROME != null){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumResources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https:\\www.google.com");	
	}
	else if(Browser.FIREFOX != null) {
		
		System.setProperty("webdriver.firefox.driver", "C:\\SeleniumResources\\geckodriver.exe");
		driver =new ChromeDriver();
		driver.get("https:\\www.google.com");
	}
	else if(Browser.EDGE != null){
		System.setProperty("webdriver.edge.driver", "C:\\SeleniumResources\\MSedgedriver.exe");
		driver =new ChromeDriver();
		driver.get("https:\\www.google.com");
		
	}
	}
		
	}

