package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class SpkRoomTemplate {
	static WebDriver driver;
	WebDriverAction action;
	String templateSat = "BJ-UIBE-Sat";
	String templateThu = "BJ-UIBE-Thu";

	@BeforeMethod
	public void setUp() {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TEST_CENTER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SPK_ROOM_TEMPLATE));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_REGION), "1");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_TEST_CENTER), "100100");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.SPK_TEMPLATE_SEARCH));

	}

	@Test
	public void createThursday() throws Exception {
		navigate();
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SPK_TEMPLATE_ADD_BUILDING1));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.xpath(ElementHelper.SPK_TEMPLATE_ADD_ROOM));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD_SAVE));
			Thread.sleep(ElementHelper.SHORT_TIME);
	}

	@Test
	public void createSaturday() throws Exception {
		navigate();

		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SPK_TEMPLATE_ADD_SATURDAY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SPK_TEMPLATE_ADD_BUILDING2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.SPK_TEMPLATE_ADD_ROOM));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD_SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}

	public void search() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_SATURDAY)), templateSat);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_THURSDAY)), templateThu);
	}

	@Test
	public void searchTemplate() throws Exception {
		search();
	}

	@Test
	public void modify() throws Exception {
		search();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.linkText(ElementHelper.SPK_TEMPLATE_MODIFY));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.SPK_TEMPLATE_MODIFY_ROOM));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.SPK_TEMPLATE_MODIFY_SAVE));
	}

	@Test
	public void view() throws Exception {
		search();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.linkText(ElementHelper.SPK_TEMPLATE_VIEW));
		Thread.sleep(ElementHelper.WAIT_TIME);
		isroomChecked();
	}

	public boolean isroomChecked() {
		boolean status = false;
		try {
			driver.findElement(By.xpath("//imput[contains(@checked,'checked')]"));
			status = true;
		} catch (NoSuchElementException e) {
			status = false;
		}
		return status;
	}

	@Test
	public void deleteSat() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SPK_TEMPLATE_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
	}

	@Test
	public void deleteThu() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.linkText(ElementHelper.SPK_TEMPLATE_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
	}

}
