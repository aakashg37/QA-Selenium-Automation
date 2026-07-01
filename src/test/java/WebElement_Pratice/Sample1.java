package WebElement_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
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

		//select the male radio button
		maleBtn.click();
		
		//wait for 1 sec
		Thread.sleep(2000);
		
		//write a program to click on,if male button is not selected then select the female button else vice-versa
		if(maleBtn.isSelected()) {
			
			//check if female button is enabled or not
			if(femaleBtn.isEnabled()) 
			{
				//click on female button
				femaleBtn.click();
				System.out.println("Female radio button is enabled and has been clicked successfully");
			}
			else 
			{
				System.out.println("Female radio button is not enabled. Please try again");
			}
		}
		else 
		{
			//check if male radio button is enabled or not
			if(maleBtn.isEnabled()) {
				//click on male radio button
				maleBtn.click();			
				System.out.println("Male radio  button is enabled and  has been clicked successfully");
			}
			else {
				System.out.println("Male radio button is not enabled. Plese try again");
			}
		}
		
	}

}
