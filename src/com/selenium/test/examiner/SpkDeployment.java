package com.selenium.test.examiner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class SpkDeployment {
	static WebDriver driver;
	WebDriverAction action;
	String city = "BeiJing";
	String date1 = "29";
	String date2 = "53";
	String date3 = "52";
	String examinerNo = "983493";
	String examinerName = "Gareth David Blackett";
	
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
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.SPK_DEPLOYMENT_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.SPK_DEPLOYMENT_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.SPK_DEPLOYMENT_MONTH), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.SPK_DEPLOYMENT_DATE), "10217");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step01_ExaminerCheck() throws Exception {
		navigate();
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH_CITY)), city);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH_DATE1)), "65");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH_DATE2)), "53");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH_DATE3)), "62");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	/*@Test
	public void step02_AssignExaminer() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_ASSIGN));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_ASSIGN_SELECT_DATE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.xpath(ElementHelper.SPK_DEPLOYMENT_ASSIGN_SELECT_TRAVEL), "1");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_ASSIGN_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.SPK_DEPLOYMENT_ASSIGN_SELECT_EXAMINER));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_ASSIGN_SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}*/
	
	@Test
	public void step03_ShowExaminerDetails() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST_EXAMINERNO_UAT)), examinerNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST_EXAMINER_NAME_UAT)), examinerName);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST_SHOW_DETAIL_UAT));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST_SHOW_DETAIL_CANCEL));
	}
	
	@Test
	public void step04_ShowExaminerPerformance() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST_PERFORMANCE_UAT));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST_PERFORMANCE_CATEGORY), "1");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST_PERFORMANCE_SAVE));
		
	}
	
	/*@Test
	public void step05_ReplaceSwapExaminer() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.SHOW_EXAMINER_DETAILS_ON_TESTDATE));
	}
	
	@Test
	public void step06_UploadToPretest() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.SPK_DEPLOYMENT_UPLOAD_TO_PRETEST));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step07_ReleaseToIEP() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.SPK_DEPLOYMENT_RELEASE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step08_SendEmail() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.SPK_DEPLOYMENT_SEND_EMAIL));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(ElementHelper.WAIT_TIME);
	}*/
	
}
