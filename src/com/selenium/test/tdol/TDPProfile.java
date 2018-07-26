package com.selenium.test.tdol;

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

public class TDPProfile {
	static WebDriver driver;
	WebDriverAction action;
	String middleName = "Automation";
	String dateBirth = "01/01/1990";
	ExcelReader reader = new ExcelReader(".\\resource\\tdol\\tdpProfile.xlsx");

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
		action.click(By.id(ElementHelper.TDOL));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

/*	@Test
	public void step01_CreateWSupervisor() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 1, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 1, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 1, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 1, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 1, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 1, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 1, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_WSUPERVISOR));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step02_CreateSSupervisor() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 2, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 2, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 2, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 2, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 2, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 2, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 2, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_SSUPERVISOR));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}

	@Test
	public void step03_CreateSAS() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 3, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 3, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 3, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 3, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 3, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 3, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 3, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_SAS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step04_CreateSpkAS() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 4, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 4, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 4, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 4, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 4, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 4, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 4, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_SPK_AS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step05_CreateDataAS() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 5, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 5, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 5, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 5, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 5, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 5, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 5, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_DATA_AS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step06_CreateWAS() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 6, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 6, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 6, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 6, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 6, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 6, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 6, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_WAS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step07_CreateInvigilatorA() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 7, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 7, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 7, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 7, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 7, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 7, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 7, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_INVIGILATOR_A));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step08_CreateInvigilatorB() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 8, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 8, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 8, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 8, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 8, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 8, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 8, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_INVIGILATOR_B));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step09_CreateBagPerson() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 9, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 9, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 9, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 9, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 9, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 9, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 9, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_BAG_PERSON));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step10_CreateBackUp() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 10, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 10, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 10, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 10, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 10, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 10, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 10, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_BACK_UP));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step11_CreateTrainee() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 11, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 11, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 11, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 11, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 11, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 11, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 11, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_TRAINEE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step12_CreateAuditor() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 12, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 12, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 12, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 12, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 12, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 12, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 12, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_AUDITOR));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step13_CreateCarmeraMan() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN), reader.getCellValue("profile", 13, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN), reader.getCellValue("profile", 13, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN), reader.getCellValue("profile", 13, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN), reader.getCellValue("profile", 13, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER), reader.getCellValue("profile", 13, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MOBILE), reader.getCellValue("profile", 13, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_EMAIL), reader.getCellValue("profile", 13, 6));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_NATIONALITY), "45");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_PROVINCE), "11");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_BASECITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_CARMERAMAN));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}*/
	
	@Test
	public void step14_Search() throws Exception {
		searchTDP();
	}

	@Test
	public void step15_ViewLog() throws Exception {
		searchTDP();
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.linkText(ElementHelper.TDP_PROFILE_VIEWLOG));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
	}

	public void searchTDP() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.TDP_PROFILE_ROLES), "10");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.TDP_PROFILE_EMAIL), reader.getCellValue("profile", 1, 6));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TDP_PROFILE_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TDP_PROFILE_SEARCH_NAME)),
				reader.getCellValue("profile", 1, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TDP_PROFILE_SEARCH_NAME)),
				reader.getCellValue("profile", 1, 7));
	}
}
