package com.selenium.test.security;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class SuspiciousReport {
	static WebDriver driver;
	WebDriverAction action;
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}
	
	public void navigate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.SECURITY));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.SUSPICIOUS_REPORT));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.SUSPICIOUS_REPORT_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SUSPICIOUS_REPORT_TYPE), "2");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Export malpractice report for 'IELTS'.")
	 public void step01_ExportIelts() {
		navigate();
		action.click(By.id(ElementHelper.SUSPICIOUS_REPORT_EXPORT_IELTS));
	}
	
	@Test(description = "Export malpractice report for 'UKVI and Life Skills'.")
	 public void step02_ExportUkviAndLifeSkills() {
		navigate();
		action.click(By.id(ElementHelper.SUSPICIOUS_REPORT_EXPORT_UKVI_AND_LIFE_SKILLS));
	}
}
