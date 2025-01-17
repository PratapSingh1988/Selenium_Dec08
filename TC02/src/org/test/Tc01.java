package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc01 {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		String projectPath = System.getProperty("user.dir");
		String browserDriverEXE = projectPath + "\\Browser\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", browserDriverEXE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("http://www.makemytrip.com");

	}

	@Test

	public void fcebookTest() throws InterruptedException {
		driver.get("http://www.fcebook.com");
//		WebElement facebook = driver.findElement(By.name("email"));
//		facebook.clear();
//		facebook.click(); // Thread.sleep(5000);
//		String title = driver.getTitle();
//
//		System.out.println("Title----Site---title" + title);
//		String vlue = "pratapsingh725@gmail.com";
//		facebook.sendKeys(vlue);
//
//		WebElement password = driver.findElement(By.id("pass"));
//		password.clear();
//		password.click();
//		password.sendKeys("arnav@dev77");

	//	WebElement submit = driver.findElement(By.id("loginbutton"));

		// Below for sign up facebook pages

		// 1-Step

		WebElement eFirstNmae = driver.findElement(By.xpath("//div[@class='placeholder'][1]"));
		eFirstNmae.clear();
		eFirstNmae.click();
		eFirstNmae.sendKeys("Pratap Singh");

		// 2-step

		WebElement lastName = driver
				.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput'][1]"));
		lastName.clear();
		lastName.click();
		lastName.sendKeys("Gujjar");
		
		//3 Step radio button gender 
		
		
		WebElement gender = driver
				.findElement(By.xpath("//span[@class='_5k_2 _5dba']"));
	boolean genderTrure=	gender.isSelected();
		
		System.out.println("Gender---is--selected---"+genderTrure);
		
		
		
		

		// submit.click();

//		driver.findElement(By.xpath("(//p[@class='blackText font20 code'])[1]")).click();
//		WebElement web = driver.findElement(By.xpath("//*[@class='dateInnerCell']"));
//		web.click();
//		web.isSelected();

	}

	@AfterMethod

	public void closeBrowser() {

		//driver.quit();
	}

}
