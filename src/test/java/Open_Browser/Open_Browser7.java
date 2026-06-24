package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser7 {
	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//open the url
		driver.get("https://www.linkedin.com/");
		
		Thread.sleep(4000);
		
		//close current browser tab
		driver.quit();
		
	}

}
