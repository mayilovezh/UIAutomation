package com.selenium.test.clericalmarker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ClericalMarkerProfile {
	static WebDriver driver;
	WebDriverAction action;
	String givenNameEn = "Guo";
	String familyNameEn = "Xiao";
	String givenNameCn = "郭";
	String familyNameCn = "啸";
	String passportNumber = "1234567890";
	String passportNumber1 = "1234567892";
	String dateBirth = "1990-05-26";
	String mobile = "18505218860";
	String email = "guoxiao@britishcouncil.org.cn";
	String clericalNo = "100284";

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
	
	/*@Test
	public void createProfileFirstMarker() throws Exception {
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
		((JavascriptExecutor)driver).executeScript("$('#addclericalmarkerRoles_listbox li')[0].click()"); 
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.cssSelector(ElementHelper.CLERICAL_PROFILE_CREATE_SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}*/
	
	/*@Test
	public void createProfileSecondMarker() throws Exception {
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
		((JavascriptExecutor)driver).executeScript("$('#addclericalmarkerRoles_listbox li')[1].click()"); 
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.cssSelector(ElementHelper.CLERICAL_PROFILE_CREATE_SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}*/
	
	@Test
	public void searchProfile() throws Exception {
		navigate();
		action.sendkeys(By.id(ElementHelper.CLERICAL_PROFILE_NUMBER), clericalNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.CLERICAL_PROFILE_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
	    Assert.assertEquals(action.getText(By.xpath(ElementHelper.CLERICAL_PROFILE_SEARCH_NUMBER)), clericalNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CLERICAL_PROFILE_SEARCH_FAMILY)), familyNameEn);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CLERICAL_PROFILE_SEARCH_GIVEN)), givenNameEn);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
	
	@Test
	public void modifyPwd() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.CLERICAL_PROFILE_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.CLERICAL_PROFILE_MODIFY_PWD));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.CLERICAL_PROFILE_MODIFY_PWD_NEW), "123456");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	@Test
	public void modifyPinCode() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.CLERICAL_PROFILE_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.CLERICAL_PROFILE_MODIFY_PINCODE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.CLERICAL_PROFILE_MODIFY_PINCODE_NEW), "1234");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
}
