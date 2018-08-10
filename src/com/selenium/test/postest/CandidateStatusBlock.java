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
	String givenNameEn = "YUAN";
	String givenNameCn = "园";
	String candidateNo = "138917";
	String chineseName = "田 园";
	String remarkValue = "Pass all";
	String modifyLog = "TRF";
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().loginEast(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate(){
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.POST_TEST));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.CAN_STATUS_BLOCK));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public void search(){
		navigate();
		try {
			action.waitElementVisible(By.id(ElementHelper.CAN_STATUS_BLOCK_REGION));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByIndex(By.id(ElementHelper.CAN_STATUS_BLOCK_MONTH), 0);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.CAN_STATUS_BLOCK_DATE), "10334");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.CAN_STATUS_BLOCK_TC), "100084");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.CAN_STATUS_BLOCK_CANDIDATE_NO), candidateNo);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.CAN_STATUS_BLOCK_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.CAN_STATUS_BLOCK_SEARCH_INFO)), candidateNo);
			Thread.sleep(ElementHelper.WAIT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.CAN_STATUS_BLOCK_SEARCH_CHINESE_NAME)), chineseName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Modify the candidate profile.")
	public void step01_ModifypProfile(){
		try {
			search();
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
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Modify the candidate score status to 'TRF Sent'.")
	public void step02_ModifyStatus(){
		try {
			search();
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.name(ElementHelper.CAN_STATUS_BLOCK_STATUS_SELECT));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.CAN_STATUS_BLOCK_TEST_STATUS), "2");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.CAN_STATUS_BLOCK_SCORE_STATUS), "8");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.CAN_STATUS_BLOCK_REASON), "13");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.clear(By.id(ElementHelper.CAN_STATUS_BLOCK_REMARK));
			action.sendkeys(By.id(ElementHelper.CAN_STATUS_BLOCK_REMARK), remarkValue);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.CAN_STATUS_BLOCK_STATUS_SAVE));
			Thread.sleep(ElementHelper.SHORT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "View the modify log of status and profile.")
	public void step03_Viewlog() {
		try {
			search();
			action.click(By.xpath(ElementHelper.CAN_STATUS_BLOCK_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.CAN_STATUS_BLOCK_VIEW_CREATE_BY)), ElementHelper.USER_NAME_EAST);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
