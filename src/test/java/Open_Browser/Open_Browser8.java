package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//open the chrome browser
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");

		Thread.sleep(4000);
		
		driver.navigate().to("https://www.linkedin.com/");
	
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
	
		driver.navigate().refresh();
	}

}
