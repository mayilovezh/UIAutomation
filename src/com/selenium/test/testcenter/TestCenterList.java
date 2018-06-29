package com.selenium.test.testcenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestCenterList {
	WebDriver driver;
	WebDriverAction action;
	String tcName = "对外经济贸易大学";
	String tcEName = "University of International Business and Economics";
	String abbreviation = "BJ-UIBE";
	String address = "朝阳区惠新东街10号(中日友好医院北侧)";
	String addressE = "Chaoyang District, No. 10 Huixin East Street (Sino-Japanese Friendship Hospital on the north side)";
	String errorMessage = "The check does not pass, the specific look at the error message Error!";
	String provinceWarning = "please select the province";
	String cityWarning = "please select the city";
	String tcNameCnWarning = "centerNameAdd is required";
	String tcNameEnWarning = "centerNameEnAdd is required";
	String quotaWarning = "TcQuota is required";
	String optimalQuotaWarning = "TcOptimalQuota is required";
	String abbreviationWarning = "abbreviationAdd is required";
	String addressCnWarning = "CenterAddress is required";
	String addressEnWarning = "CenterAddressEn is required";

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
		action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.TEST_CENTER_LIST));
	}
	
	@Test(description = "Verify input value and select options warnings.")
	public void step01_Verifycreatewarning() {
		navigate();
		try {
			action.waitElementVisibleToClick(By.xpath(ElementHelper.TC_CREATE));
			action.waitElementVisible(By.id(ElementHelper.TC_ADD_REGION));
			List<String> regionOptions = Arrays
					.asList(new String[] { ElementHelper.SELECT_DEFAULT, ElementHelper.NORTH_REGION,
							ElementHelper.EAST_REGION, ElementHelper.SOUTH_REGION, ElementHelper.S_WEST_REGION });
			int regionSize = regionOptions.size();
			Select regionselectStage = new Select(driver.findElement(By.id(ElementHelper.TC_ADD_REGION)));
			Assert.assertFalse(regionselectStage.isMultiple());
			List<String> regionOptions1 = new ArrayList<String>();
			for (WebElement element : regionselectStage.getOptions()) {
				regionOptions1.add(element.getText());
			}
			Assert.assertEquals(regionOptions.toArray(), regionOptions1.toArray());
			System.out.println("The select list number is" + " " + regionSize);

			List<String> productOptions = Arrays.asList(new String[] { ElementHelper.PRODUCT_IELTS,
					ElementHelper.PRODUCT_IELTS_UKVI, ElementHelper.PRODUCT_IELTS_LIFE_SKILLS });
			int productSize = productOptions.size();
			Select productselectStage = new Select(driver.findElement(By.id(ElementHelper.TC_ADD_PRODUCT_TYPE)));
			Assert.assertFalse(productselectStage.isMultiple());
			List<String> productOptions1 = new ArrayList<String>();
			for (WebElement element : productselectStage.getOptions()) {
				productOptions1.add(element.getText());
			}
			Assert.assertEquals(productOptions.toArray(), productOptions1.toArray());
			System.out.println("The select list number is" + " " + productSize);
			action.click(By.xpath(ElementHelper.SAVE));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.chooseOkOnNextConfirmation();
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.isTextPrest(By.id(ElementHelper.TC_ADD_ERROR), errorMessage);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.TC_ADD_ERROR_CONFIRM));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.isTextPrest(By.xpath(ElementHelper.TC_ADD_PROVINCE_WARNING), provinceWarning);
			action.isTextPrest(By.xpath(ElementHelper.TC_ADD_CITY_WARNING), cityWarning);
			action.isTextPrest(By.xpath(ElementHelper.TC_ADD_CENTERNAME_CN_WARNING), tcNameCnWarning);
			action.isTextPrest(By.xpath(ElementHelper.TC_ADD_CENTERNAME_EN_WARNING), tcNameEnWarning);
			action.isTextPrest(By.xpath(ElementHelper.TC_ADD_TC_QUOTA_WARNING), quotaWarning);
			action.isTextPrest(By.xpath(ElementHelper.TC_ADD_TC_OPTIMALQUOTA_WARNING), optimalQuotaWarning);
			action.isTextPrest(By.xpath(ElementHelper.TC_ADD_ABBREVIATION_WARNING), abbreviationWarning);
			action.isTextPrest(By.xpath(ElementHelper.TC_ADD_ADDRESS_CN_WARNING), addressCnWarning);
			action.isTextPrest(By.xpath(ElementHelper.TC_ADD_ADDRESS_EN_WARNING), addressEnWarning);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Create the TestCenter UIBE")
	public void step02_CreateTC(){
		searchTC();
		try {
			if(action.isWebElementPreset(By.xpath(ElementHelper.TC_SEARCH_NAME))) {
				new DriverInstance().teardown(driver);
			} else {
				Thread.sleep(ElementHelper.WAIT_TIME);
				action.click(By.id(ElementHelper.TEST_CENTER));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.xpath(ElementHelper.TEST_CENTER_LIST));
				Thread.sleep(ElementHelper.WAIT_TIME);
				action.isVisible(By.id(ElementHelper.TC_REGION));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.xpath(ElementHelper.TC_CREATE));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.isVisible(By.id(ElementHelper.TC_ADD_REGION));
				Thread.sleep(ElementHelper.WAIT_TIME);
				action.selectByIndex(By.id(ElementHelper.TC_ADD_PROVINCE), 1);
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.selectByIndex(By.id(ElementHelper.TC_ADD_CITY), 1);
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.sendkeys(By.id(ElementHelper.TC_ADD_CENTERNAME_CN), tcName);
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.sendkeys(By.id(ElementHelper.TC_ADD_CENTERNAME_EN), tcEName);
				Thread.sleep(ElementHelper.SHORT_TIME);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("$('#TcQuota').data('kendoNumericTextBox').value('500')");
				Thread.sleep(ElementHelper.SHORT_TIME);
				js.executeScript("$('#TcOptimalQuota').data('kendoNumericTextBox').value('500')");
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.sendkeys(By.id(ElementHelper.TC_ADD_ABBREVIATION), abbreviation);
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.sendkeys(By.id(ElementHelper.TC_ADD_ADDRESS_CN), address);
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.sendkeys(By.id(ElementHelper.TC_ADD_ADDRESS_EN), addressE);
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Verify input Incorrect text and regions.")
	public void step03_Verifyselectandinput() {
		navigate();
		action.waitElementVisible(By.id(ElementHelper.TC_REGION));
		List<String> stageOptions = Arrays.asList(new String[] { ElementHelper.ALL_REGIONS, ElementHelper.NORTH_REGION,
				ElementHelper.EAST_REGION, ElementHelper.SOUTH_REGION, ElementHelper.S_WEST_REGION });
		int size = stageOptions.size();
		Select selectStage = new Select(driver.findElement(By.id(ElementHelper.TC_REGION)));
		Assert.assertFalse(selectStage.isMultiple());
		List<String> stageOptions1 = new ArrayList<String>();
		for (WebElement element : selectStage.getOptions()) {
			stageOptions1.add(element.getText());
		}
		Assert.assertEquals(stageOptions.toArray(), stageOptions1.toArray());
		System.out.println("The select list number is" + " " + size);
		action.sendkeys(By.id(ElementHelper.TC_NAME), abbreviation);
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TC_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.isTextPrest(By.xpath(ElementHelper.TC_SEARCH_NO_DATA), ElementHelper.NO_AVAILABLE_DATA);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Search for the TestCenter of UIBE")
	public void step04_Search() {
		searchTC();
	}

	@Test(description = "Modify the TestCenter of UIBE")
	public void step05_Modify() {
		searchTC();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.cssSelector(ElementHelper.TC_MODIFY));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.clear(By.id(ElementHelper.TC_MODIFY_DESCRIPTION));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.clear(By.id(ElementHelper.TC_MODIFY_DESCRIPTION));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TC_MODIFY_DESCRIPTION), ElementHelper.REMARK_VALUE1);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the testcenter details of UIBE")
	public void step06_View() {
		searchTC();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TC_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TC_VIEW_NAME)), tcName);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the modifylog of UIBE")
	public void step07_ModifyLog() {
		searchTC();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TC_MODIFYLOG));
			Thread.sleep(ElementHelper.WAIT_TIME);
//			action.isTextPrest(By.xpath(ElementHelper.TC_MODIFYLOG_DETAILS), ElementHelper.REMARK_VALUE1);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TC_MODIFYLOG_CREATE_BY)),
					ElementHelper.USER_NAME_UAT);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void searchTC() {
		navigate();
		try {
			action.waitElementVisible(By.id(ElementHelper.TC_REGION));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TC_NAME), tcName);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.TC_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.TC_SEARCH_NAME), tcName);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.TC_SEARCH_ABBREVATION), abbreviation);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
