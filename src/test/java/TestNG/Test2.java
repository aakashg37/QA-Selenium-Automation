package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(priority=2)
	public void TC1() {				//Test Method/Case
		Reporter.log("TC-1",true);
	}

	
	@Test(priority=1)
	public void TC2() {				//Test Method/Case
		Reporter.log("TC-2",true);
	}
}
