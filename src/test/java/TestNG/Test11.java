package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test11 {
	@Test()
	public void login() {
		Assert.fail();
		Reporter.log("Login into app",true);
	}
	@Test(dependsOnMethods = {"login"})
	public void logout() {		//this test method will be skipped, bcoz depends on method fails
		Reporter.log("Logout from app",true);
	}
}
