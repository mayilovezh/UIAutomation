package com.selenium.test.testcenter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestRoomList {
	private static String roomNumber1 ;
	String startDate = "2018-06-01";
	String endDate = "2018-06-30";
	static WebDriver driver;
	WebDriverAction action;
	String tbName_Cn = "对外经济贸易大学继续教育与远程教育学院(高远楼,从西门进)";
	String tbName_En = "Gaoyuan Building,University of International Business and Economics  (enter from West gate)";
	String roomName = "RM 01";
	String warningMessage = "The check does not pass, the specific look at the error message Error!";
	String roomNameWarning = "This room name is already used";
	String roomQuotaWarning = "RoomQuota is required";
	String optimalQuotaWarning = "OptimalQuota is required";
	String roomTypeWarning = "Room Type At least choose one";
	String productTypeWarning = "Room Product Type At least choose one";
	String floorWarning = "Floor is required";
	String modifyshareDayWarning = "Please click Search button first!";

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}
	
	@Test(description = "Verify input value and select options warnings.")
	public void step01_VerifyCreateWarning() {
		searchTestRoom();
		action.click(By.xpath(ElementHelper.TR_CREATE));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SAVE));
			action.isTextPrest(By.id(ElementHelper.RESULT_WARNING), warningMessage);
			action.click(By.xpath(ElementHelper.TR_WARNING_MESSAGE_CONFIRM));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.clear(By.id(ElementHelper.TR_ADD_NAME));
			action.waitElementVisibleToSendKeys(By.id(ElementHelper.TR_ADD_NAME), roomName);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TR_CREATE_ROOM_TOWARD));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.isTextPrest(By.xpath(ElementHelper.TR_CREATE_ROOM_NAME_WARNING), roomNameWarning);
			action.isTextPrest(By.xpath(ElementHelper.TR_CREATE_ROOM_QUOTA_WARNING), roomQuotaWarning);
			action.isTextPrest(By.xpath(ElementHelper.TR_CREATE_OPTIMAL_QUOTA_WARNING), optimalQuotaWarning);
			action.isTextPrest(By.xpath(ElementHelper.TR_CREATE_ROOM_TYPE_WARNING), roomTypeWarning);
			action.isTextPrest(By.xpath(ElementHelper.TR_CREATE_ROOM_PRODUCT_TYPE_WARNING), productTypeWarning);
			action.isTextPrest(By.xpath(ElementHelper.TR_CREATE_FLOOR_WARNING), floorWarning);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Create the test room of UIBE and type is speaking")
	public void step02_CreateTestRoom(){
		searchTestRoom();
		try {
			if (action.isTextExist(By.xpath(ElementHelper.TR_SEARCH_ROOM_NAME), roomName)) {
				new DriverInstance().teardown(driver);
			} else {
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
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Search the test room of UIBE and type is speaking")
	public void step02_Search(){
		searchTestRoom();
		textisExist();
	}

	@Test(description = "Create the share room of UIBE")
	public void step03_CreateShareRoom() {
		try {
			searchTestRoom();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.xpath(ElementHelper.TR_CREATE_SHARE_ROOM));
			Thread.sleep(ElementHelper.SHORT_TIME);
			List<WebElement> table = driver.findElements(By.xpath(ElementHelper.TR_SHARE_ROOMNUMBER));
			for (WebElement element : table) {
				if (!element.isSelected()) {
					element.click();
					roomNumber1 = element.getText();
					System.out.println(roomNumber1);
					action.click(By.xpath(ElementHelper.TR_CREATE_SHARE_ROOM_NAME));
					Thread.sleep(ElementHelper.SHORT_TIME_A);
					action.sendkeys(By.id(ElementHelper.TR_SHARE_START_DATE), startDate);
					Thread.sleep(ElementHelper.SHORT_TIME_A);
					action.sendkeys(By.id(ElementHelper.TR_SHARE_END_DATE), endDate);
					Thread.sleep(ElementHelper.SHORT_TIME_A);
					action.click(By.id(ElementHelper.TR_SHARE_SEARCH));
					Thread.sleep(ElementHelper.SHORT_TIME);
					action.click(By.xpath(ElementHelper.TR_SHARE_TEST_DAY));
					Thread.sleep(ElementHelper.SHORT_TIME);
					action.click(By.xpath(ElementHelper.SAVE));
					Thread.sleep(ElementHelper.WAIT_TIME);
					break;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
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
			action.sendkeys(By.id(ElementHelper.TR_MODIFY_REMARK), ElementHelper.REMARK_VALUE1);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Modify the share room of UIBE")
	public void step05_ModifyShareDay() {
		try {
			searchTestRoom();
			Thread.sleep(ElementHelper.WAIT_TIME);
//			getRoomNumber();
			action.click(By.linkText(ElementHelper.TR_MODIFY_SHARE_DAY));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.sendkeys(By.id(ElementHelper.TR_MODIFY_SHARE_START_DATE), startDate);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TR_MODIFY_SHARE_END_DATE), endDate);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.id(ElementHelper.TR_MODIFY_SHARE_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
//			List<WebElement> table = driver.findElements(By.xpath(ElementHelper.TR_MPDDIFY_SHARE_LIST));
//			for (WebElement element : table) {
//				if (element.isSelected()) {
//					element.click();
//					Thread.sleep(ElementHelper.SHORT_TIME_A);
//					break;
//				}
//			}
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the share room's log")
	public void step06_ShareLog(){
		try {
			searchTestRoom();
			Thread.sleep(ElementHelper.WAIT_TIME);
			getRoomNumber();
			action.click(By.linkText(ElementHelper.TR_SHARE_LOG));
			action.isTextPrest(By.xpath(ElementHelper.TR_SHARE_LOG_ROOM_NAME), roomName);
			action.isTextPrest(By.xpath(ElementHelper.TR_SHARE_LOG_CREATE_BY), ElementHelper.USER_NAME_UAT);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the test room's detail of UIBE")
	public void step07_View(){
		try {
			searchTestRoom();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.xpath(ElementHelper.TR_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.TR_VIEW_BUILDING_NAME), tbName_En);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.TR_VIEW_ROOM_NAME), roomNumber1);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
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
			System.out.println(e);
		}
	}
	
	@Test(description = "Verify alert message and required fields")
	public void step09_VerifyModifyShareDay() {
		searchTestRoom();
		getRoomNumber();
		action.click(By.linkText(ElementHelper.TR_MODIFY_SHARE_DAY));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
			action.isTextPrest(By.id(ElementHelper.RESULT_WARNING), modifyshareDayWarning);
			action.click(By.xpath(ElementHelper.TR_WARNING_MESSAGE_CONFIRM));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TR_MODIFY_SHARE_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.chooseCancelOnNextConfirmation();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Verify not modify values and share log is null")
	public void step10_VerifyShareDayLog() {
		searchTestRoom();
		getRoomNumber();
		action.click(By.linkText(ElementHelper.TR_MODIFY_SHARE_DAY));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.sendkeys(By.id(ElementHelper.TR_MODIFY_SHARE_START_DATE), startDate);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TR_MODIFY_SHARE_END_DATE), endDate);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TR_MODIFY_SHARE_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SAVE));
			Thread.sleep(ElementHelper.LONG_TIME);
			action.waitElementVisibleToClick(By.linkText(ElementHelper.TR_SHARE_LOG));
			action.waitElementVisibleToAssertFalse(By.xpath(ElementHelper.TR_SHARE_LOG_CREATE_BY),ElementHelper.REMARK_VALUE1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void searchTestRoom(){
		try {
			action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
			action.waitElementVisibleToClick(By.xpath(ElementHelper.TEST_ROOM_LIST));
			action.waitElementVisible(By.id(ElementHelper.TR_REGION));
			action.selectByValue(By.id(ElementHelper.TR_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TR_CENTER), ElementHelper.CENTER_UIBE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.TR_BUILDING), 1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.TR_AVAILABLE), 1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.TR_ROOM_TYPE), 1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.TR_SEARCH));
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.TR_TBNAME), tbName_Cn);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public boolean textisExist() {
		boolean status = false;
		try {
			driver.findElement(By.xpath("//td[contains(text(),'" + roomName + "')]"));
			System.out.println(roomName + " is appeard!");
			status = true;
		} catch (NoSuchElementException e) {
			status = false;
		}
		return status;
	}
	
	public boolean getRoomNumber() {
		List<WebElement> table = driver.findElements(By.xpath(ElementHelper.TR_ROOMNUMBER_LIST));
		for (WebElement element : table) {
			if (element.getText().contains(roomNumber1)) {
				System.out.println(element.getText());
				break;
			}
		}
		return true;
	}
}
