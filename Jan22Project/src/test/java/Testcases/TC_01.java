package Testcases;

import Baseclass.BaseTest;
import PageObjectModel.LoginPage;

public class TC_01 extends BaseTest{

	public static void main(String[] args) throws InterruptedException {
		
		setup();
	
	//RegistrationPage rp=new RegistrationPage(driver);
	//rp.Registration_Page();
	
		LoginPage lp=new LoginPage(driver);
		lp.login_Page();
	
	}
}
