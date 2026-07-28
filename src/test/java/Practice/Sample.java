package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	//get all the links from the maketrip page
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/hotels/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Identify the size
		List<WebElement> allSec=driver.findElements(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']//li"));
		
		int size=allSec.size();
		
		Thread.sleep(2000);
		
		for(int i=1; i<=size; i++) {
			
			WebElement section=driver.findElement(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']//li["+i+"]//a"));
			
			System.out.println(section.getText()+" : "+section.getAttribute("href"));
			
		}
		
		driver.quit();
	}
}








