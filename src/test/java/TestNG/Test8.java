package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test8 {

	@Test()
	public void TC1() {
		Reporter.log("Running TC-1",true);
	}
	
	@Test(enabled=false)
	public void TC2() {
		Reporter.log("Running TC-2",true);
	}
	@Test()
	public void TC3() {
		Reporter.log("Running TC-3",true);
	}
	
	@Test(enabled=false)
	public void TC4() {
		Reporter.log("Running TC-4",true);
	}
	
	@Test()
	public void TC5() {
		Reporter.log("Running TC-5",true);
	}
	
	
}
