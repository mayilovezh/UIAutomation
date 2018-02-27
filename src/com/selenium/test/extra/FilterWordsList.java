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
	String name = "Zhang Yifan";
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
		action.click(By.id(ElementHelper.CS_EXTRA));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.FILTER_WORDS));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void addAddress() throws Exception {
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
	
	@Test(dependsOnMethods = { "addAddress"})
	public void addDepartment() throws Exception {
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
	
	@Test(dependsOnMethods = { "addDepartment"})
	public void addInstitution() throws Exception {
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
	
	@Test(dependsOnMethods = { "addInstitution"})
	public void modify() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.FILTER_WORDS_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.clear(By.id(ElementHelper.FILTER_WORDS_ADD_NAME));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.FILTER_WORDS_ADD_NAME), words);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
	@Test(dependsOnMethods = { "modify"})
	public void modifyCheck() throws Exception {
		navigate();
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FILTER_WORDS_MODIFY_WORDS)), words);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FILTER_WORDS_MODIFY_NAME)), name);
	}
	
	@Test(dependsOnMethods = { "modifyCheck"})
	public void deleteAddress() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.FILTER_WORDS_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	@Test(dependsOnMethods = { "deleteAddress"})
	public void deleteDepartment() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.FILTER_WORDS_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	@Test(dependsOnMethods = { "deleteDepartment"})
	public void deleteInstitution() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.FILTER_WORDS_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
}
