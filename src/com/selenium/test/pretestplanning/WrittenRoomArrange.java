package com.selenium.test.pretestplanning;

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

public class WrittenRoomArrange {
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

	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.PRE_TEST_PLANNING));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.WRITTEN_ROOM_ARRANGE));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByIndex(By.id(ElementHelper.WRITTEN_ROOM_ARRANGE_MONTH), 3);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.WRITTEN_ROOM_ARRANGE_DATE), "10347");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void step01_ChangeArrangement() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.WRITTEN_ROOM_ARRANGE_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.WRITTEN_ROOM_ARRANGE_CHANGE));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.WRITTEN_ROOM_ARRANGE_ADD_ROOM));
		Thread.sleep(ElementHelper.SHORT_TIME);
//		action.selectByValue(By.id(ElementHelper.WRA_ADD_ROOM_BUILDING), "162");
//		Thread.sleep(ElementHelper.LONG_TIME);
//		action.click(By.xpath(ElementHelper.WRA_ADD_ROOM_SAVE));
//		Thread.sleep(ElementHelper.SHORT_TIME);
//		action.click(By.id(ElementHelper.WRA_SELECT_ALL));
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
//		action.click(By.id(ElementHelper.WRA_SAVE));
//		Thread.sleep(ElementHelper.SHORT_TIME);
//		action.click(By.xpath(ElementHelper.WRA_SAVE_CONFIRM));
//		Thread.sleep(ElementHelper.SHORT_TIME);
//		action.click(By.xpath(ElementHelper.WRA_CONFIRM));
//		Thread.sleep(ElementHelper.SHORT_TIME);
//		Assert.assertEquals(action.getText(By.id(ElementHelper.WRA_SAVE_TEXT)), "Success.");
	}
	
	@Test
	public void step02_DeleteRoom() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.WRITTEN_ROOM_ARRANGE_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.WRITTEN_ROOM_ARRANGE_CHANGE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.WRA_DELETE_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
//		action.click(By.id(ElementHelper.WRA_DELETE));
//		Alert confirm = driver.switchTo().alert();
//		confirm.accept();
//		Thread.sleep(ElementHelper.SHORT_TIME);
	}
}
