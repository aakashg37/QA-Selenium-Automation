package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {

	@Test(priority=2)
	public void TC1() {				//Test Method/Case
		Reporter.log("TC-1",true);
	}

	
	@Test(priority=1)
	public void TC2() {				//Test Method/Case
		Reporter.log("TC-2",true);
	}
	
	@Test()				//by default 0
	public void TC3() {				//Test Method/Case
		Reporter.log("TC-3",true);
	}
	
	@Test(priority=1)
	public void TC4() {				//Test Method/Case
		Reporter.log("TC-4",true);
	}
	
	//TC3 -> TC2 -> TC4 -> TC1
}
