package com.selenium.test.examiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ExaminerTask {
	static WebDriver driver;
	WebDriverAction action;
	
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
		action.click(By.id(ElementHelper.EXAMINER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EXAMINER_TASK));
		Thread.sleep(ElementHelper.LONG_TIME_A);
	}
	
	@Test
	public void step01_SearchSpeaking() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_MONTH), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_DATE), "10217");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_TYPE), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EXAMINER_TASK_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_TESTDATE)), "02/Jun/2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_SEARCH_TYPE)), "Speaking");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void step02_SearchWriting() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_MONTH), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_DATE), "10217");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_TYPE), "7");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EXAMINER_TASK_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_TESTDATE)), "02/Jun/2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_SEARCH_TYPE)), "Writing");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void step03_Search2ndMarking() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_MONTH), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_DATE), "10217");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_TYPE), "8");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EXAMINER_TASK_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_TESTDATE)), "02/Jun/2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_SEARCH_TYPE)), "2nd Marking");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void step04_ReportByWriting() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_MONTH), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_DATE), "10217");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_TYPE), "7");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EXAMINER_TASK_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_TESTDATE)), "02/Jun/2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_SEARCH_TYPE)), "Writing");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_REPORT));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_REPORT_PAGE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_REPORT_UPDATE));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.EXAMINER_TASK_REPORT_AVAILABLE_BTN));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.clear(By.id(ElementHelper.EXAMINER_TASK_REPORT_CAPACITY));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EXAMINER_TASK_REPORT_CAPACITY), "20");;
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EXAMINER_TASK_REPORT_AVAILABLE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_REPORT_SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	@Test
	public void step05_LogByWriting() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_MONTH), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_DATE), "10217");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_TYPE), "7");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EXAMINER_TASK_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_TESTDATE)), "02/Jun/2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_SEARCH_TYPE)), "Writing");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.linkText(ElementHelper.EXAMINER_TASK_LOG));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_LOG_UPDATE_BY)), ElementHelper.USER_NAME_QA);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
}
