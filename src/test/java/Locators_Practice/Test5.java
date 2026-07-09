package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//identify the FirstName input field and send the data
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Virat");
		
		//identify the Lastname input field and send the data into input
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kohli");
		
		//identify the Address field and send the data into it
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Alibag");
		
		//identify the email field and send the data into it
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("kohli@rcb.com");
		
		//identify the phone field and send the data into it
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9123456783");
		
		//Identify the Gender radio button and click on it
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		
		//identify the Hobbies and select the checkbox
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		
		//identify the languages and select the language
		//driver.findElement(By.xpath("//a[text()='German']")).click();
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		
		//identify the skills dropdown and select the skill
		WebElement	skillsDropdown=driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select skill=new Select(skillsDropdown);
		
		skill.selectByVisibleText("Data Analytics");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the Selectcountry dropdown and select the country
		WebElement	countryDropdown=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select country=new Select(countryDropdown);
		
		country.selectByVisibleText("Netherlands");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the year, month and day dropdown and select them
		WebElement	yearBox=driver.findElement(By.xpath("//select[@id='yearbox']"));
		
		Select year=new Select(yearBox);
		
		year.selectByVisibleText("1999");
		
		
		WebElement	monthBox=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		
		Select month=new Select(monthBox);
		
		month.selectByVisibleText("September");
		
		
		WebElement	dayBox=driver.findElement(By.xpath("//select[@id='daybox']"));
		
		Select day=new Select(dayBox);
		
		day.selectByVisibleText("11");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the password field and send the password
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Virat@17");
		
		//identify the confirm password field and send the password in it
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Virat@17");
		
		//wait for 2 sec
				Thread.sleep(4000);
		
		
		//Identify the submit button and click on it
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
	}

}










