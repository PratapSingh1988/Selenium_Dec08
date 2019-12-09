package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {


		protected WebDriver driver;
		
		@BeforeMethod
		public void openBrowser() {
			String projectPath = System.getProperty("user.dir");
			System.out.println("Projejct Path is = " + projectPath);
			
			String browserDriverPath = projectPath + "\\browserDrivers\\chromedriver.exe";
			System.out.println("Browser Driver exe path = " + browserDriverPath);
			
			System.setProperty("webdriver.chrome.driver", browserDriverPath);
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//Cookies
			/*
			 * driver.manage().deleteAllCookies();
			 * 
			 * driver.navigate().
			 */
			
		}
		
		@AfterMethod
		public void quitBrowser() {
			//driver.quit();
		}
	}

	

