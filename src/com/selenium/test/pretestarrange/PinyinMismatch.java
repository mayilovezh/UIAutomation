package com.selenium.test.pretestarrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class PinyinMismatch {
	static WebDriver driver;
	WebDriverAction action;
	String cddNo = "249461";
	String tc = "BJ-BFSU";
	String chineseName = "吕 瑄";
	String wrongPinyin = "LYU XUAN";
	String possiblePinyin = "LV";
	String testDate = "2018-01-06";
	String nationality = "China";
	String status = "Saved";
	
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
		action.waitElementVisibleToClick(By.xpath(ElementHelper.PINYIN_MISMATCH));
		try {
			action.waitElementVisible(By.id(ElementHelper.PINYIN_MISMATCH_REGION));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.PINYIN_MISMATCH_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.PINYIN_MISMATCH_MONTH), 0);	
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByIndex(By.id(ElementHelper.PINYIN_MISMATCH_DATE), 1);	
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.PINYIN_MISMATCH_DATE), 1);	
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.PINYIN_MISMATCH_TC), "50");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.PINYIN_MISMATCH_SEARCH));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Search the candidate which one was mismatch.")
	public void step01_Search() {
		navigate();
		action.waitElementVisibleToAssert(By.xpath(ElementHelper.PINYIN_MISMATCH_SEARCH_CDD_NO), cddNo);
		action.assertText(By.xpath(ElementHelper.PINYIN_MISMATCH_SEARCH_TC), tc);
		action.assertText(By.xpath(ElementHelper.PINYIN_MISMATCH_SEARCH_CHINESE_NAME), chineseName);
		action.assertText(By.xpath(ElementHelper.PINYIN_MISMATCH_SEARCH_WRONG_PINYIN), wrongPinyin);
		action.assertText(By.xpath(ElementHelper.PINYIN_MISMATCH_SEARCH_POSSIBLE_PINYIN), possiblePinyin);
		action.assertText(By.xpath(ElementHelper.PINYIN_MISMATCH_SEARCH_TEST_DATE), testDate);
		action.assertText(By.xpath(ElementHelper.PINYIN_MISMATCH_SEARCH_NATIONALITY), nationality);
		
	}
	
	@Test(description = "Change status 'Not Set' to 'Saved'")
	public void step02_SaveCdd() {
		navigate();
		action.waitElementVisibleToClick(By.xpath(ElementHelper.PINYIN_MISMATCH_SEARCH_ITEM));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.PINYIN_MISMATCH_SAVE));
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.PINYIN_MISMATCH_SEARCH_STATUS), status);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
}
