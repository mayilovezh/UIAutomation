package com.selenium.test.postest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ScoreUpload {
	static WebDriver driver;
	WebDriverAction action;
	@BeforeMethod
	public void setUp() {
		driver = new DriverInstance().loginEast(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.POST_TEST));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SCORE_UPLOAD));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.SCORE_UPLOAD_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.SCORE_UPLOAD_MONTH), 0);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.SCORE_UPLOAD_DATE), "10197");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.SCORE_UPLOAD_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void uploadFirstMarking() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.SCORE_UPLOAD_FIRST_MARKING));
		Thread.sleep(ElementHelper.SHORT_TIME);
		upload("\\resource\\posttest\\0106 Xuzhou_1st marking.xml");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.cssSelector(ElementHelper.SCORE_UPLOAD_UPLOAD));
		Thread.sleep(30000);
	}
	
	@Test
	public void uploadFirstRelease() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.SCORE_UPLOAD_FIRST_RELEASE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		upload1("\\resource\\posttest\\0106 Xuzhou_1st release.xml");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.cssSelector(ElementHelper.SCORE_UPLOAD_UPLOAD));
		Thread.sleep(30000);
	}
	
	public void upload(String filePath) {
		String path = System.getProperty("user.dir") + filePath;
		File file = new File(path);
		if(file.exists()) {
			driver.findElement(By.id(ElementHelper.SCORE_UPLOAD_CHOOSE_FIRST_MARKING)).sendKeys(file.getPath());
		}
	}
	
	public void upload1(String filePath) {
		String path = System.getProperty("user.dir") + filePath;
		File file = new File(path);
		if(file.exists()) {
			driver.findElement(By.id(ElementHelper.SCORE_UPLOAD_CHOOSE_FIRST_RELEASE)).sendKeys(file.getPath());
		}
	}
}
