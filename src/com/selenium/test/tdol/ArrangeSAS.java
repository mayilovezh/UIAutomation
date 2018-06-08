package com.selenium.test.tdol;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ArrangeSAS {
	WebDriver driver;
	WebDriverAction action;
	String name = "Xiong Ying";

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
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.TDOL));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.ARRANGE_SAS));
			Thread.sleep(ElementHelper.LONG_TIME_A);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "Arrange tdp for SAS")
	public void arrange() {
		try {
			navigate();
			action.selectByIndex(By.id(ElementHelper.ARRANGE_SAS_MONTH), 5);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.ARRANGE_SAS_DATE), "10217");
			Thread.sleep(ElementHelper.LONG_TIME);
			action.selectByIndex(By.id(ElementHelper.ARRANGE_SAS_DUTY), 1);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.ARRANGE_SAS_SEARCH));
			Thread.sleep(ElementHelper.LONG_TIME_A);
			WebElement table = driver.findElement(By.xpath("//*[@id='SpreadSheet-SecurityAS-tdp']/div[2]/table"));
			List<WebElement> options = table
					.findElements(By.xpath("//*[@id='SpreadSheet-SecurityAS-tdp']/div[2]/table/tbody/tr/td[4]"));
			for (int i = 1; i < options.size(); i++) {
				if (options.get(i).getText().equals(name)) {
					System.out.println(options.get(i).getText());
					// WebElement drag =
					// driver.findElement(By.cssSelector("div.SecurityASDragger.dragger"));
					WebElement drag = driver.findElement(By.xpath(ElementHelper.ARRANGE_SAS_DRAG));
					WebElement drop = driver.findElement(By.xpath(ElementHelper.ARRANGE_SAS_DROP));
					(new Actions(driver)).dragAndDrop(drag, drop).build().perform();
				}
			}
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.id(ElementHelper.ARRANGE_SAS_SAVE));
			Thread.sleep(ElementHelper.LONG_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
