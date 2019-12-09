package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class MouseOver extends BaseClass {

	@Test
	
	public void mouseOver() {
		
		driver.get("http://www.snapdeal.com");
		
		//User Action clas
		
		WebElement signIn = driver.findElement(By.xpath("//div[@class='accountInner']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(signIn);
		action.build().perform();
		
		System.out.println("Mouse  hover done");
		
		//Click on - Login
		
		WebElement login = driver.findElement(By.xpath("//a[text()='login']"));
		login.click();
	System.out.println("Click on Login");
	
	driver.switchTo().frame(driver.findElement(By.id("loginIframe")));
	System.out.println("Switched on frame.");
	
	driver.findElement(By.id("userName")).sendKeys("97989897878");
	System.out.println("Enter Mobile num");
	
	//driver.switchTo().defaultContent();
	
	
	}
	
	
	
}
