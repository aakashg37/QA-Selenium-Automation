package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	
	@Test
	public void TC1()
	{
		String s1="Hi";
		String s2="Hello";
		String s3="Good Morning";
		
		SoftAssert soft=new SoftAssert(); 
		
		soft.assertNotEquals(s2,s1);		//Hello,Hi  Pass
		soft.assertEquals(s2,s1);		//Hello,Hi Fail
		soft.assertEquals(s3,s1);		//Good Morning,Hi Fail
		soft.assertNotEquals(s3,s1);		//Good Morning,Hi Pass
		
		
		soft.assertAll();
		
	}


}
