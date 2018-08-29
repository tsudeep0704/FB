package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class football {

public static void main (String args[]) throws InterruptedException
		{
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohah\\Desktop\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize(); //Maximizing the windows
	
	driver.get("http://www.dailymail.co.uk/ushome/index.html");
	
	//Thread.sleep(5000);
	//driver.quit();
	
	}
}
