package com.selenium.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.capture.TakeScreenshot;
import com.selenium.test.element.ElementHelper;
import com.selenium.test.listener.WebDriverAction;

public class NewTest {
	public static WebDriver driver;
	public static WebDriverAction action;
    ElementHelper helper = new ElementHelper();

	@BeforeMethod
	public void setup() {
//		DOMConfigurator.configure("log4j.xml");
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		driver = new ChromeDriver();
		action = new WebDriverAction(driver);
		driver.get(helper.DEV_URL);
		driver.manage().window().maximize();
		action.setTimeout("10");

		Assert.assertEquals(driver.getTitle(), "British Council");
	}
	
	
	public void login() {
		action.sendkeys(By.id(helper.USER_NAME), "1");
		action.sendkeys(By.id(helper.PASSWORD), "1");
		action.click(By.id(helper.LOGIN_BTN));
	}

	@Test
	public void test() throws Exception {
		login();
		Thread.sleep(helper.WAIT_TIME);
		action.click(By.id(helper.TEST_CENTER));
		Thread.sleep(helper.SHORT_TIME);
		action.click(By.xpath(helper.TEST_CENTER_LIST));
		Thread.sleep(helper.WAIT_TIME);
		action.isVisible(By.id(helper.TC_REGION));
		Thread.sleep(helper.SHORT_TIME);
		action.click(By.xpath(helper.TC_CREATE));
		Thread.sleep(helper.SHORT_TIME);
		action.isVisible(By.id(helper.TC_ADD_REGION));
		Thread.sleep(helper.WAIT_TIME);
		action.selectByIndex(By.id(helper.TC_ADD_PROVINCE), 1);
		Thread.sleep(helper.SHORT_TIME);
		action.selectByIndex(By.id(helper.TC_ADD_CITY), 1);
	}

	@AfterMethod
	public void teardown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {
			
		} else if (ITestResult.SKIP == result.getStatus()) {
			
		}
        
		driver.quit();
	}

}
