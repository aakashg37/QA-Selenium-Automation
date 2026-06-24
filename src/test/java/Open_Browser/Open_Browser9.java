package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Open_Browser9 {
	public static void main(String[] args) throws InterruptedException {
		
		//open the Edge Browser
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://groww.in/");
		
		Thread.sleep(4000);
		
		String title=driver.getTitle();
		System.out.println("WebPage Title: "+title);
		
		driver.quit();
	}
}
