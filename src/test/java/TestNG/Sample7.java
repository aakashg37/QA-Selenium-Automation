package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample7 {
	
	@Test
	public void TC1() {
		boolean actualResult=true;
		Assert.assertFalse(actualResult);		
	}
	
	@Test
	public void TC2() {
		boolean actualResult=false;
		Assert.assertFalse(actualResult);
	}

}
