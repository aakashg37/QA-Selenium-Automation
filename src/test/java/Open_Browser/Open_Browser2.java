package Open_Browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//open/launch the Browser: Firefox
		FirefoxDriver driver=new FirefoxDriver();
		
		
		//open the url: https://kite.zerodha.com/
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
		
	}

}
