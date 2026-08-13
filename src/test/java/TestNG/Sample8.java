package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample8 {
	
	@Test
	public void TC1() {
		String actualResult=null;
		Assert.assertNull(actualResult);		
	}
	
	@Test
	public void TC2() {
		String actualResult="VK1234";
		Assert.assertNull(actualResult);
	}
	
	
}
