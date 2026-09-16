package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Drawbacks_Of_Hard_Assert {

	
	@Test
	public void TC1() {
		
		String s1="Hi";
		String s2="Hello";
		String s3="Good Morning";
		
		Assert.assertNotEquals(s2, s1);	//Hello,Hi  Pass
		Assert.assertEquals(s2, s1);		//Hello,Hi Fail
		Assert.assertEquals(s3, s1);		//Good Morning,Hi Fail
		Assert.assertNotEquals(s3,s1);	//Good Morning,Hi Pass
		
		
	}
	
}





