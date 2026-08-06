package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test(invocationCount=5)
	public void TC1() {
		Reporter.log("TC-1",true);
	}
		
}
