package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	//CSS 
	/*
		1) Tag & ID 	2)Tag & Class  3)Tag & attribute 4)Tag Class & attribute
	*/
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		//1) Tag & ID
		//syntax:  tagname#Idattributevalue
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Virat Kohli");
		

		//2) Tag & Class
		//syntax:  tagname.Classattributevalue
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Alibag");
		
		//3)Tag & attribute 
		//syntax:  tagname[attributename='attributevalue']
		driver.findElement(By.cssSelector("input[class=\"mr-sm-2 form-control\"]")).sendKeys("kohli@rcb.com");
				
	}
}






