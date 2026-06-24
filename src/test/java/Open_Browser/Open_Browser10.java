package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser10 {
	
	public static void main(String[] args) throws InterruptedException {

		//open the chrome browser
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		String title=driver.getTitle();
		System.out.println("WebPage Title: "+title);
		
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.linkedin.com/");
	
		System.out.println("WebPage Title after navigate to: "+driver.getTitle());
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		System.out.println("WebPage Title after back: "+driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		System.out.println("WebPage Title after forward: "+driver.getTitle());
	
		driver.navigate().refresh();
		
		System.out.println("WebPage Title after refersh: "+driver.getTitle());
	}

}
