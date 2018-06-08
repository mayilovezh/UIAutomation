package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestRoomList {
	String tbName_Cn = "对外经济贸易大学继续教育与远程教育学院(高远楼,从西门进)";
	String roomNumber = "RM 01";
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

	/*@Test(description = "Create the test room of UIBE and type is speaking")
	public void step01_Create(){
		searchTestRoom();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.xpath(ElementHelper.TR_CREATE));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.sendkeys(By.id(ElementHelper.TR_ADD_NAME), "111");
			Thread.sleep(ElementHelper.SHORT_TIME);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("$('#RoomQuota').data('kendoNumericTextBox').value('100')");
			Thread.sleep(ElementHelper.SHORT_TIME);
			js.executeScript("$('#OptimalQuota').data('kendoNumericTextBox').value('100')");
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TR_ADD_ROOMTYPE_SPEAKING));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.TR_ADD_ROOMTYPE_WRITING));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.TR_ADD_PRODUCTTYPE_IELTS));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.TR_ADD_PRODUCTTYPE_IELTS_UKVI));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.TR_ADD_PRODUCTTYPE_IELTS_LIFE_SKILLS));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			js.executeScript("$('#Floor').data('kendoNumericTextBox').value('2');");
			action.sendkeys(By.id(ElementHelper.TR_ADD_FLOOR), "2");
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	@Test(description = "Create the share room of UIBE")
	public void step03_CreateShareRoom(){
		try {
			searchTestRoom();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.xpath(ElementHelper.TR_CREATE_SHARE_ROOM));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TR_SHARE_ROOM_1));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.TR_SHARE_ROOM_1_YES));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TR_SHARE_START_DATE), "2018-01-01");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TR_SHARE_END_DATE), "2018-01-31");
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.TR_SHARE_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TR_SHARE_TEST_DAY));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "Search the test room '111' of UIBE and type is speaking")
	public void step02_Search(){
		searchTestRoom();
		textisExist();
	}

	@Test(description = "Modify the test room '111' of UIBE")
	public void step04_Modify(){
		try {
			searchTestRoom();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.xpath(ElementHelper.TR_MODIFY));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.clear(By.id(ElementHelper.TR_MODIFY_REMARK));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.clear(By.id(ElementHelper.TR_MODIFY_REMARK));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TR_MODIFY_REMARK), "Automation Testing");
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "Modify the share room '111' of UIBE")
	public void step05_ModifyShareRoom(){
		try {
			searchTestRoom();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TR_MODIFY_SHARE_DAY));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.CANCEL));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "View the share room's log")
	public void step06_ShareLog(){
		try {
			searchTestRoom();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TR_SHARE_LOG));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "View the test room's detail of UIBE")
	public void step07_View(){
		try {
			searchTestRoom();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.xpath(ElementHelper.TR_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "View the test room's log of UIBE")
	public void step08_ModifyLog(){
		try {
			searchTestRoom();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TR_MODIFYLOG));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchTestRoom(){
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.TEST_CENTER));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TEST_ROOM_LIST));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.isVisible(By.id(ElementHelper.TR_REGION));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.TR_REGION), "1");
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.TR_CENTER), "100100");
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByIndex(By.id(ElementHelper.TR_BUILDING), 1);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByIndex(By.id(ElementHelper.TR_AVAILABLE), 1);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByIndex(By.id(ElementHelper.TR_ROOM_TYPE), 1);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TR_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TR_TBNAME)), tbName_Cn);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean textisExist() {
		boolean status = false;
		try {
			driver.findElement(By.xpath("//td[contains(text(),'" + roomNumber + "')]"));
			System.out.println(roomNumber + " is appeard!");
			status = true;
		} catch (NoSuchElementException e) {
			status = false;
		}
		return status;
	}
}
