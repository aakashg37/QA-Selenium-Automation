package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample9 {

	@Test
	public void TC1() {
		String actualResult="VK@123";
		Assert.assertNotNull(actualResult);		
	}
	
	@Test
	public void TC2() {
		String actualResult=null;
		Assert.assertNotNull(actualResult);
	}
	
	
	
}
