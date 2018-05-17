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
	String date115 = "85";
	String date116 = "84";
	String date117 = "118";
	String date118 = "87";
	String date119 = "84";
	
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
		action.selectByIndex(By.id(ElementHelper.SPK_DEPLOYMENT_MONTH), 0);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.SPK_DEPLOYMENT_DATE), "10199");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step01_ExaminerCheck() throws Exception {
		navigate();
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH_CITY)), city);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH_DATE115)), date115);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH_DATE116)), date116);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH_DATE117)), date117);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH_DATE118)), date118);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_DEPLOYMENT_SEARCH_DATE119)), date119);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	/*//TO DO
	@Test
	public void step02_ShowDetail() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	//TO DO
	@Test
	public void step03_ReplaceExaminer() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.SPK_DEPLOYMENT_SHOW_EXAMINER_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.SHOW_EXAMINER_DETAILS_ON_TESTDATE));
	}*/
	
	/*@Test
	public void step04_UploadToPretest() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.SPK_DEPLOYMENT_UPLOAD_TO_PRETEST));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(ElementHelper.WAIT_TIME);
	}*/
	
	@Test
	public void step05_ReleaseToIEP() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.SPK_DEPLOYMENT_RELEASE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step06_SendEmail() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.SPK_DEPLOYMENT_SEND_EMAIL));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
}
