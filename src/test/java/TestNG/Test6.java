package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test6 {

	@Test(priority=2)
	public void TC1() {				//Test Method/Case
		Reporter.log("TC-1",true);
	}

	
	@Test(priority=1)
	public void TC2() {				//Test Method/Case
		Reporter.log("TC-2",true);
	}
	
	@Test()					//by default 0
	public void TC3() {				//Test Method/Case
		Reporter.log("TC-3",true);
	}
	
	@Test()					//by default 0
	public void TC4() {				//Test Method/Case
		Reporter.log("TC-4",true);
	}
	
	@Test(priority=1)
	public void TC5() {				//Test Method/Case
		Reporter.log("TC-5",true);
	}
	
	@Test(priority=-1)
	public void TC6() {				//Test Method/Case
		Reporter.log("TC-6",true);
	}
	
	@Test(priority=-2)
	public void TC7() {				//Test Method/Case
		Reporter.log("TC-7",true);
	}
	
	//TC7->TC6->TC3->TC4->TC2->TC5->TC1
}
