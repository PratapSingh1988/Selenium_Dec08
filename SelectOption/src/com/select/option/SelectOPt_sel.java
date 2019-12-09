package com.select.option;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectOPt_sel {
	WebDriver driver;

	@BeforeMethod
	private void openBrowser()

	{

		String Dir = System.getProperty("user.dir");

		String projectpath = Dir + "\\Browser\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", projectpath);
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.get("https://www.testandquiz.com/selenium/testing.html");
	}

//	@Test
//
//	public void selectOption() {
//
//		Select selectByValue = new Select(driver.findElement(By.id("testingDropdown")));
//
//		selectByValue.selectByValue("Performance");
//
//		driver.findElement(By.id("male")).click();
//
//		WebElement wen = driver.findElement(By.id("fname"));
//
//		wen.clear();
//		wen.click();
//		wen.sendKeys("Pratp Singh");
//
//	}

	/*
	 * @Test
	 * 
	 * public void selectAlert() throws InterruptedException { ///Alert box
	 * selection below
	 * 
	 * // driver.findElement(By.linkText("Generate Alert Box")).click(); // // Alert
	 * alert = driver.switchTo().alert(); // // System.out.println(alert); // //
	 * alert.accept(); ////step----2 alertbox //
	 * driver.findElement(By.linkText("Generate Confirm Box")).click();
	 * 
	 * 
	 * driver.get("http://demo.guru99.com/test/delete_customer.php");
	 * 
	 * 
	 * driver.findElement(By.name("cusid")).sendKeys("53920");
	 * driver.findElement(By.name("submit")).submit();
	 * 
	 * // Switching to Alert Alert alert = driver.switchTo().alert();
	 * 
	 * // Capturing alert message. String alertMessage=
	 * driver.switchTo().alert().getText();
	 * 
	 * // Displaying alert message System.out.println(alertMessage);
	 * Thread.sleep(5000);
	 * 
	 * // Accepting alert alert.accept();
	 * 
	 * }
	 */
	
	@Test
	public  void dragDrop() {
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
WebElement	from	=driver.findElement(By.id("sourceImage"));
		
WebElement to = driver.findElement(By.id("targetDiv"));  


Actions action=new Actions(driver);
try {
	Thread.sleep(50);
	action.dragAndDrop(from, to).build().perform();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
	
	
	
	
	
	

	@AfterMethod

	private void closeBroser() {
		// driver.quit();

	}

}
