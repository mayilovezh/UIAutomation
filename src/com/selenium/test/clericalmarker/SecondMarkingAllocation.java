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

public class SecondMarkingAllocation {
	static WebDriver driver;
	WebDriverAction action;
	String name = "Du Jingfen";

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
		action.click(By.id(ElementHelper.CLERICAL_MARKER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SECOND_ALLOCATION));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByIndex(By.id(ElementHelper.SECOND_ALLOCATION_MONTH), 4);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.SECOND_ALLOCATION_DATE), "10215");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.SECOND_ALLOCATION_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
//		action.click(By.id(ElementHelper.SECOND_ALLOCATION_SELECT));
//		Thread.sleep(ElementHelper.SHORT_TIME);
//		action.click(By.id(ElementHelper.SECOND_ALLOCATION_CALCUATOR));
//		Thread.sleep(ElementHelper.LONG_TIME);
	}

	@Test
	public void step01_ToResultPage() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.SECOND_ALLOCATION_RESULT_PAGE));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.SECOND_ALLOCATION_RESULT_PAGE_NAME)), name);
	    Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}

	@Test
	public void step02_Notice() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.SECOND_ALLOCATION_NOTICE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.SECOND_ALLOCATION_NOTICE_ADD_PLACEHOLDER));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.SECOND_ALLOCATION_NOTICE_TEXT), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}

	@Test
	public void step03_DeleteNotice() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.SECOND_ALLOCATION_DELETE_NOTICE));
		Thread.sleep(ElementHelper.SHORT_TIME);
//		Alert confirm = driver.switchTo().alert();
//		confirm.accept();
//		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step04_ExportAllocationResult() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.SECOND_ALLOCATION_EXPORT_RESULT));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step05_ExportRegisterResult() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.SECOND_ALLOCATION_EXPORT_REGISTER_RESULT));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step06_ExportFinanceReport() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.SECOND_ALLOCATION_EXPORT_FINANCE_REPORT));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
}
