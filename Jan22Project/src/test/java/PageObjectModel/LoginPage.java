package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(linkText="Sign in") public WebElement singin;
	@FindBy(id="email") public WebElement email;
	@FindBy(id="passwd") public WebElement pwd;
	@FindBy(linkText="Sign in") public WebElement submitbtn;
	public WebDriver driver;
	
public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}



public void login_Page() 
{
	singin.click();
	email.sendKeys("mddnagababu1810@gmail.com");
	pwd.sendKeys("12345");
	submitbtn.click();
	
}

}