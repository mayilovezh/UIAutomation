package com.selenium.test.stock;

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

public class CategoryManagement {

	static WebDriver driver;
	WebDriverAction action;
	String categoryName = "Automation Writting Answer Sheet";
	String everyPackageNumber = "10";
	String useNumber = "10";
	String categoryNameTip = "The value is correct!";
	
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
		action.waitElementVisibleToClick(By.id(ElementHelper.STOCK));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.CATEGORY_MANAGEMENT));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Create a stock category which type is 'Permanent'.")
	public void step01_CreatePermanent() {
		navigate();
		action.click(By.id(ElementHelper.CATEGORY_MANAGEMENT_CREATE));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.sendkeys(By.id(ElementHelper.CATEGORY_MANAGEMENT_CREATE_NAME), categoryName);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.CATEGORY_MANAGEMENT_CREATE_EVERY_PACKAGE_NUMBER), everyPackageNumber);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.assertText(By.xpath(ElementHelper.CATEGORY_MANAGEMENT_CREATE_NAME_TIP), categoryNameTip);
			action.click(By.id(ElementHelper.CATEGORY_MANAGEMENT_CREATE_PERMANENT));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.CATEGORY_MANAGEMENT_CREATE_TYPE), "360");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.clear(By.id(ElementHelper.CATEGORY_MANAGEMENT_CREATE_USE_NUMBER));
			action.sendkeys(By.id(ElementHelper.CATEGORY_MANAGEMENT_CREATE_USE_NUMBER), useNumber);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Search stock category which name is'Automation Writting Answer Sheet'")
	public void step02_Search() {
		search();
	}
	
	@Test(description = "")
	public void step03_Modify() {
		search();
		action.click(By.xpath(ElementHelper.CATEGORY_MANAGEMENT_MODIFY));
		
		
	}
	
	public void search() {
		navigate();
		action.selectByValue(By.id(ElementHelper.CATEGORY_MANAGEMENT_STOCK_TYPE), "340");
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.CATEGORY_MANAGEMENT_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			isContainCategoryName();
			action.assertText(By.xpath(ElementHelper.CATEGORY_MANAGEMENT_PERMANENT_Y), ElementHelper.YES);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public boolean isContainCategoryName() {
		boolean status = false;
		List<WebElement> table = driver.findElements(By.xpath(ElementHelper.CATEGORY_MANAGEMENT_SEARCH_NAME));
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).getText().equals(categoryName)) {
				status = true;
			} else {
				status = false;
				//System.out.println(categoryName + "  did not match!");
			}
		}
		return status;
	}
}
