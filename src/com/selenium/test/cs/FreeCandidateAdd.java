package com.selenium.test.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class FreeCandidateAdd {
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
		action.click(By.id(ElementHelper.CS_CS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_ADD));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	public void search() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.FREE_CANDIDATE_REGION), ElementHelper.VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_MONTH), 0);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_DATE), 2);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_TC), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void createLR() throws Exception {
		search();
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_ADD_LR));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_LISTENING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_READING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TESTDATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TC), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_REASON), 1);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Assert.assertEquals(action.resultWarning(driver), "Operation Successed!");
	}

	@Test
	public void createLW() throws Exception {
		search();
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_ADD_LW));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_LISTENING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_WRITTING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TESTDATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TC), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_REASON), 2);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Assert.assertEquals(action.resultWarning(driver), "Operation Successed!");
	}

	@Test
	public void createLS() throws Exception {
		search();
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_ADD_LS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_LISTENING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_SPEAKING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TESTDATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TC), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_REASON), 3);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Assert.assertEquals(action.resultWarning(driver), "Operation Successed!");
	}

	@Test
	public void createLRS() throws Exception {
		search();
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_ADD_LRS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_LISTENING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_READING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_SPEAKING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TESTDATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TC), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_REASON), 4);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Assert.assertEquals(action.resultWarning(driver), "Operation Successed!");
	}

	@Test
	public void createRW() throws Exception {
		search();
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_ADD_RW));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_READING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_WRITTING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TESTDATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TC), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_REASON), 5);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Assert.assertEquals(action.resultWarning(driver), "Operation Successed!");
	}

	@Test
	public void createWS() throws Exception {
		search();
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_ADD_WS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_WRITTING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_SPEAKING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TESTDATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TC), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_REASON), 6);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Assert.assertEquals(action.resultWarning(driver), "Operation Successed!");
	}

	@Test
	public void createRWS() throws Exception {
		search();
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_ADD_RWS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_READING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_WRITTING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_SPEAKING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TESTDATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TC), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_REASON), 7);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Assert.assertEquals(action.resultWarning(driver), "Operation Successed!");
	}

	@Test
	public void createLWS() throws Exception {
		search();
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_ADD_LWS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_LISTENING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_WRITTING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_ADD_SPEAKING));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TESTDATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_TC), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_ADD_REASON), 8);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Assert.assertEquals(action.resultWarning(driver), "Operation Successed!");
	}

}
