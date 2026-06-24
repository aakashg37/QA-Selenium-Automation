package Open_Browser;

import org.openqa.selenium.edge.EdgeDriver;

public class Open_Browser6 {
	public static void main(String[] args) throws InterruptedException {
		
		//open/launch browser: Edge
		EdgeDriver driver=new EdgeDriver();
			
		
		//open the url: https://www.online-java.com/
		driver.get("https://www.online-java.com/");
		
		
		Thread.sleep(5000);
		
		//close current browser tab
		driver.quit();
	}
}
