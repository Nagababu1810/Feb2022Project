package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baseclass.BaseTest;

public class RegistrationPage extends BaseTest{
	
	
	@FindBy(linkText="Sign in") public static WebElement sign;
	@FindBy(id="email_create") public WebElement emailaddress;
	@FindBy(id="SubmitCreate") public WebElement createaccount;
	
	@FindBy(name="id_gender") public WebElement title;
	@FindBy(xpath="//input[@name='customer_firstname']") public WebElement Fname;
	@FindBy(xpath="//input[@name='customer_lastname']") public WebElement Lname;
	
	@FindBy(xpath="//input[@name='passwd']") public WebElement Pwd;
	@FindBy(xpath="//select[@id='days']") public WebElement Date;
	@FindBy(xpath="//select[@name='months']")public WebElement Month;
	@FindBy(xpath="//select[@name='years']") public WebElement Year;
	
	@FindBy(xpath="//input[@id='firstname']") public WebElement fname;
	@FindBy(xpath="//input[@id='lastname']") public WebElement lname;
	@FindBy(xpath="//input[@id='company']") public WebElement cname;
	@FindBy(xpath="//input[@name='address1']")public  WebElement add1;
	@FindBy(xpath="//input[@name='address2']")public WebElement add2;
	@FindBy(xpath="//input[@id='city']") public WebElement City;
	@FindBy(xpath="//select[@id='id_state']") public WebElement state;
	@FindBy(xpath="//input[@id='postcode']")public WebElement pin;
	@FindBy(xpath="//select[@id='id_country']")public WebElement country;
	@FindBy(xpath="//input[@id='phone_mobile']") public WebElement mobile;
	@FindBy(xpath="//input[@name='alias']") WebElement alis;
	@FindBy(xpath="//button[@name='submitAccount']") WebElement submitdata;
	WebDriver driver;
	
	
	public RegistrationPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void Registration_Page() throws InterruptedException
	{
		sign.click();
		emailaddress.sendKeys("mddnagababu1810@gmail.com");
		createaccount.click();
		//Thread.sleep(2000);
		title.click();
		Fname.sendKeys("naga");
		Lname.sendKeys("babu");
		Pwd.sendKeys("12345");
		
		
		
		/*
		 * Select date=new Select(Date); date.selectByVisibleText("18");
		 */
		
		Date.sendKeys("18");
		Month.sendKeys("October");
		Year.sendKeys("1991");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("naga"))).click();
		
		
		
		/*
		 * Select month=new Select(Month); month.selectByVisibleText("Oct");
		 */
		
		/*
		 * Select year=new Select(Year); year.selectByIndex(10);
		 */
		
		fname.sendKeys("naga");
		lname.sendKeys("babu");
		cname.sendKeys("TCS");
		add1.sendKeys("kkd");
		add2.sendKeys("kkd");
		City.sendKeys("kkd");
		state.sendKeys("AP");
		pin.sendKeys("00000");
		country.sendKeys("India");
		mobile.sendKeys("1234567890");
		alis.sendKeys("kkd");
		submitdata.click();
		
	}
	

}
