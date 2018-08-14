package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestBuildingList {
	String tbName = "对外经济贸易大学";
	String tbName_Cn = "对外经济贸易大学继续教育与远程教育学院(高远楼,从西门进)";
	String tbName_En = "Teaching building of Beijing Education And Exam Instruction Centre";
	String floor = "1,2";
	String tbAddress_Cn = "北京市朝阳区惠新东街10号";
	String tbAddress_En = "No.10 Huixin dongjie, Chaoyang district, Beijing";
	String buildingType = "Speaking | Writing";
	static WebDriver driver;
	WebDriverAction action;
	boolean isTextPrest = false;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	@Test(description = "Create the testbuilding of UIBE")
	public void step01_Create(){
		navigate();
		try {
			if(action.isTextExist(By.id(ElementHelper.TB_NAME), tbName)) {
				new DriverInstance().teardown(driver);
			} else {
				action.click(By.xpath(ElementHelper.TB_CREATE));
				Thread.sleep(ElementHelper.SHORT_TIME_B);
				action.sendkeys(By.id(ElementHelper.TB_ADD_NAME_CN), tbName_Cn);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.sendkeys(By.id(ElementHelper.TB_ADD_NAME_EN), tbName_En);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.TB_TYPE_SPEAKING));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.TB_TYPE_WRITING));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.TB_TYPE_CB));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.sendkeys(By.id(ElementHelper.TB_FLOOR), floor);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.sendkeys(By.id(ElementHelper.TB_ADDRESS_CN), tbAddress_Cn);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.sendkeys(By.id(ElementHelper.TB_ADDRESS_CN), tbAddress_En);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.cssSelector(ElementHelper.TB_SAVE));
				Thread.sleep(ElementHelper.SHORT_TIME);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search for the testbuilding of UIBE")
	public void step02_Search(){
		searchTB();
	}
	
	@Test(description = "Modify the testbuilding of UIBE")
	public void step03_Modify(){
		searchTB();
		try {
			action.click(By.linkText(ElementHelper.TB_MODIFY));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.clear(By.id(ElementHelper.TB_MODIFY_REMARK));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TB_MODIFY_REMARK), ElementHelper.REMARK_VALUE1);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.cssSelector(ElementHelper.TB_MODIFY_SAVE));
			Thread.sleep(ElementHelper.SHORT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "View the testbuilding's log of UIBE")
	public void step04_ModifyLog(){
		searchTB();
		try {
			action.click(By.linkText(ElementHelper.TB_MODIFYLOG));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TB_MODIFYLOG_CREATE_BY)), ElementHelper.USER_NAME_QA);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "View the testbuilding's detail of UIBE")
	public void step05_View(){
		searchTB();
		try {
			action.click(By.linkText(ElementHelper.TB_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TB_VIEW_NAME)), tbName_Cn);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TB_VIEW_BUILDING_TYPE)), buildingType);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Lend testbuilding from other testcenter")
	public void step06_LendBuilding(){
		searchTB();
		try {
			action.click(By.linkText(ElementHelper.TB_LENDBUILDING));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TB_LENDBUILDING_TC));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Check the lend testbuilding is BFSU")
	public void step07_Lendingbuildingcheck(){
		searchTB();
		isTextPrest = driver.findElement(By.xpath(ElementHelper.TB_LENDBUILDING_CHECK)).getText().contains("( Borrowed from BJ-BFSU )");
		Assert.assertTrue(isTextPrest);
	}
	
	public void navigate() {
		try {
			action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
			action.waitElementVisibleToClick(By.xpath(ElementHelper.TEST_BUILDING_LIST));
			action.waitElementVisible(By.id(ElementHelper.TB_REGION));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.TB_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TB_CENTER), ElementHelper.CENTER_UIBE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TB_AVAILABLE), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.TB_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void searchTB(){
		navigate();
	    action.waitElementVisibleToAssert(By.id(ElementHelper.TB_NAME), tbName);
	}
	
}
