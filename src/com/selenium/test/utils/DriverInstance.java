package com.selenium.test.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.selenium.test.listener.TestNGListener;

public class DriverInstance {
	public static WebDriverAction action;

	public WebDriver login(WebDriver driver) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		TestNGListener.driver = driver;
		action = new WebDriverAction(driver);
		driver.get(ElementHelper.QA_URL);
//		driver.get(ElementHelper.DEV_URL);
//		driver.get(ElementHelper.UAT_URL);
		driver.manage().window().maximize();
		action.setTimeout("10");
		Assert.assertEquals(driver.getTitle(), "British Council");
		action.clear(By.id(ElementHelper.USER_NAME_INPUT));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
//		action.sendkeys(By.id(ElementHelper.USER_NAME_INPUT), ElementHelper.USER_NAME_DEV);
//		action.sendkeys(By.id(ElementHelper.USER_NAME_INPUT), ElementHelper.USER_NAME_UAT);
		action.sendkeys(By.id(ElementHelper.USER_NAME_INPUT), ElementHelper.USER_NAME_QA);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.clear(By.id(ElementHelper.PASSWORD_INPUT));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.PASSWORD_INPUT), ElementHelper.PASSWORD);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.LOGIN_BTN));
		return driver;
	}

	public WebDriver loginEast(WebDriver driver) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./chromedriverv57.exe");
		driver = new ChromeDriver();
		TestNGListener.driver = driver;
		action = new WebDriverAction(driver);
//		driver.get(ElementHelper.DEV_URL);
		driver.get(ElementHelper.QA_URL);
		driver.manage().window().maximize();
		action.setTimeout("10");
		Assert.assertEquals(driver.getTitle(), "British Council");
		action.clear(By.id(ElementHelper.USER_NAME_INPUT));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.USER_NAME_INPUT), ElementHelper.USER_NAME_EAST);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.clear(By.id(ElementHelper.PASSWORD_INPUT));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.PASSWORD_INPUT), ElementHelper.PASSWORD);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.LOGIN_BTN));
		return driver;
	}

	public WebDriver loginTdol(WebDriver driver) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		TestNGListener.driver = driver;
		action = new WebDriverAction(driver);
		driver.get(ElementHelper.DEV_IEP);
		driver.manage().window().maximize();
		action.setTimeout("60");
		Assert.assertEquals(driver.getTitle(), "British Council");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.USER_NAME_IEP), ElementHelper.IEP_UESRNAME);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.PASSWORD), ElementHelper.IEP_PASSWORD);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.PINCODE_IEP), ElementHelper.IEP_PINCODE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.linkText(ElementHelper.LOGIN_IEP));
		return driver;
	}

	public WebDriver loginIEP(WebDriver driver) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		TestNGListener.driver = driver;
		action = new WebDriverAction(driver);
		driver.get(ElementHelper.DEV_IEP);
		driver.manage().window().maximize();
		action.setTimeout("60");
		Assert.assertEquals(driver.getTitle(), "British Council");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.USER_NAME_IEP), ElementHelper.IEP_ACCOUNT);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.PASSWORD_IEP), ElementHelper.IEP_PWD);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.PINCODE_IEP), ElementHelper.IEP_E_PINCODE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.linkText(ElementHelper.LOGIN_IEP));
		return driver;
	}

	public WebDriver loginICMP(WebDriver driver) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		TestNGListener.driver = driver;
		action = new WebDriverAction(driver);
		driver.get(ElementHelper.DEV_ICMP);
		driver.manage().window().maximize();
		action.setTimeout("60");
		Assert.assertEquals(driver.getTitle(), "British Council");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.UESR_NAME_ICMP), ElementHelper.UESR_NAME_VALUE_ICMP);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.PWD_ICMP), ElementHelper.PWD_VALUE_ICMP);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.PINCODE_ICMP), ElementHelper.PINCODE_VALUE_ICMP);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.linkText(ElementHelper.LOGIN_ICMP));
		return driver;
	}
	
	public WebDriver loginUnPrebooking(WebDriver driver) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./chromedriverv57.exe");
		driver = new ChromeDriver();
		TestNGListener.driver = driver;
		action = new WebDriverAction(driver);
//		driver.get(ElementHelper.DEV_URL);
		driver.get(ElementHelper.QA_URL);
		driver.manage().window().maximize();
		action.setTimeout("10");
		Assert.assertEquals(driver.getTitle(), "British Council");
		action.clear(By.id(ElementHelper.USER_NAME_INPUT));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
//		action.sendkeys(By.id(ElementHelper.USER_NAME_INPUT), ElementHelper.USER_NAME_DEV);
		action.sendkeys(By.id(ElementHelper.USER_NAME_INPUT), ElementHelper.USER_NAME_UAT);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.clear(By.id(ElementHelper.PASSWORD_INPUT));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.PASSWORD_INPUT), ElementHelper.PASSWORD);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.UN_PRE_BOOKING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.LOGIN_BTN));
		return driver;
	}

	public void teardown(WebDriver driver) {
		driver.quit();
	}

}
