package com.selenium.test.pretestplanning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class WrittenTemplatesList {
	static WebDriver driver;
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
		action.click(By.id(ElementHelper.PRE_TEST_PLANNING));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.WRITTEN_TEMPLATES_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.WRITTEN_TEMPLATES_LIST_TC), "100043");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void step01_AddTemplates() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.WRITTEN_TEMPLATES_LIST_ADD));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.WRITTEN_TEMPLATES_LIST_ADD_BUILDING), "264");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.WRITTEN_TEMPLATES_LIST_ADD_ALL));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.WRITTEN_TEMPLATES_LIST_SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	//TO DO
	@Test
	public void step02_AddRoom() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.WRITTEN_TEMPLATES_LIST_SEARCH));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.WRITTEN_TEMPLATES_LIST_MODIFY));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.WRITTEN_TEMPLATES_LIST_ADD_ROOM));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
	
	@Test
	public void step03_ModifyTemplates() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.WRITTEN_TEMPLATES_LIST_SEARCH));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.WRITTEN_TEMPLATES_LIST_MODIFY));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.clear(By.id(ElementHelper.WRITTEN_TEMPLATES_LIST_MODIFY_QUOTA));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.WRITTEN_TEMPLATES_LIST_MODIFY_QUOTA), "32");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.WRITTEN_TEMPLATES_LIST_MODIFY_SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
}
