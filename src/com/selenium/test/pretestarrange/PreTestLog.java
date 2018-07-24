package com.selenium.test.pretestarrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class PreTestLog {

	WebDriver driver;
	WebDriverAction action  = new WebDriverAction(driver);;

	public PreTestLog(WebDriver driver) {
		this.driver = driver;
		
	}

	public void navigateAndAssert(String testdate, String module, String operation, String user) {
		action.waitElementVisibleToClick(By.id(ElementHelper.PRE_TEST_ARRANGE));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.PRE_TEST_LOG));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.assertText(By.xpath(ElementHelper.PRE_TEST_LOG_TEST_DATE), testdate);
			action.assertText(By.xpath(ElementHelper.PRE_TEST_LOG_MODULE), module);
			action.assertText(By.xpath(ElementHelper.PRE_TEST_LOG_OPERATION), operation);
			action.assertText(By.xpath(ElementHelper.PRE_TEST_LOG_MMODIFY_USER), user);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
