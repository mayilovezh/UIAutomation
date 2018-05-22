package com.selenium.test.extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class FilterWordsList {
	static WebDriver driver;
	WebDriverAction action;
	String words = "Automation";
	String name = "ZYF";
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
		action.click(By.id(ElementHelper.CS_EXTRA));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.FILTER_WORDS));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step01_AddAddress() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.FILTER_WORDS_ADD));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.FILTER_WORDS_ADD_NAME), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FILTER_WORDS_ADD_TYPE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step02_AddDepartment() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.FILTER_WORDS_ADD));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.FILTER_WORDS_ADD_NAME), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FILTER_WORDS_ADD_TYPE), 2);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step03_AddInstitution() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.FILTER_WORDS_ADD));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.FILTER_WORDS_ADD_NAME), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FILTER_WORDS_ADD_TYPE), 3);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step04_Modify() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.FILTER_WORDS_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.clear(By.id(ElementHelper.FILTER_WORDS_ADD_NAME));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.FILTER_WORDS_ADD_NAME), words);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
	@Test
	public void step05_ModifyCheck() throws Exception {
		navigate();
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FILTER_WORDS_MODIFY_WORDS)), words);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FILTER_WORDS_MODIFY_NAME)), ElementHelper.USER_NAME_UAT);
	}
	
	@Test
	public void step06_DeleteAddress() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.FILTER_WORDS_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	@Test
	public void step07_DeleteDepartment() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.FILTER_WORDS_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	@Test
	public void step08_DeleteInstitution() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.FILTER_WORDS_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
}
