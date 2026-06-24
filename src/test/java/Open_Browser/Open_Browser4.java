package Open_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser4 {

	public static void main(String[] args) throws InterruptedException {
		
		//open the Browser: Chrome
		ChromeDriver driver=new ChromeDriver();
		
		//open/launch the url: https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		//close the current browser tab
		driver.quit();
		
	}
	
}
