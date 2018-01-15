package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.DriverInstance;
import com.selenium.test.element.ElementHelper;
import com.selenium.test.listener.WebDriverAction;

public class TestCenterList{
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
	
	public void searchTC() throws InterruptedException {
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.TEST_CENTER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TEST_CENTER_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.isVisible(By.id(ElementHelper.TC_REGION));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TC_NAME), "对外经济贸易大学");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TC_SEARCH));
		action.setTimeout("10");
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TC_SEARCH_NAME)), "对外经济贸易大学");
	}
		
	@Test
	public void createTC() throws Exception {
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
		action.sendkeys(By.id(ElementHelper.TC_ADD_CENTERNAME_CN), "对外经济贸易大学");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TC_ADD_CENTERNAME_EN), "University of International Business and Economics");
		Thread.sleep(ElementHelper.SHORT_TIME);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.getElementById('TcQuota').value='30'");
		Thread.sleep(ElementHelper.SHORT_TIME);
		js.executeScript("return document.getElementById('TcOptimalQuota').value='30'");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TC_ADD_ABBREVIATION), "UIBE");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TC_ADD_ADDRESS_CN), "朝阳区惠新东街10号(中日友好医院北侧)");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TC_ADD_ADDRESS_EN), "Chaoyang District, No. 10 Huixin East Street (Sino-Japanese Friendship Hospital on the north side)");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.CANCEL));
	}
	
	@Test
	public void search() throws Exception {
		searchTC();
	}
	
	@Test
	public void modify() throws Exception {
		searchTC();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TC_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
}
