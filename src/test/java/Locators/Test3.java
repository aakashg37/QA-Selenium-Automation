package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args) {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		
		//launch the url
		driver.get("https://orangehrm.com/");
		
		//Task enter the email
		//  //tagname[@attributename ='attribute value']
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("akashg@gmail.com");
		
	}
}
