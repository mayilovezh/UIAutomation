package com.selenium.test.clericalmarker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class InformationList {
	static WebDriver driver;
	WebDriverAction action;
	String category = "General Information";

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
		action.click(By.id(ElementHelper.CLERICAL_MARKER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.INFORMATION_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	public void search() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.INFORMATION_LIST_CATEGORY), "4");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.INFORMATION_LIST_TITLE), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.INFORMATION_LIST_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.INFORMATION_LIST_SEARCH_TITLE)),
				ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.INFORMATION_LIST_SEARCH_CATEGORY)), category);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.INFORMATION_LIST_SEARCH_CREATEBY)),
				ElementHelper.USER);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}

	@Test
	public void step01_AddInformation() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.INFORMATION_LIST_ADD));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.INFORMATION_LIST_ADD_CATEGORY), "4");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.INFORMATION_LIST_ADD_ROLES));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.INFORMATION_LIST_ADD_TITLE), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectFrame(By.className(ElementHelper.INFORMATION_LIST_ADD_SWITCH_FRAME));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.className(ElementHelper.INFORMATION_LIST_ADD_CONTENT), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.unSelectFrame();
		driver.findElement(By.id("content"));
		action.click(By.id(ElementHelper.INFORMATION_LIST_ADD_SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}

	@Test
	public void step02_Search() throws Exception {
		search();
	}
	
	@Test
	public void step03_Modify() throws Exception {
		search();
		action.click(By.linkText(ElementHelper.INFORMATION_LIST_MODIFY));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.INFORMATION_LIST_MODIFY_SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	@Test
	public void step04_Delete() throws Exception {
		search();
		action.click(By.linkText(ElementHelper.INFORMATION_LIST_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
}
