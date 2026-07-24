package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.testmuai.com/selenium-playground/");
		
		Thread.sleep(2000);
		
		List<WebElement> lists=driver.findElements(By.xpath("//a[@class='text-black text-size-14 hover:text-lambda-900 leading-relaxed']"));
		
		System.out.println("Total Elments Found : "+ lists.size());
		
		for(WebElement list : lists)
		{
			System.out.println(list.getText() + " : "+list.getAttribute("href"));
		}
		driver.quit();
	}
}
/*
 
 getAttribute() 
 Get the value of the given attribute of the element. 
 Will return the current value, even if this has been modified after the page has been loaded.

 */





