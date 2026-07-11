package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {
	//switch to frame and switch back to main page (using defaultContent() )
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser: Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		//wait for 2 sec
		Thread.sleep(2000);
				
		//identify the element and click on it
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//switch to main page [using defaultContent() ]
		//defaultContent() --> To shift focus from any frame to main page
		driver.switchTo().defaultContent();
		
		//click on home icon
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
		
	}
	
	
	
}
