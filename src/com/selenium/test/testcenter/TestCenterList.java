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

public class TestCenterList {
	String tcName = "对外经济贸易大学";
	String tcEName = "University of International Business and Economics";
	String abbreviation = "BJ-UIBE";
	String address = "朝阳区惠新东街10号(中日友好医院北侧)";
	String addressE = "Chaoyang District, No. 10 Huixin East Street (Sino-Japanese Friendship Hospital on the north side)";
	WebDriver driver;
	WebDriverAction action;
	boolean isTextPrest = false;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	/*@Test(description = "Create the TestCenter UIBE")
	public void step01_CreateTC(){
		try {
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
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	@Test(description = "Search for the TestCenter of UIBE")
	public void step02_Search(){
		searchTC();
	}

	@Test(description = "Modify the TestCenter of UIBE")
	public void step03_Modify(){
		try {
			searchTC();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.cssSelector(ElementHelper.TC_MODIFY));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.clear(By.id(ElementHelper.TC_MODIFY_DESCRIPTION));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.clear(By.id(ElementHelper.TC_MODIFY_DESCRIPTION));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TC_MODIFY_DESCRIPTION),ElementHelper.REMARK_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "View the testcenter details of UIBE")
	public void step04_View(){
		try {
			searchTC();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TC_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TC_VIEW_NAME)), tcName);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "View the modifylog of UIBE")
	public void step05_ModifyLog(){
		try {
			searchTC();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TC_MODIFYLOG));
			Thread.sleep(ElementHelper.WAIT_TIME);
			isTextPrest = driver.findElement(By.className(ElementHelper.TC_MODIFYLOG_DETAILS)).getText().contains(ElementHelper.REMARK_VALUE);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TC_MODIFYLOG_CREATE_BY)),
					ElementHelper.USER_NAME_DEV);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchTC(){
		try {
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
			Thread.sleep(ElementHelper.WAIT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TC_SEARCH_NAME)), tcName);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TC_SEARCH_ABBREVATION)),abbreviation);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
