package WebElement_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//identify Male Gender Button & store as a WebElmenet
		WebElement maleBtn=driver.findElement(By.cssSelector("input#male"));
		
		WebElement femaleBtn=driver.findElement(By.cssSelector("input#female"));
		
		//check if male button is selected
		System.out.println("Male button is Selected : "+maleBtn.isSelected());
		
		//check if female button is selected
		System.out.println("Female button is Selected : "+femaleBtn.isSelected());
		
		//wait for 1 sec
		Thread.sleep(1000);
		
		//Identify days 
		WebElement sunday=driver.findElement(By.cssSelector("input#sunday"));
		WebElement monday=driver.findElement(By.cssSelector("input#monday"));
		
		//wait for 1 sec
		Thread.sleep(1000);
		
		//click on sunday,monday
		sunday.click();
		monday.click();
		
	}

}








