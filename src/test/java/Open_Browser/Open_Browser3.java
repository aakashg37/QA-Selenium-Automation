package Open_Browser;

import org.openqa.selenium.edge.EdgeDriver;

public class Open_Browser3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Open/launch the Browser: Edge
		EdgeDriver driver=new EdgeDriver();
		
		
		//open the url https://groww.in/
		driver.get("https://groww.in/");
		
		
		Thread.sleep(3000);
		
		
		//close the current browser tab
		driver.quit();
	}

}
