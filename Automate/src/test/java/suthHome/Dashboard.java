package suthHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dashboard {

	WebDriver driver;
	@Test
	void dashboard()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sutherlandglobal.com/");
		Reporter.log("started",true);
		WebElement logo =driver.findElement(By.xpath("*//img[@class='site_logo_sticky']"));
		Assert.assertTrue(true, "present");
		System.out.println("logo present" +logo);
		WebElement acttext = driver.findElement(By.xpath("*//span[@class='title-text second']"));
		String exptext ="Unlocking Digital Performance.";
		Assert.assertEquals(acttext,exptext);
		
		
	}
	
	
}
