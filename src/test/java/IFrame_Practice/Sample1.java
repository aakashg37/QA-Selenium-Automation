package IFrame_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//switch focus to iframe
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//button[@id='Click'])[1]")).click();
		
		
		driver.switchTo().defaultContent();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		
		//switch to 2nd frame
		driver.switchTo().frame(1);
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the button and click on it
		driver.findElement(By.xpath("//button[contains(@style,'background: linear-gradient(240deg, #00aadf 0%')]")).click();
		
		//switch focus back to main page
		driver.switchTo().defaultContent();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//switch to 3rd iframe
		driver.switchTo().frame(2);
		
		//switch to nested frame 
		driver.switchTo().frame("frame2");
		
		//identify the button and click on it
		driver.findElement(By.xpath("//button[contains(@style,'background: linear-gradient(240deg, #4b7ecf 0%, #8e70ee 100%)')]")).click();
		
		//close the browser
		driver.quit();
		
		
	}
}





