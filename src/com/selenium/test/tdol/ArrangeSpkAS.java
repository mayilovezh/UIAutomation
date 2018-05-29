package com.selenium.test.tdol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ArrangeSpkAS {
	WebDriver driver;
	WebDriverAction action;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDOL));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.ARRANGE_SAS));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void arrange() throws Exception {
		navigate();
		action.selectByIndex(By.id(ElementHelper.ARRANGE_SAS_MONTH), 5);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.ARRANGE_SAS_DATE), "10220");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByIndex(By.id(ElementHelper.ARRANGE_SAS_DUTY), 2);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SPK_AS_TEST_DAY1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.ARRANGE_SAS_SEARCH));
		Thread.sleep(30000);
		WebElement drag = driver.findElement(By.xpath(ElementHelper.SPK_AS_DRAG));
		WebElement drop = driver.findElement(By.id(ElementHelper.SPK_AS_DROP));
		(new Actions(driver)).dragAndDrop(drag, drop).perform();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.ARRANGE_SAS_SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
}
