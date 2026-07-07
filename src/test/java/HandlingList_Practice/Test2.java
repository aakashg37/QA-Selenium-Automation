package HandlingList_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://demowebshop.tricentis.com/apparel-shoes");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//itdentify the sortBy List and store in object
		//WebElement	sortyBy=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		//create the select class object
		//Select selectSort=new Select(sortyBy);
		
		//select the sort by using selectVisibleText() of Select class
		//selectSort.selectByVisibleText("Name: Z to A");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		
		String[] options= {"Name: A to Z","Name: Z to A","Price: Low to High","Price: High to Low","Created on"};
		
		
		for(String selectOne :options) {
				
			//itdentify the sortBy List and store in object
			WebElement	sortyBy=driver.findElement(By.xpath("//select[@id='products-orderby']"));
			
			//create the select class object
			Select selectSort=new Select(sortyBy);
			
			selectSort.selectByVisibleText(selectOne);
			//wait for 2 sec
			Thread.sleep(2000);
			
		}
		
		
	}



}





