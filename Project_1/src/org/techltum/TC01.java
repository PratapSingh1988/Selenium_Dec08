package org.techltum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {
	


	//Declare WebDriver is an Interface
	WebDriver driver;
	
	@BeforeMethod
	public void  openBrowser() {
		//F:\Sel_Projects_v8\TechAltum_Selenium_Project_2\browserDriverEXE\chromedriver.exe
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is = " + projectPath);
		
		String browserDriverEXE = projectPath + "\\BrowserDrivers\\chromedriver.exe";
		System.out.println("Browser Driver exe path = " + browserDriverEXE);
		
		
		  System.setProperty("webdriver.chrome.driver", browserDriverEXE);
		  driver = new  ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://www.naukri.com");
		  String title=driver.getTitle();
		  
		  System.out.println("Title====="+title);
	}
	
	@Test
	public void testNaukri() throws Exception{
		//click on search job text box
		//driver.findElement(By.id("qsbClick")).click();
		
		/*
		 * WebElement searchJobTextBox = driver.findElement(By.id("qsbClick"));
		 * searchJobTextBox.click();
		 * System.out.println("Click on Search job text box.");
		 * 
		 * //enter skills WebElement skills = driver.findElement(By.name("qp"));
		 * skills.clear(); skills.sendKeys("Java");
		 * System.out.println("Skill is entered.");
		 * 
		 * //enter location driver.findElement(By.name("ql")).clear();
		 * driver.findElement(By.name("ql")).sendKeys("Noida");
		 * System.out.println("Location is entered");
		 * 
		 * //CLick on Search WebElement searchButton =
		 * driver.findElement(By.id("qsbFormBtn")); searchButton.click();
		 * System.out.println("Click on search button box");
		 * 
		 * //Verify total no. of jobs on nect page based on Skill and location
		 * Thread.sleep(2000);
		 * 
		 * WebElement totalJobs =
		 * driver.findElement(By.xpath("//div[@class='small_title']"));
		 * System.out.println(totalJobs); String jobs = totalJobs.getText();
		 * System.out.println(jobs);
		 */
		
	driver.findElement(By.id("qsbClick"));
	WebElement  recruiterss=driver.findElement(By.id("qsbClick"));
	
	//recruiterss.clear();
	recruiterss.click();
	
	System.out.println("cliccckck"+recruiterss);
	
	String jobs="Java";
	WebElement skillls= driver.findElement(By.name("qp"));
	skillls.click();
	skillls.sendKeys(jobs);
	WebElement button=driver.findElement(By.id("qsbFormBtn"));
	
	button.click();
	
	//search box nukri
//	driver.findElement(By.xpath("//div[@class='inpWrap']")).click();

	
	//recruiterss.sendKeys(jobs);
	//WebElement skills=driver.findElement(By.xpath("//div[@class='inpWrap']"));
	
	
//	driver.findElement(By.xpath("//button[@class='col search l2 btn btn-mid']")).click();
	
	}
	
	@AfterMethod
	public void closeBrowser() {
		//driver.quit();
		//driver.close();
	}

	
	
	
	
	
	
	
}
