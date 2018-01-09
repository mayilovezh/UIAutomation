package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selenium.test.DriverInstance;
import com.selenium.test.element.ElementHelper;
import com.selenium.test.listener.WebDriverAction;

public class TestCenterList{
	protected WebDriver driver;
	public static WebDriverAction action;
    ElementHelper helper = new ElementHelper();
	DriverInstance test = new DriverInstance();

	@Test
	public void createTC() throws Exception {
		test.login();
		Thread.sleep(helper.WAIT_TIME);
		action.click(By.id(helper.TC_CREATE));
	}
}
