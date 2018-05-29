package com.selenium.test.tdol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;
import org.openqa.selenium.interactions.Actions;

public class ArrangeSupervisor {
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
		action.click(By.xpath(ElementHelper.ARRANGE_SUPERVISOR));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void step01_ArrangeSupervisor() throws Exception {
		navigate();
		action.selectByIndex(By.id(ElementHelper.ARRANGE_SUPERVISOR_MONTH), 5);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.ARRANGE_SUPERVISOR_DATE), "10220");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.ARRANGE_SUPERVISOR_TEST_DAY1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.ARRANGE_SUPERVISOR_SEARCH));
		Thread.sleep(40000);
		WebElement drag = driver.findElement(By.xpath(ElementHelper.ARRANGE_SUPERVISOR_DRAG));
		WebElement drop = driver.findElement(By.id(ElementHelper.ARRANGE_SUPERVISOR_DROP));
		(new Actions(driver)).dragAndDrop(drag, drop).perform();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.ARRANGE_SUPERVISOR_SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}

}
