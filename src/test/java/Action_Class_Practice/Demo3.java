package Action_Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {
	//right click action
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser: Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://practice.expandtesting.com/context-menu#google_vignette");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		
		//identify the element and store it in object
		WebElement rightClck=driver.findElement(By.xpath("//div[@id='hot-spot']"));
		
		
		//create actions class object
		Actions action=new Actions(driver);
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//call the method
		action.contextClick(rightClck).perform();
		
		
		
	}
		
}









