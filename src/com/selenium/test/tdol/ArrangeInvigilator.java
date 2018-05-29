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

public class ArrangeInvigilator {
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
		action.click(By.xpath(ElementHelper.ARRANGE_INVIGILATOR));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void arrange() throws Exception {
		navigate();
		action.selectByIndex(By.id(ElementHelper.ARRANGE_INVIGILATOR_MONTH), 0);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.ARRANGE_INVIGILATOR_DATE), 1);
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByIndex(By.id(ElementHelper.ARRANGE_INVIGILATOR_TC), 1);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.ARRANGE_INVIGILATOR_SEARCH));
		action.setTimeout("20");
		WebElement drag = driver.findElement(By.xpath(ElementHelper.ARRANGE_INVIGILATOR_DRAG));
		WebElement drop = driver.findElement(By.xpath(ElementHelper.ARRANGE_INVIGILATOR_DROP));
		(new Actions(driver)).dragAndDrop(drag, drop).perform();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.ARRANGE_INVIGILATOR_SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
}
