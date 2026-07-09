package HandlingList_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {
	
	public static void main(String[] args) throws InterruptedException {
	
		//launch the browser: Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//maximize the screen
		driver.manage().window().maximize();

		//identify  the element and store it in object
		WebElement skillsDropdown=driver.findElement(By.xpath("//select[@id='Skills']"));
		
		//create the select object and pass the dropdown as parameter into constructor
		Select selectSkills=new Select(skillsDropdown);
		
		//select the skiils by using seletVisibleText()
		selectSkills.selectByVisibleText("Data Analytics");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		WebElement yearBox=driver.findElement(By.cssSelector("select#yearbox"));		
		Select year=new Select(yearBox);
		
		
		WebElement	monthBox=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select month=new Select(monthBox);
		
		
		WebElement dayBox=driver.findElement(By.cssSelector("select#daybox"));
		Select day=new Select(dayBox);
		
		
		year.selectByValue("1999");
		month.selectByValue("September");
		day.selectByValue("11");
		
	}
}








