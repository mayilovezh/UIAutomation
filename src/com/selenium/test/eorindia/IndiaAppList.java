package com.selenium.test.eorindia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class IndiaAppList {
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
	
	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.EOR_INDIA));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EOR_INDIA_APP_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	public void exportSearch() throws Exception {
		navigate();
		action.selectByIndex(By.id(ElementHelper.EOR_INDIA_APP_LIST_EXPORT_YEAR), 1);
		Thread.sleep(ElementHelper.LONG_TIME_B);
		action.selectByValue(By.id(ElementHelper.EOR_INDIA_APP_LIST_EXPORT_MONTH), "1");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.EOR_INDIA_APP_LIST_EXPORT_DATE), 3);
	}
	
	@Test
	public void step01_ProcessingtoDone() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.EOR_INDIA_APP_LIST_STATUS), "3");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.EOR_INDIA_APP_LIST_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.sendkeys(By.xpath(ElementHelper.EOR_INDIA_APP_LIST_REMARK), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.EOR_INDIA_APP_LIST_REMARK_SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.xpath(ElementHelper.EOR_INDIA_APP_LIST_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_INDIA_APP_LIST_DONE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step02_ExportDiffWriting() throws Exception {
		exportSearch();
		action.click(By.id(ElementHelper.EOR_INDIA_APP_LIST_EXPORT_DIFF_WRITING));
		Thread.sleep(ElementHelper.LONG_TIME_A);
	}
	
	@Test
	public void step02_ExportDiffSpeaking() throws Exception {
		exportSearch();
		action.click(By.id(ElementHelper.EOR_INDIA_APP_LIST_EXPORT_DIFF_SPEAKING));
		Thread.sleep(ElementHelper.LONG_TIME_A);
	}
	
	@Test
	public void step02_ExportDispatchList() throws Exception {
		exportSearch();
		action.click(By.id(ElementHelper.EOR_INDIA_APP_LIST_EXPORT_DISPATCH_LIST));
		Thread.sleep(ElementHelper.LONG_TIME_A);
	}
	
	@Test
	public void step02_ExportLRScore() throws Exception {
		exportSearch();
		action.click(By.id(ElementHelper.EOR_INDIA_APP_LIST_EXPORT_LR_SCORE));
		Thread.sleep(ElementHelper.LONG_TIME_A);
	}
	
	@Test
	public void step02_ExportWritingScore() throws Exception {
		exportSearch();
		action.click(By.id(ElementHelper.EOR_INDIA_APP_LIST_EXPORT_WRITING_SCORE));
		Thread.sleep(ElementHelper.LONG_TIME_A);
	}
	
	@Test
	public void step02_ExportSpeakingScore() throws Exception {
		exportSearch();
		action.click(By.id(ElementHelper.EOR_INDIA_APP_LIST_EXPORT_SPEAKING_SCORE));
		Thread.sleep(ElementHelper.LONG_TIME_A);
	}
}
