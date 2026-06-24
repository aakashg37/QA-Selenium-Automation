package Open_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser1 
{

	public static void main(String[] args) throws InterruptedException {
		
		//Open/Launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		
		//enter the url : 
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		//close the browser
		driver.quit();
		
	}
	
	
}
