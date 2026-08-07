package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open Chrome Browser",true);
	}
	
	@BeforeMethod
	public void Login() {
		Reporter.log("Login into app",true);
	}
	
	@Test
	public void TC1() {
		Reporter.log("Running TC-1",true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("Running TC-2",true);
	}
	
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout from app",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Chrome Browser",true);
	}
	
}









