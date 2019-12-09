package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class Tc01 extends BaseClass {

	@Test

	private void selectOption() {

		driver.get("http://www.cheapoair.com");

		// Select PAX
		// Select Adults
		Select adults = new Select(driver.findElement(By.name("Adults")));

		adults.selectByIndex(3);
		// Select Seniors
		Select seniors = new Select(driver.findElement(By.name("Seniors")));
		seniors.selectByValue("5");

		// Select Youth
		Select youth = new Select(driver.findElement(By.name("Youths")));
		youth.selectByVisibleText("6");

		// Select childeren

		Select childeren = new Select(driver.findElement(By.name("Children")));

		childeren.selectByVisibleText("5");

		System.out.println("Select childern done---");
	}

}
