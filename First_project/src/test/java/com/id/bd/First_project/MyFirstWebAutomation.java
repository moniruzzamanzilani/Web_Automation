package com.id.bd.First_project;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.id.bd.WebAuto.DriverSetup;


public class MyFirstWebAutomation extends DriverSetup{
	@Test 
	public void loadGoogleHomePage() throws InterruptedException{
		//Open a browser
//		WebDriver driver = new ChromeDriver();
				
		//maximize browser window
		driver.manage().window().maximize();
		//Load web
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(),"Google");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
		
		//close browser
//		driver.close();
				

	}
	
	
	@Test 
	public void loadFacebookHomePage() throws InterruptedException{
		//Open a browser
//		WebDriver driver = new ChromeDriver();
				
		//maximize browser window
		driver.manage().window().maximize();
		//Load web
		driver.get("https://www.facebook.com");
		
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		
		//close browser
//		driver.close();
				

	}
}
	

