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
		action.click(By.id(ElementHelper.EXAMINER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EXAMINER_TASK));
		Thread.sleep(ElementHelper.LONG_TIME_A);
	}
	
	/*@Test
	public void createSpeakingTask() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_SPEAKING));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_SPEAKING_REGION), "1");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_SPEAKING_TESTDATE),"10272");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_SPEAKING_TESTDAY_1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_SPEAKING_TESTDAY_2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_SPEAKING_TESTDAY_3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_SPEAKING_TAG), "0");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EXAMINER_TASK_SPEAKING_SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}*/
	
	/*@Test
	public void createWritingTask() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_WRITING));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_WRITING_REGION), "1");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_WRITING_TESTDATE),"10250");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_WRITING_TESTDAY));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EXAMINER_TASK_WRITING_MARKING_VENUE), "BC Office");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EXAMINER_TASK_WRITING_SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void create2ndMarkingTask() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_2ND_MARKING));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_2ND_MARKING_REGION), "1");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_2ND_MARKING_TESTDATE),"10272");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_2ND_MARKING_TESTDAY));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EXAMINER_TASK_2ND_MARKING_VENUE), "BC Office");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EXAMINER_TASK_2ND_MARKING_SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}*/
	
	/*@Test
	public void createEorMarkingTask() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.EXAMINER_TASK_EOR_MARKING));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_EOR_MARKING_REGION), "1");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.EXAMINER_TASK_EOR_MARKING_DESPATCH_DATE),"18/03/2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EXAMINER_TASK_EOR_MARKING_REMARK));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EXAMINER_TASK_EOR_MARKING_ADD_TESTDAY),"22/03/2018");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.EXAMINER_TASK_EOR_MARKING_REMARK));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.name(ElementHelper.EXAMINER_TASK_EOR_MARKING_TESTDAY));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EXAMINER_TASK_EOR_MARKING_SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}*/
	
	@Test
	public void searchSpeaking() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByIndex(By.id(ElementHelper.EXAMINER_TASK_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_DATE), "10272");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_TYPE), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EXAMINER_TASK_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_SEARCH_SPK_TESTDATE)), "18/Mar/2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_TYPE_SPK)), "Speaking");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		
		
	}
	
	@Test
	public void searchWriting() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByIndex(By.id(ElementHelper.EXAMINER_TASK_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_DATE), "10250");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.EXAMINER_TASK_TYPE), "7");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EXAMINER_TASK_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_SEARCH_SPK_TESTDATE)), "22/Mar/2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_TASK_TYPE_SPK)), "Writing");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		
		
	}
	
}
