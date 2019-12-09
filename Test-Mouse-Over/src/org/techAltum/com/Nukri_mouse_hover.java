package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Nukri_mouse_hover {

	
	WebDriver driver;
	@BeforeMethod
	
	public void openBrowser() {
	String homeDir=	System.getProperty("user.dir");
	String projectPath = homeDir + "\\browserDrivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", projectPath);
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.naukri.com");
		
	}
	
	
	
	@Test
	
	public void mouseHover() {
		
		WebElement signIn = driver.findElement(By.xpath("//ul[@class='otherSec']"));
		Actions action=new Actions(driver);
		//mouse hover in foremployers
		action.moveToElement(signIn);
		
		action.build().perform();
		
		//div[@class='subMenu'][1]
		
		WebElement siginINside=driver.findElement(By.xpath("//div[@class='subMenu'][1]"));
		//mouse hover after click in Buy Online
		
		//mouse hover in foremployers
		action.moveToElement(siginINside);
		action.click();
		
		
	}
	
	
	@AfterMethod
	
	
	public void closeChromeBrowser() {
		
		//driver.close();
		
	}
	
	
	
	
	
}
