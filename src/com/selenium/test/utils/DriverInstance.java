package com.selenium.test.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DriverInstance {
	public static WebDriverAction action;
	ElementHelper helper = new ElementHelper();

	public WebDriver login(WebDriver driver) {
		// DOMConfigurator.configure("log4j.xml");
		System.setProperty("webdriver.chrome.driver", "/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		action = new WebDriverAction(driver);
		driver.get(helper.DEV_URL);
		driver.manage().window().maximize();
		action.setTimeout("10");
		Assert.assertEquals(driver.getTitle(), "British Council");
		action.sendkeys(By.id(helper.USER_NAME), "1");
		action.sendkeys(By.id(helper.PASSWORD), "1");
		action.click(By.id(helper.LOGIN_BTN));
		return driver;
	}

	public WebDriver loginIEP(WebDriver driver) {
		// DOMConfigurator.configure("log4j.xml");
		System.setProperty("webdriver.chrome.driver", "/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		action = new WebDriverAction(driver);
		driver.get(helper.DEV_IEP);
		driver.manage().window().maximize();
		action.setTimeout("60");
		Assert.assertEquals(driver.getTitle(), "British Council");
		action.sendkeys(By.id(helper.USER_NAME_IEP), ElementHelper.IEP_UESRNAME);
		action.sendkeys(By.id(helper.PASSWORD), ElementHelper.IEP_PASSWORD);
		action.sendkeys(By.id(helper.PINCODE_IEP), ElementHelper.IEP_PINCODE);
		action.click(By.linkText(helper.LOGIN_IEP));
		return driver;
	}

	public void teardown(WebDriver driver) {
		driver.quit();
	}

}
