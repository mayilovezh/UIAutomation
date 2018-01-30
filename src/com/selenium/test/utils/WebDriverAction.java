package com.selenium.test.utils;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverAction {

	protected WebDriver driver;

	public WebDriverAction(WebDriver driver) {
		this.driver = driver;
	}
	
	public void open(String url) {
		driver.get(url);
	}
	
	public void submit(By by) {
		driver.findElement(by).submit();
	}
	
	public void openWindow(String url,String handler) {  
        System.out.println("The function is not available!");  
    }  
	
	public void selectWindow(String handler){
		driver.switchTo().window(handler);
	}
	
	public void selectFrame(By by) {
		 driver.switchTo().frame(driver.findElement(by));  
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

	public void sendkeys(By by,String value) {

		driver.findElement(by).sendKeys(value);
	}
	
	public void sendkeys(By by,CharSequence[] list) {
		driver.findElement(by).sendKeys(list);
	}
	
	public void selectByValue(By by,String optionValue) {
		new Select(driver.findElement(by)).selectByValue(optionValue);
	}
	
	public void selectByIndex(By by,int index) {
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
     
     public void dragdrop(By by,String movementsString) {  
         dragAndDrop(by, movementsString);  
     }  
     
     public void dragAndDrop(By by,String movementsString) {  
         int index = movementsString.trim().indexOf('.');  
         int xOffset = Integer.parseInt(movementsString.substring(0, index));  
         int yOffset = Integer.parseInt(movementsString.substring(index+1));  
         new Actions(driver).clickAndHold(driver.findElement(by)).moveByOffset(xOffset, yOffset).perform();  
     }  
     
     public void setTimeout(String wAIT_TIME) {  
         driver.manage().timeouts().implicitlyWait(Integer.parseInt(wAIT_TIME), TimeUnit.SECONDS);  
     }  
     
     public List<WebElement> getinputValue(){
    	 WebElement tdpGivenNameEn = driver.findElement(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_EN));
    	 WebElement tdpGivenNameCn = driver.findElement(By.id(ElementHelper.TDP_PROFILE_CREATE_GIVEN_NAME_CN));
    	 WebElement tdpFamilyNameEn = driver.findElement(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_EN));
    	 WebElement tdpFamilyNameCn = driver.findElement(By.id(ElementHelper.TDP_PROFILE_CREATE_FAMILY_NAME_CN));
    	 
    	 List<WebElement> inputWebElement = new ArrayList<WebElement>();
    	 inputWebElement.add(tdpGivenNameEn);
    	 inputWebElement.add(tdpGivenNameCn);
    	 inputWebElement.add(tdpFamilyNameEn);
    	 inputWebElement.add(tdpFamilyNameCn);
    	 return inputWebElement;
     }
}
