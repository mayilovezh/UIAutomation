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

	public void navigate() {
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.POST_TEST));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TEST_MATERIAL_CHECK));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public void searchMaterial() {
		try {
			navigate();
			action.selectByIndex(By.id(ElementHelper.TEST_MATERIAL_MONTH), 0);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByIndex(By.id(ElementHelper.TEST_MATERIAL_DATE), 1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TEST_MATERIAL_TC), "50");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search the candidates test material for 'QIN YAQIONG'")
	public void step01_Search() {
		try {
			searchMaterial();
			action.sendkeys(By.id(ElementHelper.TEST_MATERIAL_CANDIDATENO), candidateNo);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TEST_MATERIAL_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TEST_MATERIAL_SEARCH_NAME)), chineseName);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TEST_MATERIAL_SEARCH_SCORE_STATUS)), scoreStatus);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Export all candidates test material")
	public void step02_ExportExcel() {
		try {
			searchMaterial();
			action.click(By.id(ElementHelper.TEST_MATERIAL_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.id(ElementHelper.TEST_MATERIAL_EXPORT));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
