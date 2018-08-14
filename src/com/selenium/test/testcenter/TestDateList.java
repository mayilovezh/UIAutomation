package com.selenium.test.testcenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
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

public class TestDateList {
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

	public void navigate() {
		try {
			action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
			action.waitElementVisibleToClick(By.xpath(ElementHelper.TEST_DATE_LIST));
			action.waitElementVisible(By.id(ElementHelper.TD_YEAR));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.TD_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Vefiry select options")
	public void step01_VerifySelectOptions() {
		navigate();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_B);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		List<String> productOptions = Arrays
				.asList(new String[] { ElementHelper.SELECT_ALL, ElementHelper.PRODUCT_IELTS,
						ElementHelper.PRODUCT_IELTS_UKVI, ElementHelper.PRODUCT_IELTS_LIFE_SKILLS });
		int productSize = productOptions.size();
		Select productselectStage = new Select(driver.findElement(By.id(ElementHelper.TD_EXAM_PRODUCT_TYPE)));
		Assert.assertFalse(productselectStage.isMultiple());
		List<String> productOptions1 = new ArrayList<String>();
		for (WebElement element : productselectStage.getOptions()) {
			productOptions1.add(element.getText());
		}
		Assert.assertEquals(productOptions.toArray(), productOptions1.toArray());
		System.out.println("The select list number is" + " " + productSize);

		List<String> formatOptions = Arrays
				.asList(new String[] { ElementHelper.SELECT_ALL, ElementHelper.FORMAT_PB, ElementHelper.FORMAT_CB,
						ElementHelper.FORMAT_CD_AM, ElementHelper.FORMAT_CD_PM1, ElementHelper.FORMAT_CD_PM2 });
		int formatSize = formatOptions.size();
		Select formatselectStage = new Select(driver.findElement(By.id(ElementHelper.TD_EXAM_FORMAT)));
		Assert.assertFalse(formatselectStage.isMultiple());
		List<String> formatOptions1 = new ArrayList<String>();
		for (WebElement element : formatselectStage.getOptions()) {
			formatOptions1.add(element.getText());
		}
		Assert.assertEquals(formatOptions.toArray(), formatOptions1.toArray());
		System.out.println("The select list number is" + " " + formatSize);

	}

	@Test(description = "Import testDate")
	public void step02_Import() {
		navigate();
		try {
			action.selectByValue(By.id(ElementHelper.TD_EXAM_PRODUCT_TYPE), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TD_EXAM_FORMAT), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TD_SEARCH));
			if (action.isWebElementPreset(By.xpath(ElementHelper.TD_SEARCH_DATE1))) {
				new DriverInstance().teardown(driver);
			} else {
				action.waitElementVisibleToClick(By.id(ElementHelper.TD_IMPORT));
				action.uploadFile("\\resource\\testcenter\\TestDate.xlsx", By.id(ElementHelper.TD_IMPORT_CHOOSE));
				action.click(By.cssSelector(ElementHelper.TD_IMPORT_UPLOAD));
				action.setTimeout("10");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "Search testdate of 'IELTS' and 'PB'")
	public void step03_SearchIELTS_PB() {
		navigate();
		try {
			action.selectByValue(By.id(ElementHelper.TD_EXAM_PRODUCT_TYPE), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TD_EXAM_FORMAT), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TD_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			assertTableList(48);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search testdate of 'IELTS' and 'CD AM'")
	public void step04_SearchIELTS_CDAM() {
		navigate();
		try {
			action.selectByValue(By.id(ElementHelper.TD_EXAM_PRODUCT_TYPE), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TD_EXAM_FORMAT), "3");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TD_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			assertTableList(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search testdate of 'IELTS' and 'CD PM'")
	public void step05_SearchIELTS_CDPM() {
		navigate();
		try {
			action.selectByValue(By.id(ElementHelper.TD_EXAM_PRODUCT_TYPE), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TD_EXAM_FORMAT), "4");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TD_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			assertTableList(8);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search testdate of 'IELTS' and 'CD EV'")
	public void step06_SearchIELTS_CDEV() {
		navigate();
		try {
			action.selectByValue(By.id(ElementHelper.TD_EXAM_PRODUCT_TYPE), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TD_EXAM_FORMAT), "5");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TD_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			assertTableList(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search testdate of 'IELTS UKVI' and 'PB'")
	public void step07_SearchIELTS_UKVI_PB() {
		navigate();
		try {
			action.selectByValue(By.id(ElementHelper.TD_EXAM_PRODUCT_TYPE), "2");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TD_EXAM_FORMAT), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TD_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			assertTableList(48);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "Search testdate of 'IELTS UKVI' and 'CB'")
	public void step08_SearchIELTS_UKVI_CB() {
		navigate();
		try {
			action.selectByValue(By.id(ElementHelper.TD_EXAM_PRODUCT_TYPE), "2");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TD_EXAM_FORMAT), "2");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TD_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			assertTableList(18);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "Search testdate of 'IELTS Life Skills' and 'PB'")
	public void step09_SearchIELTS_Life_Skills_PB() {
		navigate();
		try {
			action.selectByValue(By.id(ElementHelper.TD_EXAM_PRODUCT_TYPE), "3");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TD_EXAM_FORMAT), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TD_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			assertTableList(26);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void assertTableList(int number) {
		List<WebElement> tableList = driver.findElements(By.xpath(ElementHelper.TD_SEARCH_TABLE_LIST));
		if (tableList.size() == number) {
			System.out.println("Table list number is:" + tableList.size());
		}
	}

}
