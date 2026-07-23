package Pop_up;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//click on the New Tab button
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Thread.sleep(4000);
		
		
		//get all IDs of the window (MainPageId, ChildPageID/pop-up window ID)
		//return A set of window handles which can be used to iterate over all open windows.
		 Set<String> allId=driver.getWindowHandles();	//windowId childID
		 
		 //print all the IDs
		 System.out.println(allId);
		
		 ArrayList<String> al=new ArrayList<String>(allId);
		 
		 String MpID=al.get(0);
		 String wpID=al.get(1);
		 
		 //switch to window pop tab
		driver.switchTo().window(wpID);
		 
		Thread.sleep(4000);
		
		//Click on the training link
		driver.findElement(By.xpath("(//span[@class='menu-text'])[22]")).click();
		
		Thread.sleep(2000);
		
		//switch back to main page
		driver.switchTo().window(MpID);
		
		Thread.sleep(2000);
		
		//click on the Home button
		driver.findElement(By.xpath("//input[@name='home']")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}






