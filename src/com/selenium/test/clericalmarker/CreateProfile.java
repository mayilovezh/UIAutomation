package com.selenium.test.clericalmarker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class CreateProfile {
	static WebDriver driver;
	WebDriverAction action;
	String givenNameEn = "Guo";
	String familyNameEn = "Xiao";
	String givenNameCn = "郭";
	String familyNameCn = "啸";
	String passportNumber = "1234567890";
	String dateBirth = "1990-05-26";
	String mobile = "18505218860";
	String email = "guoxiao@britishcouncil.org.cn";
	

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
		action.click(By.id(ElementHelper.CLERICAL_MARKER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.CLERICAL_PROFILE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void createProfile() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.CLERICAL_PROFILE_CREATE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_GIVEN_NAME_EN), givenNameEn);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_FAMILY_NAME_EN), familyNameEn);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_GIVEN_NAME_CN), givenNameCn);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_FAMILY_NAME_CN), familyNameCn);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_ID_NUMBER), passportNumber);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_DATEBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_MOBILE), mobile);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_EMAIL), email);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_CITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.CLERICAL_PROFILE_CREATE_STATUS), "1204");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.CLERICAL_PROFILE_CREATE_ROLES));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
//		new Select(driver.findElement(By.id("addclericalmarkerRoles_listbox"))).selectByValue("1210");
		((JavascriptExecutor)driver).executeScript("$('#addclericalmarkerRoles_listbox li')[0].click()"); 
		
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.cssSelector(ElementHelper.CLERICAL_PROFILE_CREATE_SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
}
