package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestCenterList{
	String tcName = "对外经济贸易大学";
	String tcEName = "University of International Business and Economics";
	String abbreviation = "UIBE";
	String address = "朝阳区惠新东街10号(中日友好医院北侧)";
	String addressE = "Chaoyang District, No. 10 Huixin East Street (Sino-Japanese Friendship Hospital on the north side)";
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
	
	public void searchTC() throws InterruptedException {
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.TEST_CENTER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TEST_CENTER_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.isVisible(By.id(ElementHelper.TC_REGION));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TC_NAME), tcName);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TC_SEARCH));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.setTimeout("10");
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TC_SEARCH_NAME)), tcName);
	}
		
	/*@Test
	public void step01_CreateTC() throws Exception {
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.TEST_CENTER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TEST_CENTER_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.isVisible(By.id(ElementHelper.TC_REGION));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TC_CREATE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.isVisible(By.id(ElementHelper.TC_ADD_REGION));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByIndex(By.id(ElementHelper.TC_ADD_PROVINCE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.TC_ADD_CITY), 1);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TC_ADD_CENTERNAME_CN), tcName);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TC_ADD_CENTERNAME_EN), tcEName);
		Thread.sleep(ElementHelper.SHORT_TIME);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.getElementById('TcQuota').value='30'");
		Thread.sleep(ElementHelper.SHORT_TIME);
		js.executeScript("return document.getElementById('TcOptimalQuota').value='30'");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TC_ADD_ABBREVIATION), abbreviation);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TC_ADD_ADDRESS_CN), address);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TC_ADD_ADDRESS_EN), addressE);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.CANCEL));
	}
	*/
	@Test
	public void step02_Search() throws Exception {
		searchTC();
	}
	
	@Test
	public void step03_Modify() throws Exception {
		searchTC();
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.cssSelector(ElementHelper.TC_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.clear(By.id(ElementHelper.TC_MODIFY_DESCRIPTION));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TC_MODIFY_DESCRIPTION), "Automation Testing");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
	@Test
	public void step04_View() throws Exception {
		searchTC();
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.linkText(ElementHelper.TC_VIEW));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TC_VIEW_NAME)), tcName);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
	@Test
	public void step05_ModifyLog() throws Exception {
		searchTC();
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.linkText(ElementHelper.TC_MODIFYLOG));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TC_MODIFYLOG_CREATE_BY)), ElementHelper.USER_NAME_DEV);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
}
