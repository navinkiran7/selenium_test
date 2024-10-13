package seleniumtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Automation_test_1 {
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.partialLinkText("PDA")).click();
		
		driver.close();
	}

}
