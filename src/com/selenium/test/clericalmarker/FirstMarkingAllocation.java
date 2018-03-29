package com.selenium.test.clericalmarker;

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

public class FirstMarkingAllocation {
	static WebDriver driver;
	WebDriverAction action;
	String name = "Xiao Guo";

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
		action.click(By.xpath(ElementHelper.FIRST_ALLOCATION));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByIndex(By.id(ElementHelper.FIRST_ALLOCATION_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.FIRST_ALLOCATION_DATE), "10207");
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.FIRST_ALLOCATION_SELECTALL));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FIRST_ALLOCATION_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
	}

	@Test
	public void step01_AutoAllocation() throws Exception {
		navigate();
		action.sendkeys(By.id(ElementHelper.FIRST_ALLOCATION_SELECT_MARKER), "1");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.FIRST_ALLOCATION_CALCULATE));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.FIRST_ALLOCATION_AUTO_ALLOCATION));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(ElementHelper.LONG_TIME);
	}

	@Test
	public void step02_ToResultPage() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.FIRST_ALLOCATION_RESULT_PAGE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.FIRST_ALLOCATION_RESULT_PAGE_NAME)), name);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}

	@Test
	public void step03_Notice() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.FIRST_ALLOCATION_NOTICE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.FIRST_ALLOCATION_NOTICE_ADD_PLACEHOLDER));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.FIRST_ALLOCATION_NOTICE_TEXT), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}

	@Test
	public void step04_DeleteNotice() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.FIRST_ALLOCATION_NOTICE_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step05_ExportAllocationResult() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.FIRST_ALLOCATION_EXPORT_ALLOCATION_RESULT));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step06_ExportRegisterResult() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.FIRST_ALLOCATION_EXPORT_REGISTER_RESULT));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step07_ExportFinanceReport() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.FIRST_ALLOCATION_EXPORT_FINANCE_REPORT));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(ElementHelper.LONG_TIME);
	}
}
