package com.selenium.test.eor;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class SecondImportScore {
	static WebDriver driver;
	WebDriverAction action;
	
	@BeforeMethod
	public void setUp() {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}
	
	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.CS_EOR));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SECOND_IMPORT_SCORE));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.SECOND_IMPORT_SCORE_YEAR), "2017");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.SECOND_IMPORT_SCORE_MONTH), ElementHelper.VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.SECOND_IMPORT_SCORE_DATE), "2017-01-25T00:00:00");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void uploadSpeaking() throws Exception {
		navigate();
		upload("\\resource\\eor\\EORSpeakingScoreImportTemplate.xlsx");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.cssSelector(ElementHelper.FIRST_IMPORT_SCORE_UPLOAD));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void uploadWriting() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.FIRST_IMPORT_SCORE_WRITING));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		upload("\\resource\\eor\\EORWritingScoreImportTemplate.xlsx");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.cssSelector(ElementHelper.FIRST_IMPORT_SCORE_UPLOAD));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void uploadLR() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.FIRST_IMPORT_SCORE_LR));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		upload("\\resource\\eor\\EORLRScoreTemplate.xlsx");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.cssSelector(ElementHelper.FIRST_IMPORT_SCORE_UPLOAD));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	
	
	public void upload(String filePath) {
		String path = System.getProperty("user.dir") + filePath;
		File file = new File(path);
		if(file.exists()) {
			driver.findElement(By.id(ElementHelper.SECOND_IMPORT_SCORE_SELECTFILE)).sendKeys(file.getPath());
		}
	}
}
