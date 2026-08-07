package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test10 {

	@Test()
	public void login() {
		Reporter.log("Login into app",true);
	}
	@Test(dependsOnMethods = {"login"})
	public void logout() {		//this test method will run after login,as it depends on it
		Reporter.log("Logout from app",true);
	}

}
