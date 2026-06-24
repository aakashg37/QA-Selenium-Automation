package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		//4)Tag Class & attribute
		//syntax:  tagname.Classattributevalue[attributename='attributevalue']
		
		driver.findElement(By.cssSelector("button.button-orange[type='submit']")).click();
		
	}
}
