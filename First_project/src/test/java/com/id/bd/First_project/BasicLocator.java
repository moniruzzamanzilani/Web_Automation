package com.id.bd.First_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.id.bd.WebAuto.DriverSetup;

public class BasicLocator extends DriverSetup{
	@Test
	public void testGoogleSearch() throws InterruptedException {
		driver.get("https://www.google.com");
		//Locate using ID
//		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		
		//Locate using name
//		WebElement searchBox = driver.findElement(By.name("q"));
		
		//Locate using class name
//		WebElement searchBox = driver.findElement(By.className("gLFyf"));
		
		//Locate using Tag name
		WebElement searchBox = driver.findElement(By.tagName("textarea"));
		searchBox.sendKeys("Test Automation");
		Thread.sleep(2000); 
		searchBox.clear();
		
		//Locate using Link text
		WebElement gmaillink = driver.findElement(By.linkText("Gmail"));
		System.out.println(gmaillink.getText());
		//gmaillink.click(); 
		
		//Locate using parcialText
		WebElement imageSearchLink = driver.findElement(By.partialLinkText("mages"));
		System.out.println(imageSearchLink.getText());
		
		//Locate using CSS selector
		WebElement countryName = driver.findElement(By.cssSelector("div[class='uU7dJb']"));
		System.out.println(countryName.getText());
		
		//Locate using xpath selector
		WebElement langausOption = driver.findElement(By.xpath("//div[@id='SIvCob']"));
		System.out.println(langausOption.getText());
		Thread.sleep(5000);
			
	}

}
