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
	String tbName_Cn = "对外经济贸易大学继续教育学院(高远楼)";
	String tbName_En = "Teaching building of Beijing Education And Exam Instruction Centre";
	String floor = "1,2";
	String tbAddress_Cn = "北京市朝阳区惠新东街10号";
	String tbAddress_En = "No.10 Huixin dongjie, Chaoyang district, Beijing";
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

	public void searchTB() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TEST_CENTER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TEST_BUILDING_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.isVisible(By.id(ElementHelper.TB_REGION));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TB_REGION), "1");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.TB_CENTER), "100100");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TB_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.id(ElementHelper.TB_NAME)), tbName);
	}

	/*@Test
	public void step01_Create() throws Exception {
		searchTB();
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.TB_CREATE));
		Thread.sleep(ElementHelper.SHORT_TIME);
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
	}*/

	@Test
	public void step02_Search() throws Exception {
		searchTB();
	}
	
	@Test
	public void step03_Modify() throws Exception {
		searchTB();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.linkText(ElementHelper.TB_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.TB_MODIFY_REMARK), "Automation Testing");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.cssSelector(ElementHelper.TB_MODIFY_SAVE));
	}
	
	@Test
	public void step04_ModifyLog() throws Exception {
		searchTB();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.linkText(ElementHelper.TB_MODIFYLOG));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
	@Test
	public void step05_View() throws Exception {
		searchTB();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.linkText(ElementHelper.TB_VIEW));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TB_VIEW_NAME)), tbName_Cn);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		
	}
	
	@Test
	public void step06_LendBuilding() throws Exception {
		searchTB();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.linkText(ElementHelper.TB_LENDBUILDING));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TB_LENDBUILDING_ONE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
	}
}
