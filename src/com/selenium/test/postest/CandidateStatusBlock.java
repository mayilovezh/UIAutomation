package com.selenium.test.postest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class CandidateStatusBlock {
	static WebDriver driver;
	WebDriverAction action;
	String givenNameEn = "PEIYAO";
	String givenNameCn = "佩瑶";
	String candidateNo = "036888";
	String chineseName = "谭 佩瑶";

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
		action.click(By.xpath(ElementHelper.CAN_STATUS_BLOCK));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	public void search() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.isVisible(By.id(ElementHelper.CAN_STATUS_BLOCK_REGION));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.CAN_STATUS_BLOCK_MONTH), 4);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.CAN_STATUS_BLOCK_DATE), "10350");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.CAN_STATUS_BLOCK_CANDIDATE_NO), candidateNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.CAN_STATUS_BLOCK_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CAN_STATUS_BLOCK_SEARCH_INFO)), candidateNo);
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CAN_STATUS_BLOCK_SEARCH_CHINESE_NAME)), chineseName);
	}

	@Test
	public void step01_ModifypProfile() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.isVisible(By.id(ElementHelper.CAN_STATUS_BLOCK_REGION));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.CAN_STATUS_BLOCK_MONTH), 4);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.CAN_STATUS_BLOCK_DATE), "10350");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.CAN_STATUS_BLOCK_CANDIDATE_NO), candidateNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.CAN_STATUS_BLOCK_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.CAN_STATUS_BLOCK_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		WebElement givenName = driver.findElement(By.id(ElementHelper.CAN_STATUS_BLOCK_MODIFY_GIVENNAME_EN));
		givenName.clear();
		givenName.sendKeys(givenNameEn);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		WebElement givenName1 = driver.findElement(By.id(ElementHelper.CAN_STATUS_BLOCK_MODIFY_GIVENNAME_CN));
		givenName1.clear();
		givenName1.sendKeys(givenNameCn);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}

	@Test
	public void step02_ModifyStatus() throws Exception {
		search();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.CAN_STATUS_BLOCK_STATUS_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.CAN_STATUS_BLOCK_TEST_STATUS), 3);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.CAN_STATUS_BLOCK_SCORE_STATUS), 0);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.CAN_STATUS_BLOCK_STATUS_SAVE));
	}

}
