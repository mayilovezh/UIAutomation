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

public class CandidateFromItap {
	static WebDriver driver;
	WebDriverAction action;
	String registrationNo = "264";
	String syncNo = "0";
	String specialCandidates = "0";

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
		action.click(By.id(ElementHelper.POST_TEST));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.CANDIDATE_FROM_ITAP));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void search() throws Exception {
		navigate();
		action.selectByIndex(By.id(ElementHelper.CANDIDATE_FROM_ITAP_MONTH), 0);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.CANDIDATE_FROM_ITAP_DATE), "10197");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.CANDIDATE_FROM_ITAP_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CANDIDATE_FROM_ITAP_REGISTRATION)), registrationNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CANDIDATE_FROM_ITAP_SYNC)), syncNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CANDIDATE_FROM_ITAP_SPECIAL)), specialCandidates);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
}
