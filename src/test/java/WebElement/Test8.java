package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
				
		//enter the url
		driver.get("https://testautomationpractice.blogspot.com/");
			
		//maximize the window
		driver.manage().window().maximize();
			
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the radio button & store as a web element
		WebElement radioButton=driver.findElement(By.cssSelector("input#male"));
		
		//check if radio button is selected or not
		boolean t8=radioButton.isSelected();
		
		//display radio button is selected or not (true or false))
		System.out.println(t8);
		
		Thread.sleep(1000);
		
		//now click on the radioButton
		radioButton.click();
		
		//check if radio button is selected
		boolean t_8=radioButton.isSelected();
		
		//display the value 
		System.out.println(t_8);
		
	}
}






