package com.selenium.test.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.ExcelReader;
import com.selenium.test.utils.WebDriverAction;

public class FreeCandidateList {
	static WebDriver driver;
	WebDriverAction action;
	ExcelReader reader = new ExcelReader(".\\resource\\cs\\cscs.xlsx");
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
		action.click(By.id(ElementHelper.CS_CS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.FREE_CANDIDATE_LIST_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_LIST_LAST_MONTH), 0);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.FREE_CANDIDATE_LIST_LAST_DATE), "10197");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.FREE_CANDIDATE_LIST_FREE_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.FREE_CANDIDATE_LIST_FREE_DATE), "10205");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_LIST_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step01_Search() throws Exception {
		navigate();
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_TYPE_LR)), reader.getCellValue("FreeCandidateList", 1, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_REASON_LR)), reader.getCellValue("FreeCandidateList", 1, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_TYPE_LW)), reader.getCellValue("FreeCandidateList", 2, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_REASON_LW)), reader.getCellValue("FreeCandidateList", 2, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_TYPE_LS)), reader.getCellValue("FreeCandidateList", 3, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_REASON_LS)), reader.getCellValue("FreeCandidateList", 3, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_TYPE_LRS)), reader.getCellValue("FreeCandidateList", 4, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_REASON_LRS)), reader.getCellValue("FreeCandidateList", 4, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_TYPE_RW)), reader.getCellValue("FreeCandidateList", 5, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_REASON_RW)), reader.getCellValue("FreeCandidateList", 5, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_TYPE_WS)), reader.getCellValue("FreeCandidateList", 6, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_REASON_WS)), reader.getCellValue("FreeCandidateList", 6, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_TYPE_RWS)), reader.getCellValue("FreeCandidateList", 7, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_REASON_RWS)), reader.getCellValue("FreeCandidateList", 7, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_TYPE_LWS)), reader.getCellValue("FreeCandidateList", 8, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_REASON_LWS)), reader.getCellValue("FreeCandidateList", 8, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void step02_Update() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_UPDATE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.FREE_CANDIDATE_LIST_UPDATE_REMARK), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
	
	@Test
	public void step03_View() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_VIEW));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_VIEW_LISTENING)),"Free Listening");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_VIEW_LISTENING_DATE)),"2018-03-03");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FREE_CANDIDATE_LIST_VIEW_READING_UI));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_VIEW_READING)),"Free Reading");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FREE_CANDIDATE_LIST_VIEW_READING_DATE)),"2018-03-03");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
}
