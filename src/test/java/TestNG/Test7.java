package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test7 {
	
	@Test()
	public void TC1() {
		Reporter.log("TC-1",true);
	}
	
	@Test()
	public void TC2() {
		Reporter.log("TC-2",true);
	}
	@Test(enabled=false)
	public void TC3() {
		Reporter.log("TC-3",true);
	}
	
	@Test()
	public void TC4() {
		Reporter.log("TC-4",true);
	}
	
	@Test()
	public void TC5() {
		Reporter.log("TC-5",true);
	}

}
