package org.com.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Snapdel  {

	
	//interface selbdriver
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		String projectPath=System.getProperty("user.dir");
		
		String browserDriverEXE = projectPath + "\\Browsers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", browserDriverEXE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.snapdeal.com");
		
		
	}
	
	@Test
	
	public void snapdeal() {
		//use xpath for below types
		//WebElement snap= driver.findElement(By.xpath("(//*[@class='dp-widget-link hookLink'])[1]"));
		
		WebElement snap= driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		
		snap.click();
	}
	
	
	@AfterMethod
	
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}
