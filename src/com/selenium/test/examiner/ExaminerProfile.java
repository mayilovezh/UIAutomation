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

public class ExaminerProfile {
	static WebDriver driver;
	WebDriverAction action;
	String firstName = "Yifan";
	String lastName = "Zhang";
	String passportNumber = "1234567896";
	String dateBirth = "1991-05-22";
	String mobile = "18505218865";
	String email = "yifanzhang@britishcouncil.org.cn";
	String examinerNo = "998866";
	String name = "Yifan Zhang";
	String pwd = "123456";
	String pinCode = "1234";

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
		action.click(By.xpath(ElementHelper.EXAMINER_PROFILE));
		Thread.sleep(ElementHelper.LONG_TIME_A);
	}

	/*@Test
	public void createProfile() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EXAMINER_PROFILE_CREATE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_FIRST_NAME), firstName);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_LAST_NAME), lastName);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_GENDER));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_DATEBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_EXAMINERNO), examinerNo);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_MOBILE), mobile);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_EMIAL), email);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_CITY), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_PASSPORT_NUMBER), passportNumber);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXAMINER_PROFILE_CREATE_WORK_STATUS), "1200");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}*/

	@Test
	public void searchProfile() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.EXAMINER_PROFILE_EXAMINERNO), examinerNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EXAMINER_PROFILE_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_PROFILE_SEARCH_NAME)), name);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXAMINER_PROFILE_SEARCH_EMAIL)), email);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}

	@Test
	public void modifyPwdPincode() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.EXAMINER_PROFILE_EXAMINERNO), examinerNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EXAMINER_PROFILE_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.linkText(ElementHelper.EXAMINER_PROFILE_PWD_PINCODE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.EXAMINER_PROFILE_PWD_NEW), pwd);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EXAMINER_PROFILE_PINCODE_NEW), pinCode);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
}
