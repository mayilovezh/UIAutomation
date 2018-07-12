package com.selenium.test.pretestarrange;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class SpkArrangement {
	static WebDriver driver;
	WebDriverAction action;
	String CTDefinedName = "李 扬";
	
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
		action.waitElementVisibleToClick(By.id(ElementHelper.PRE_TEST_ARRANGE));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_ARRANGEMENT));
		action.waitElementVisible(By.id(ElementHelper.SPK_ARRANFEMENT_REGION));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.SPK_ARRANGEMENT_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.SPK_ARRANGEMENT_MONTH), 4);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ARRANGEMENT_DATE), "10352");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SPK_ARRANGEMENT_SEARCH));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Verify the testCenter is 'CUEB'")
	public void step01_Search() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			isTestCenterPreset();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "")
	public void step02_AmendTimeSlot() {
		navigate();
		action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_AMEND_TIME_SLOT));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.SPK_ARRANGEMENT_TIME_SLOT_CDD_NAME), CTDefinedName);
			action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_TIME_SLOT_BACK));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "")
	public void step03_AmendCddApportionment() {
		navigate();
		action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_AMEND_CDD_APPORTIONMENT));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.SPK_ARRANGEMENT_TIME_SLOT_CDD_NAME), CTDefinedName);
			action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_TIME_SLOT_BACK));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	
	
	public boolean isTestCenterPreset() {
		List<WebElement> table = driver.findElements(By.xpath(ElementHelper.SPK_ARRANGEMENT_SEARCH_TC));
		for (WebElement element : table) {
			if (element.getText().equals(ElementHelper.TC_CUEB)) {
				System.out.println(element.getText());
				break;
			}
		}
		return true;
	}
}
