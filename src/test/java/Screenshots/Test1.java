package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Test1 {

	//capture screenshot of visible/viewport page
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		//wait for 2 secs
		Thread.sleep(2000);
		
		//downcast driver object to ts object(TakesScreenshot)
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);		
		
		//return type of method is File
		//method takes the argument as OutputType means in which type we want the output(File,bytes,class,etc)
		//and the method return the output as File type(the path where file is stored) as specified in the argumnet
		//File is the class
		
		//print the path of the file
		System.out.println(source);
		
		//create object of the File class
		File destination=new File("D:\\21stMarchFSST\\screenshot1.png");
		
		//now copy the file from the source to the destination folder 
		Files.copy(source,destination);
		
		
		driver.quit();
	}
	
}






