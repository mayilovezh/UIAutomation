package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.DriverInstance;
import com.selenium.test.element.ElementHelper;
import com.selenium.test.listener.WebDriverAction;

public class TestBuildingList {
	String tbName = "对外经济贸易大学";
	String tbName_Cn = "";
	String tbName_En = "";
	String floor = "";
	String tbAddress_Cn = "";
	String tbAddress_En = "";
	static WebDriver driver;
	WebDriverAction action;

	@BeforeMethod
	public void setUp() {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void searchTB() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TEST_CENTER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TEST_BUILDING_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.isVisible(By.id(ElementHelper.TB_REGION));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TB_REGION), "1");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TB_CENTER), "100100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TB_SEARCH));
	}

	@Test
	public void create() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TB_NAME)), tbName);
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.TB_CREATE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TB_ADD_NAME_CN), tbName_Cn);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TB_ADD_NAME_EN), tbName_En);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.TB_TYPE_SPEAKING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.TB_TYPE_WRITING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.TB_TYPE_CB));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TB_FLOOR), floor);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TB_ADDRESS_CN), tbAddress_Cn);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TB_ADDRESS_CN), tbAddress_En);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.cssSelector(ElementHelper.TB_SAVE));
	}

	@Test
	public void search() {

	}
}
