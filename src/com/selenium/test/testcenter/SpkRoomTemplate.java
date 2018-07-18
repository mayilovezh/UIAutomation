package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class SpkRoomTemplate {
	static WebDriver driver;
	WebDriverAction action;
	String templateSat = "BJ-UIBE-Sat";
	String templateThu = "BJ-UIBE-Thu";
	String createWarning = "Please select a Test Center!";

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate(){
		try {
			action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
			action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_ROOM_TEMPLATE));
			action.waitElementVisible(By.id(ElementHelper.SPK_TEMPLATE_REGION));
			action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_TEST_CENTER), ElementHelper.CENTER_UIBE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SPK_TEMPLATE_SEARCH));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Verify create warning")
	public void step01_VerifyCreate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_ROOM_TEMPLATE));
		action.waitElementVisible(By.id(ElementHelper.SPK_TEMPLATE_REGION));
		action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.isTextPrest(By.id(ElementHelper.RESULT_WARNING), createWarning);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Create the saturday template for 'UIBE'")
	public void step02_CreateSaturday(){
		navigate();
		try {
			if(action.isTextExist(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_SATURDAY), templateSat)) {
				new DriverInstance().teardown(driver);
			} else {
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.xpath(ElementHelper.SPK_TEMPLATE_ADD_SATURDAY));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.SPK_TEMPLATE_ADD_BUILDING2));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD_SEARCH));
				action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_TEMPLATE_ADD_ROOM));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD_SAVE));
				Thread.sleep(ElementHelper.SHORT_TIME);
			}
		} catch (InterruptedException e) {                  
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Create the thursday template for 'UIBE'")
	public void step03_CreateThursday(){
		navigate();
		try {
			if(action.isTextExist(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_THURSDAY), templateThu)) {
				new DriverInstance().teardown(driver);
			} else {
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.xpath(ElementHelper.SPK_TEMPLATE_ADD_BUILDING1));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD_SEARCH));
				action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_TEMPLATE_ADD_ROOM));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.id(ElementHelper.SPK_TEMPLATE_ADD_SAVE));
				Thread.sleep(ElementHelper.SHORT_TIME);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search the thursday and saturday template for 'UIBE'")
	public void step04_SearchTemplate() {
		search();
	}

	@Test(description = "Modify the saturday template for 'UIBE'")
	public void step05_Modify() {
		search();
		try {
			if (action.isTextExist(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_THURSDAY), templateThu)
					&& action.isTextExist(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_SATURDAY), templateSat)) {
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.linkText(ElementHelper.SPK_TEMPLATE_MODIFY));
				action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_TEMPLATE_MODIFY_ROOM));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.id(ElementHelper.SPK_TEMPLATE_MODIFY_SAVE));
				Thread.sleep(ElementHelper.SHORT_TIME);
			} else {
				new DriverInstance().teardown(driver);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View and check the saturday template is selected")
	public void step06_View() {
		search();
		try {
			if (action.isTextExist(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_THURSDAY), templateThu)
					&& action.isTextExist(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_SATURDAY), templateSat)) {
				action.waitElementVisibleToClick(By.linkText(ElementHelper.SPK_TEMPLATE_VIEW));
				Thread.sleep(ElementHelper.WAIT_TIME);
				isroomChecked();
			} else {
				new DriverInstance().teardown(driver);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test
	public void step06_DeleteSat() {
		navigate();
		try {
			if (action.isTextExist(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_SATURDAY), templateSat)) {
				new DriverInstance().teardown(driver);
			} else {
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.linkText(ElementHelper.SPK_TEMPLATE_DELETE));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test
	public void step07_DeleteThu(){
		navigate();
		try {
			if(action.isTextExist(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_THURSDAY), templateThu)) {
				new DriverInstance().teardown(driver);
			} else {
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.linkText(ElementHelper.SPK_TEMPLATE_DELETE));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void search(){
		navigate();
		action.waitElementVisibleToAssert(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_SATURDAY), templateSat);
		action.waitElementVisibleToAssert(By.xpath(ElementHelper.SPK_TEMPLATE_NAME_THURSDAY), templateThu);
	}
	
	public boolean isroomChecked() {
		boolean status = false;
		try {
			driver.findElement(By.xpath("//input[contains(@checked,'checked')]"));
			status = true;
		} catch (NoSuchElementException e) {
			status = false;
		}
		return status;
	}
}
