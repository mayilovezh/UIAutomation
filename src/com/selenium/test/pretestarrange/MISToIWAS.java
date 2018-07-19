package com.selenium.test.pretestarrange;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.ExcelReader;
import com.selenium.test.utils.WebDriverAction;
import com.selenium.test.utils.XmlReader;

public class MISToIWAS {
	static WebDriver driver;
	WebDriverAction action;
	String fileName = ".\\resource\\pretestArrange\\IWAS_data_date=2018-05-19_testcenter=BJ-CUEB_module=A(IELTS).xml";
	XmlReader xmlReader = new XmlReader(fileName, "CANDIDATE REGISTRATIONNUMBER");
	ExcelReader reader = new ExcelReader(".\\resource\\pretestArrange\\MISToIWAS_CddRegistrationNumber.xlsx");

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Test(description = "Download and verify the '2018-05-19_CUEB_IELTS_A'session candidate registration number.")
	public void step01_Download() {
		action.waitElementVisibleToClick(By.id(ElementHelper.PRE_TEST_ARRANGE));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.MIS_TO_IWAS));
		action.waitElementVisible(By.id(ElementHelper.MIS_TO_IWAS_REGION));
		action.selectByValue(By.id(ElementHelper.MIS_TO_IWAS_REGION), ElementHelper.REGION_VALUE);
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.MIS_TO_IWAS_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.MIS_TO_IWAS_MONTH), 4);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.MIS_TO_IWAS_TEST_DATE), "10352");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.MIS_TO_IWAS_TEST_CENTER), "50");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.MIS_TO_IWAS_MODULE), "0");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			java.io.File file = new java.io.File(fileName);
			if (!file.exists()) {
				action.click(By.id(ElementHelper.MIS_TO_IWAS_DOWNLOAD));
				action.setTimeout("10");
			} else {
				for (int i = 281; i < reader.getRowsLength("Sheet1"); i++) {
					xmlReader.equals(reader.getColums("Sheet1", 0).get(i));
				}
			}
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}
}
