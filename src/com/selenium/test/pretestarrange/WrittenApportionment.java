package com.selenium.test.pretestarrange;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.ExcelReader;
import com.selenium.test.utils.WebDriverAction;

public class WrittenApportionment {

	static WebDriver driver;
	WebDriverAction action;
	String TC = "BJ-CUEB";
	String roomQuota = "294";
	String optimalQuota = "294";
	String ACCandidates = "281";
	String totalCandidates = "281";
	String invigilators = "17";
	String successMessage = "success.";
	ExcelReader reader = new ExcelReader(".\\resource\\pretestArrange\\WrittenCandidatesAllocation.xlsx");

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
		action.waitElementVisibleToClick(By.id(ElementHelper.PRE_TEST_ARRANGE));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT));
		action.waitElementVisible(By.id(ElementHelper.WRITTEN_APPORTIONMENT_REGION));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.WRITTEN_APPORTIONMENT_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.WRITTEN_APPORTIONMENT_MONTH), 4);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.WRITTEN_APPORTIONMENT_DATE), "10352");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.WRITTEN_APPORTIONMENT_SEARCH));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Verify the testCenter is 'CUEB'")
	public void step01_Search() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			isTestCenterPreset();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the written room arrangement detail")
	public void step02_View() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			isTestCenterPreset();
			action.click(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.waitElementVisibleToAssert(By.id(ElementHelper.WRITTEN_APPORTIONMENT_VIEW_ROOM_QUOTA), roomQuota);
			action.waitElementVisibleToAssert(By.id(ElementHelper.WRITTEN_APPORTIONMENT_VIEW_OPTIMAL_QUOTA),
					optimalQuota);
			action.waitElementVisibleToAssert(By.id(ElementHelper.WRITTEN_APPORTIONMENT_VIEW_AC_CANDIDATES),
					ACCandidates);
			action.waitElementVisibleToAssert(By.id(ElementHelper.WRITTEN_APPORTIONMENT_VIEW_TOTAL_CANDIDATES),
					totalCandidates);
			action.waitElementVisibleToAssert(By.id(ElementHelper.WRITTEN_APPORTIONMENT_VIEW_INVIGILATOR),
					invigilators);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.WRITTEN_APPORTIONMENT_VIEW_BACK));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "add written candidates allocation for 'CUEB'")
	public void step03_Addcandidatesallocation() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			isTestCenterPreset();
			action.click(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_ADD));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.WRITTEN_CDD_ALLOCATION_AUTO_APPORTION));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.WRITTEN_CDD_ALLOCATION_SAVE));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.chooseOkOnNextConfirmation();
			action.isTextPrest(By.id(ElementHelper.RESULT_WARNING), successMessage);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Amend and check the candidates allocation")
	public void step04_Unappcandidatesallocation() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			isTestCenterPreset();
			action.click(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD1)),
					reader.getCellValue("Sheet1", 1, 0));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD2)),
					reader.getCellValue("Sheet1", 2, 0));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD3)),
					reader.getCellValue("Sheet1", 3, 0));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD4)),
					reader.getCellValue("Sheet1", 4, 0));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD5)),
					reader.getCellValue("Sheet1", 5, 0));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD6)),
					reader.getCellValue("Sheet1", 6, 0));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD_NAME1)),
					reader.getCellValue("Sheet1", 1, 1));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD_NAME2)),
					reader.getCellValue("Sheet1", 2, 1));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD_NAME3)),
					reader.getCellValue("Sheet1", 3, 1));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD_NAME4)),
					reader.getCellValue("Sheet1", 4, 1));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD_NAME5)),
					reader.getCellValue("Sheet1", 5, 1));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CDD_NAME6)),
					reader.getCellValue("Sheet1", 6, 1));
			action.click(By.id(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_UNAPP));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.chooseOkOnNextConfirmation();
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.id(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_CANCEL));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Delete the current center arrangement")
	public void step05_DeleteArrangement() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			isTestCenterPreset();
			action.click(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_AMEND));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.WRITTEN_APPORTIONMENT_AMEND_DELETE));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.chooseOkOnNextConfirmation();
			action.isTextPrest(By.id(ElementHelper.RESULT_WARNING), "Success.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Export the written testcenter details")
	public void step06_Export() {
		action.waitElementVisibleToClick(By.id(ElementHelper.PRE_TEST_ARRANGE));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT));
		action.waitElementVisible(By.id(ElementHelper.WRITTEN_APPORTIONMENT_EXPORT_REGION));
		action.selectByValue(By.id(ElementHelper.WRITTEN_APPORTIONMENT_EXPORT_REGION), ElementHelper.REGION_VALUE);
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.WRITTEN_APPORTIONMENT_EXPORT_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.WRITTEN_APPORTIONMENT_EXPORT_MONTH), 4);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.WRITTEN_APPORTIONMENT_EXPORT_DATE), "10215");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.WRITTEN_APPORTIONMENT_EXPORT));
			action.setTimeout("15");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public boolean isTestCenterPreset() {
		List<WebElement> table = driver.findElements(By.xpath(ElementHelper.WRITTEN_APPORTIONMENT_SEARCH_TC));
		for (WebElement element : table) {
			if (element.getText().equals(TC)) {
				System.out.println(element.getText());
				break;
			}
		}
		return true;
	}
}
