package Open_Browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//open/launch the browser: Firefox
		FirefoxDriver driver=new FirefoxDriver();
		
		//open url: https://www.linkedin.com/
		driver.get("https://www.linkedin.com/");
		
		Thread.sleep(5000);
		
		//close current browser tab
		driver.quit();
		
	}

}
