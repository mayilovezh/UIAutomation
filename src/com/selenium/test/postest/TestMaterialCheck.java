package com.selenium.test.postest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestMaterialCheck {
	static WebDriver driver;
	WebDriverAction action;
	String candidateNo = "249396";
	String chineseName = "秦 晓琼";
	String scoreStatus = "TRF";

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
		action.click(By.id(ElementHelper.POST_TEST));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TEST_MATERIAL_CHECK));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	public void searchMaterial() throws Exception {
		navigate();
		action.selectByIndex(By.id(ElementHelper.TEST_MATERIAL_MONTH), 0);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.TEST_MATERIAL_DATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.TEST_MATERIAL_TC), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}

	@Test
	public void search() throws Exception {
		searchMaterial();
		action.sendkeys(By.id(ElementHelper.TEST_MATERIAL_CANDIDATENO), candidateNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TEST_MATERIAL_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TEST_MATERIAL_SEARCH_NAME)), chineseName);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TEST_MATERIAL_SEARCH_SCORE_STATUS)), scoreStatus);
	}
	
	@Test
	public void exportExcel() throws Exception {
		searchMaterial();
		action.click(By.id(ElementHelper.TEST_MATERIAL_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.TEST_MATERIAL_EXPORT));
	}
	
}
