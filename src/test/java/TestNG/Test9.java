package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test9 {
	
	@Test()
	public void TC1() {
		Reporter.log("TC-1",true);
	}
	
	@Test(timeOut=3000)
	public void TC2() throws InterruptedException {
		//Assert.fail();
		Thread.sleep(2000);
		//Thread.sleep(4000);
		Reporter.log("TC-2",true);
	}
	
	@Test()
	public void TC3() {
		Reporter.log("TC-3",true);
	}
	
	@Test()
	public void TC4() {
		Reporter.log("TC-4",true);
	}

}
