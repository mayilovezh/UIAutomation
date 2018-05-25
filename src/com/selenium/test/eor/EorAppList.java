package com.selenium.test.eor;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.XlsReader;
import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.ExcelReader;
import com.selenium.test.utils.WebDriverAction;

public class EorAppList {
	static WebDriver driver;
	WebDriverAction action;
	String familyName = "HE";
	String givenName = "RUI";
	String markingDueFrom = "2018/04/25";
	String serviceDeadlineFrom = "2018/05/23";
	String courierNo = "111222333";
	String status = "Done";
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}
	
	public void navigateExport() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.CS_EOR));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EOR_APP_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_EXPORT_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_EXPORT_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_EXPORT_MONTH), "3");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.EOR_APP_LIST_EXPORT_DATE), 1);
	}
	
	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.CS_EOR));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EOR_APP_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_EXPORT_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EOR_APP_LIST_FAMILY_NAME), familyName);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EOR_APP_LIST_GIVEN_NAME), givenName);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void step01_ImportEMS() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_STATUS), "3");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.EOR_APP_LIST_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME_A);
		action.click(By.id(ElementHelper.EOR_APP_LIST_IMPORT_EMS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		upload("\\resource\\eor\\EOR-APP.csv");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.cssSelector(ElementHelper.EOR_APP_LIST_IMPORT_UPLOAD));
		Thread.sleep(ElementHelper.SHORT_TIME);
//		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EOR_APP_LIST_IMPORT_UPLOAD_CHECK)), "Successfully import 1 records.");
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
	
	@Test
	public void step02_ChangeToDone() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_STATUS), "3");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.EOR_APP_LIST_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME_A);
		action.click(By.xpath(ElementHelper.EOR_APP_LIST_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_APP_LIST_DONE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	@Test
	public void step03_StatusCheck() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_STATUS), "4");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EOR_APP_LIST_MARKING_DUE_FROM), markingDueFrom);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EOR_APP_LIST_SERVICE_DEADLINE_FROM), serviceDeadlineFrom);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_REFUND_STATUS),"11");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.EOR_APP_LIST_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EOR_APP_LIST_SEARCH_COURIER_NUMBER)), courierNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EOR_APP_LIST_SEARCH_STATUS)), status);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	/*@Test
	public void step01_ExportDispatchList() throws Exception {
//		navigate();
// 		Thread.sleep(ElementHelper.SHORT_TIME_B);
// 		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_DISPATCH_LIST));
//  	    Thread.sleep(ElementHelper.LONG_TIME_B);
 		XlsReader reader = new XlsReader(".\\resource\\eor\\Export Dispatch List.xls");
 		String receiptDate = "2018-03-20";
 		String testDate = "2017-12-09";
 		String testCenter = "BJ-CUEB_UKVI";
 		String cddName = "RUAN LINTING";
 		String cddNo = "223606";
 		Assert.assertEquals(receiptDate,reader.getCellValue("Despatch List", 9, 1));
 		Assert.assertEquals(testDate,reader.getCellValue("Despatch List", 9, 2));
 		Assert.assertEquals(testCenter,reader.getCellValue("Despatch List", 9, 3));
 		Assert.assertEquals(cddName,reader.getCellValue("Despatch List", 9, 4));
 		Assert.assertEquals(cddNo,reader.getCellValue("Despatch List", 9, 5));
	}
	
	@Test
	public void step02_ExportLRScore() throws Exception {
//		navigate();
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
//		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_LR_SCORE));
//		Thread.sleep(ElementHelper.WAIT_TIME);
		XlsReader reader = new XlsReader(".\\resource\\eor\\Export EOR LR score input.xls");
		String testDate = "2017-12-09";
		String testCenter = "BJ-CUEB_UKVI";
		String cddName = "WANG HAORAN";
		String cddNo = "223730";
		Assert.assertEquals(testDate,reader.getCellValue("Despatch List", 8, 1));
		Assert.assertEquals(testCenter,reader.getCellValue("Despatch List", 8, 2));
		Assert.assertEquals(cddName,reader.getCellValue("Despatch List", 8, 4));
		Assert.assertEquals(cddNo,reader.getCellValue("Despatch List", 8, 3));
	}
	
	@Test
	public void step03_ExportWritingScore() throws Exception {
//		navigate();
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
//		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_EOR_WRIT_SCORE));
//		Thread.sleep(ElementHelper.WAIT_TIME);
		XlsReader reader = new XlsReader(".\\resource\\eor\\Export EOR writing Score input.xls");
		String testDate = "2017-12-09";
		String testCenter = "HRB-HEU_UKVI";
		String cddName = "YU ZHAOXI";
		String cddNo = "223912";
		Assert.assertEquals(testDate,reader.getCellValue("Despatch List", 6, 3));
		Assert.assertEquals(testCenter,reader.getCellValue("Despatch List", 6, 1));
		Assert.assertEquals(cddName,reader.getCellValue("Despatch List", 6, 2));
		Assert.assertEquals(cddNo,reader.getCellValue("Despatch List", 6, 4));
	}
	
	@Test
	public void step04_ExportSpeakingScore() throws Exception {
//		navigate();
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
//		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_EOR_SPK_SCORE));
//		Thread.sleep(ElementHelper.WAIT_TIME);
		XlsReader reader = new XlsReader(".\\resource\\eor\\Export EOR speaking score input.xls");
		String testDate = "2017-12-09";
		String testCenter = "BJ-CUEB_UKVI";
		String cddName = "RUAN LINTING";
		String cddNo = "223606";
		Assert.assertEquals(testDate,reader.getCellValue("Despatch List", 7, 3));
		Assert.assertEquals(testCenter,reader.getCellValue("Despatch List", 7, 1));
		Assert.assertEquals(cddName,reader.getCellValue("Despatch List", 7, 2));
		Assert.assertEquals(cddNo,reader.getCellValue("Despatch List", 7, 4));
	}
	
	@Test
	public void step05_ExportDiffWriting() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_DIFF_WRIT));
		Thread.sleep(ElementHelper.LONG_TIME);
//		ExcelReader xlsxReader = new ExcelReader(".\\resource\\eor\\1.5+ wri.xlsx");
	}
	
	@Test
	public void step06_ExportDiffSpeaking() throws Exception {
//		navigate();
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
//		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_DIFF_SPK));
//		Thread.sleep(ElementHelper.LONG_TIME);
        ExcelReader xlsxReader = new ExcelReader(".\\resource\\eor\\1.5+ spk.xlsx");
		String testDate = "2017-12-16";
		String testCenter = "BJ-BFSU_UKVI";
		String cddName = "WEN WENKANG";
		String cddNo = "237038";
		String fcScore = "4.0";
		String pScore = "5.0";
		String firstScore = "4.5";
		String eorScore = "6.0";
		Assert.assertEquals(testDate,xlsxReader.getCellValue("Sheet1", 2, 2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(testCenter,xlsxReader.getCellValue("Sheet1", 2, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(cddName,xlsxReader.getCellValue("Sheet1", 2, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(cddNo,xlsxReader.getCellValue("Sheet1", 2, 5));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(fcScore,xlsxReader.getCellValue("Sheet1", 2, 7));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(fcScore,xlsxReader.getCellValue("Sheet1", 2, 8));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(pScore,xlsxReader.getCellValue("Sheet1", 2, 9));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(pScore,xlsxReader.getCellValue("Sheet1", 2, 10));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(firstScore,xlsxReader.getCellValue("Sheet1",2 ,11));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(eorScore,xlsxReader.getCellValue("Sheet1", 2, 13));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(eorScore,xlsxReader.getCellValue("Sheet1", 2, 14));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(eorScore,xlsxReader.getCellValue("Sheet1", 2, 15));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(eorScore,xlsxReader.getCellValue("Sheet1", 2, 16));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(eorScore,xlsxReader.getCellValue("Sheet1", 2, 17));
	}
	
	@Test
	public void step07_ExportEMSList() {
		
	}
	
	@Test
	public void step08_ExportEMSList_New() {
		
	}
	
	@Test
	public void step09_ExportScoreInformation() throws Exception {
//		navigate();
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
//		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_EOR_SCORE_INFORMATION));
//		Thread.sleep(ElementHelper.WAIT_TIME);
		ExcelReader xlsxReader = new ExcelReader(".\\resource\\eor\\EORScoreInformation.xlsx");
		String testDate = "2017-12-09";
		String testCenter = "BJ-CUEB_UKVI";
		String cddName = "RUAN LINTING";
		String cddNo = "223606";
		String L_Score = "5";
		String R_Score = "5.5";
		String W_Score = "5.5";
		String S_Score = "5.5";
		String overall = "5.5";
		Assert.assertEquals(testDate,xlsxReader.getCellValue("EOR Score Information", 6, 1));
		Assert.assertEquals(testCenter,xlsxReader.getCellValue("EOR Score Information", 6, 2));
		Assert.assertEquals(cddName,xlsxReader.getCellValue("EOR Score Information", 6, 4));
		Assert.assertEquals(cddNo,xlsxReader.getCellValue("EOR Score Information", 6, 3));
		Assert.assertEquals(L_Score,xlsxReader.getCellValue("EOR Score Information", 6, 5));
		Assert.assertEquals(R_Score,xlsxReader.getCellValue("EOR Score Information", 6, 6));
		Assert.assertEquals(W_Score,xlsxReader.getCellValue("EOR Score Information", 6, 7));
		Assert.assertEquals(S_Score,xlsxReader.getCellValue("EOR Score Information", 6, 8));
		Assert.assertEquals(overall,xlsxReader.getCellValue("EOR Score Information", 6, 9));
	}*/
	
	public void upload(String filePath) {
		String path = System.getProperty("user.dir") + filePath;
		File file = new File(path);
		if(file.exists()) {
			driver.findElement(By.id(ElementHelper.EOR_APP_LIST_IMPORT_CHOOSE)).sendKeys(file.getPath());
		}
	}
}
