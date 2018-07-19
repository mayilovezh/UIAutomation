package com.selenium.test.utils;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebDriverAction {

	protected WebDriver driver;
	boolean istextprest;

	public WebDriverAction(WebDriver driver) {
		this.driver = driver;
	}

	public void open(String url) {
		driver.get(url);
	}

	public void submit(By by) {
		driver.findElement(by).submit();
	}

	public void openWindow(String url, String handler) {
		System.out.println("The function is not available!");
	}

	public void selectWindow(String handler) {
		driver.switchTo().window(handler);
	}

	public void selectFrame(By by) {
		driver.switchTo().frame(driver.findElement(by));
	}

	public void unSelectFrame() {
		driver.switchTo().defaultContent();
	}

	public void close() {
		driver.close();
	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void doubleClick(By by) {
		new Actions(driver).doubleClick(driver.findElement(by)).perform();
	}

	public void clear(By by) {
		driver.findElement(by).clear();
	}

	public void sendkeys(By by, String value) {

		driver.findElement(by).sendKeys(value);
	}

	public void selectByValue(By by, String optionValue) {
		new Select(driver.findElement(by)).selectByValue(optionValue);
	}

	public void selectByIndex(By by, int index) {
		new Select(driver.findElement(by)).selectByIndex(index);
	}

	public void selectcheckbox(By by) {
		new Select(driver.findElement(by));
	}

	public void chooseCancelOnNextConfirmation() {
		driver.switchTo().alert().dismiss();
	}

	public void chooseOkOnNextConfirmation() {
		driver.switchTo().alert().accept();
	}

	public String getValue(By by) {
		return driver.findElement(by).getAttribute("value");
	}

	public String getText(By by) {
		return driver.findElement(by).getText();
	}

	public boolean isVisible(By by) {
		return driver.findElement(by).isDisplayed();
	}

	public void dragdrop(By by, String movementsString) {
		dragAndDrop(by, movementsString);
	}

	public void dragAndDrop(By by, String movementsString) {
		int index = movementsString.trim().indexOf('.');
		int xOffset = Integer.parseInt(movementsString.substring(0, index));
		int yOffset = Integer.parseInt(movementsString.substring(index + 1));
		new Actions(driver).clickAndHold(driver.findElement(by)).moveByOffset(xOffset, yOffset).perform();
	}

	public void setTimeout(String wAIT_TIME) {
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(wAIT_TIME), TimeUnit.SECONDS);
	}

	public String resultWarning(WebDriver driver) {
		return driver.findElement(By.xpath(ElementHelper.RESULT_WARNING)).getText();
	}

	public WebElement waitElementVisible(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitElementVisibleToClick(By by) {
		waitElementVisible(by).click();
	}

	public void waitElementVisibleToSendKeys(By by, String value) {
		waitElementVisible(by).sendKeys(value);
	}

	public void waitElementVisibleToAssert(By by, String value) {
		waitElementVisible(by).getText().equals(value);
	}

	public void waitElementVisibleToAssertFalse(By by, String text) {
		istextprest = waitElementVisible(by).getText().equals(text);
		Assert.assertFalse(istextprest);
	}

	public void isTextPrest(By by, String text) {
		istextprest = waitElementVisible(by).getText().contains(text);
		Assert.assertTrue(istextprest);
	}

	public void elementSelected(By by) {
		ExpectedConditions.elementToBeSelected(by);
	}

	public void assertText(By by, String text) {
		Assert.assertEquals(getText(by), text);
	}

	public void getDefaultOption(By by) {
		Select select = new Select(driver.findElement(by));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);
	}

	public boolean isWebElementPreset(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean isTextExist(By by, String text) {
		try {
			driver.findElement(by).getText().contains(text);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean elementNotPreset(By by) {
		try {
			driver.findElement(by);
			return false;
		} catch (NoSuchElementException e) {
			return true;
		}
	}

	public void uploadFile(String filePath, By by) {
		String path = System.getProperty("user.dir") + filePath;
		File file = new File(path);
		if (file.exists()) {
			driver.findElement(by).sendKeys(file.getPath());
		}
	}

}
