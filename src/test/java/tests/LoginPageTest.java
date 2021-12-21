package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
public class LoginPageTest extends BaseClass{

	
	@Parameters({"Email","Password"})
	@Test
	public void LoginTest(String Emailval,String Passwordval) {
		
		LoginPage Login = new LoginPage();
		Login.login(Emailval, Passwordval);
		Login.verify();
		
		
	}
}