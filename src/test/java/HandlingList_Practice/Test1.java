package HandlingList_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {	
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser: Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.navigate().to("https://demowebshop.tricentis.com");
		
		//maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//go to the books categories
		driver.navigate().to("https://demowebshop.tricentis.com/books");
		
		//1) identify the SortBy listing and store it in object
		WebElement	sortByList=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		//create the object of select class
		Select selectSort=new Select(sortByList);
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//select the sortby using visibletext() from select class
		selectSort.selectByVisibleText("Price: Low to High");
		
		//wait dor 2 sec
		Thread.sleep(2000);
		
		//2) Identify the display List and store it in object
		WebElement	displayList=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		
		//create the object of select class
		Select selectDisplay=new Select(displayList);
		
		selectDisplay.selectByVisibleText("4");
		
		//wait dor 2 sec
		Thread.sleep(2000);
		
		//3) Identify "View as" and store it in object
		WebElement viewAs=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		
		//create the object of the select class
		Select selectViewAs=new Select(viewAs);
		
		selectViewAs.selectByVisibleText("List");
		
		
		
	}

}






