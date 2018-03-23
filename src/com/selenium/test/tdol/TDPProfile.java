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
	public void setUp() {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate() {
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.TDOL));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TDP_PROFILE));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void create() {
		navigate();
		try {
			action.click(By.id(ElementHelper.TDP_PROFILE_CREATE));
			Thread.sleep(ElementHelper.LONG_TIME);
			action.selectByValue(By.id(ElementHelper.TDP_PROFILE_CREATE_REGION), ElementHelper.VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN),
					reader.getCellValue("profile", 1, 0));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_MIDDLE_NAME_EN), middleName);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN),
					reader.getCellValue("profile", 1, 2));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN),
					reader.getCellValue("profile", 1, 3));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN),
					reader.getCellValue("profile", 1, 1));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TDP_PROFILE_CREATE_ID_TYPE));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_PASSORT_NUMBER),
					reader.getCellValue("profile", 1, 4));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TDP_PROFILE_CREATE_DATEOFBIRTH), dateBirth);
			Thread.sleep(ElementHelper.SHORT_TIME);
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
			action.isVisible(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES));
			action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES));

			driver.findElement(By.xpath("//*[@id='addGeneralTDPInfo-Roles']/tr[1]/td[1]/input")).click();

			// action.click(By.xpath(ElementHelper.TDP_PROFILE_CREATE_ROLES_WSUPERVISOR));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
			Thread.sleep(ElementHelper.LONG_TIME);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchTDP() {
		navigate();
		try {
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void search() {
		searchTDP();
	}

	@Test
	public void viewLog() {
		searchTDP();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TDP_PROFILE_VIEWLOG));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
