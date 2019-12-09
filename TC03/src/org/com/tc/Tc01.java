package org.com.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc01 {

	
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
	String	projectPath=System.getProperty("user.dir");
		String browserDriverEXE = projectPath + "\\Browser\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", browserDriverEXE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.fcebook.com");
	}
	
	@Test
	
public void fcebookTest() throws InterruptedException {
		
		WebElement  facebook=driver.findElement(By.name("email"));
		facebook.clear();
		facebook.click();
	//	Thread.sleep(5000);
				
		String vlue="pratapsingh725@gmail.com";
		facebook.sendKeys(vlue);
		
		WebElement password=driver.findElement(By.id("pass"));
		password.clear();
		password.click();
		password.sendKeys("arnav@dev77");
		
		WebElement submit=driver.findElement(By.id("loginbutton"));
		
		submit.click();
	}
	
	@AfterMethod
	
public void closeBrowser() {
		
		driver.quit();
	}
	
	
	
	
}