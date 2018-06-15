package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class DemoTest {
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
	
	@Test(description = "Verification login to 'MIS2' dev successed.")
	public void step01_LoginSuccess() {
		try {
			action.clear(By.id(ElementHelper.USER_NAME));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.USER_NAME), ElementHelper.USER_NAME_DEV);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.clear(By.id(ElementHelper.PASSWORD));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.PASSWORD), ElementHelper.PASSWORD_DEV);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.LOGIN_BTN));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.id(ElementHelper.TEST_CENTER));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SPK_ROOM_TEMPLATE));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_REGION), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_TEST_CENTER), "100100");
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
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Verify login to 'MIS2' dev failed.")
	public void step02_LoginFail() {
		try {
			action.clear(By.id(ElementHelper.USER_NAME));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.USER_NAME), ElementHelper.USER_NAME_DEV);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.clear(By.id(ElementHelper.PASSWORD));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.PASSWORD), "zyf123456");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.LOGIN_BTN));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			Assert.assertEquals(action.getText(By.className("error")), "Invalid username or password");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Verify login to 'MIS2' dev failed.")
	public void step03_LoginFail() {
		try {
			action.clear(By.id(ElementHelper.USER_NAME));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.USER_NAME), ElementHelper.USER_NAME_DEV);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.clear(By.id(ElementHelper.PASSWORD));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.PASSWORD), "zyf123456");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.LOGIN_BTN));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
