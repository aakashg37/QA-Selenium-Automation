package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser11 {
	
	//to maximize/minimize the browser window
	public static void main(String[] args) throws InterruptedException {
		
		//open/launch the browser: chrome		
		WebDriver driver=new ChromeDriver();
		
		//open the url
		driver.get("https://www.linkedin.com/");
		
		Thread.sleep(3000);
		
		
		//maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//minimize the window
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
