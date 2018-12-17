package com.selenium.test.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import com.selenium.test.brower.*;

public class FirstClick{
		
	Mis2Brower m2b = new Mis2Brower();
	
	public void ModifyInputFirstClick(WebDriver driver) {
		m2b.Wait(m2b.normalTime);
		String warningDisplayStyle = driver.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons']")).getAttribute("style");
		String[] arryStyl = warningDisplayStyle.split(";");
		String displayStyle = arryStyl[arryStyl.length-1].trim();
		int isDisplay = warningDisplayStyle.indexOf(displayStyle);
		for(int i =0; i<ModifyAllFirstButtonLength(driver); i++) {
			try {
				if(isElementPresent(driver,By.xpath("//div[@aria-labelledby='ui-id-"+(i+1)+"']")) && isDisplay!=-1) {
					driver.findElement(By.xpath("//div[@aria-labelledby='ui-id-"+(i+1)+"']/div[3]/input[1]")).click();
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
				}else {
					continue;
				}
			}catch(ElementNotVisibleException e) {
				continue;
			}catch(NoSuchElementException e) {
				continue;
			}
		}
	}
	
	public void ModifyInputSecondClick(WebDriver driver) {
		m2b.Wait(m2b.normalTime);
		String warningDisplayStyle = driver.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons']")).getAttribute("style");
		String[] arryStyl = warningDisplayStyle.split(";");
		String displayStyle = arryStyl[arryStyl.length-1].trim();
		int isDisplay = warningDisplayStyle.indexOf(displayStyle);
		for(int i =0; i<ModifyAllFirstButtonLength(driver); i++) {
			try {
				if(isElementPresent(driver,By.xpath("//div[@aria-labelledby='ui-id-"+(i+1)+"']")) && isDisplay!=-1) {
					driver.findElement(By.xpath("//div[@aria-labelledby='ui-id-"+(i+1)+"']/div[3]/input[2]")).click();
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
				}else {
					continue;
				}
			}catch(ElementNotVisibleException e) {
				continue;
			}catch(NoSuchElementException e) {
				continue;
			}
		}
	}
	
	public void SelectTestDate(WebDriver driver,String MonthLocation, String TestDateLocation) {
		m2b.Wait(m2b.normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long y = (Long)js.executeScript("function getYearLength() {\r\n" + 
				"  var yearLength = document.querySelectorAll('#"+MonthLocation+"') [0].options.length\r\n" + 
				"  return yearLength\r\n" + 
				"}\r\n" + 
				"return getYearLength()\r\n" + 
				"");
		Integer getYearLength= new Integer(String.valueOf(y));
		for(int i=0; i<getYearLength; i++) {
			Select dropList = new Select(m2b.WaitElementVisible(driver, By.id(MonthLocation)));
			dropList.selectByIndex(i);
			m2b.Wait(5000);
			Long t = (Long)js.executeScript("function getTestDateLength() {\r\n" + 
					"  var testDateLength = document.querySelectorAll('#"+TestDateLocation+"') [0].options.length\r\n" + 
					"  return testDateLength\r\n" + 
					"}\r\n" + 
					"return getTestDateLength()");
			Integer getTestDateLength= new Integer(String.valueOf(t));
			if(getTestDateLength>1) {
				Select tdatedropList = new Select(m2b.WaitElementVisible(driver, By.id(TestDateLocation)));
				tdatedropList.selectByIndex(1);
				break;
			}else {
				continue;
			}
		}
	}
	
	public boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	
	public int MessageFirstButtonLength(WebDriver driver) {
		m2b.Wait(m2b.normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long i = (Long)js.executeScript("function MessageFirstButtonLength() {\r\n" + 
				"  var divLength = document.getElementsByClassName('ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons').length\r\n" + 
				"  return divLength\r\n" + 
				"}\r\n" + 
				"return MessageFirstButtonLength()\r\n" + 
				"");
		Integer messageFirstButtonLength= new Integer(String.valueOf(i));
		return messageFirstButtonLength;
	}
	
	
	public void MessageFirstClick(WebDriver driver) {
		m2b.Wait(m2b.normalTime);
		for(int i =MessageFirstButtonLength(driver); i>0; i--) {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("document.getElementsByClassName('ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons').item("+(i-1)+").getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('button').item(0).click()");
			}catch(ElementNotVisibleException e) {
				continue;
			}catch(NoSuchElementException e) {
				continue;
			}
		}
	}
		
	public int ModifyAllFirstButtonLength(WebDriver driver) {
		m2b.Wait(m2b.normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long i = (Long)js.executeScript("function ModifyAllFirstButtonLength() {\r\n" + 
				"  var divLength = document.getElementsByClassName('ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable').length\r\n" + 
				"  return divLength\r\n" + 
				"}\r\n" + 
				"return ModifyAllFirstButtonLength()\r\n" + 
				"");
		Integer allFirstButtonLength= new Integer(String.valueOf(i));
		return allFirstButtonLength;
	}
	
	public void ModifyFirstClick(WebDriver driver) {
		m2b.Wait(m2b.normalTime);
		String warningDisplayStyle = driver.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons']")).getAttribute("style");
		String[] arryStyl = warningDisplayStyle.split(";");
		String displayStyle = arryStyl[arryStyl.length-1].trim();
		int isDisplay = warningDisplayStyle.indexOf(displayStyle);
		for(int i =0; i<ModifyAllFirstButtonLength(driver); i++) {
			try {
				if(isElementPresent(driver,By.xpath("//div[@aria-labelledby='ui-id-"+(i+1)+"']")) && isDisplay!=-1) {
					driver.findElement(By.xpath("//div[@aria-labelledby='ui-id-"+(i+1)+"']/div[3]/div[1]/button[1]")).click();
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
				}else {
					continue;
				}
			}catch(ElementNotVisibleException e) {
				continue;
			}catch(NoSuchElementException e) {
				continue;
			}
		}
	}
	
	public void ModifySecondClick(WebDriver driver) {
		m2b.Wait(m2b.normalTime);
		String warningDisplayStyle = driver.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons']")).getAttribute("style");
		String[] arryStyl = warningDisplayStyle.split(";");
		String displayStyle = arryStyl[arryStyl.length-1].trim();
		int isDisplay = warningDisplayStyle.indexOf(displayStyle);
		for(int i =0; i<ModifyAllFirstButtonLength(driver); i++) {
			try {
				if(isElementPresent(driver,By.xpath("//div[@aria-labelledby='ui-id-"+(i+1)+"']")) && isDisplay!=-1) {
					driver.findElement(By.xpath("//div[@aria-labelledby='ui-id-"+(i+1)+"']/div[3]/div[1]/button[2]")).click();
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
					m2b.Wait(m2b.normalTime);
				}else {
					continue;
				}
			}catch(ElementNotVisibleException e) {
				continue;
			}catch(NoSuchElementException e) {
				continue;
			}
		}
	}
	
	public void ModifyOnceFirstClick(WebDriver driver) {
		m2b.Wait(m2b.normalTime);
		String warningDisplayStyle = driver.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons']")).getAttribute("style");
		String[] arryStyl = warningDisplayStyle.split(";");
		String displayStyle = arryStyl[arryStyl.length-1].trim();
		int isDisplay = warningDisplayStyle.indexOf(displayStyle);
		for(int i =0; i<ModifyAllFirstButtonLength(driver); i++) {
			try {
				if(isElementPresent(driver,By.xpath("//div[@aria-labelledby='ui-id-"+(i+1)+"']")) && isDisplay!=-1) {
					driver.findElement(By.xpath("//div[@aria-labelledby='ui-id-"+(i+1)+"']/div[3]/div[1]/button[1]")).click();
					break;
				}else {
					continue;
				}
			}catch(ElementNotVisibleException e) {
				continue;
			}catch(NoSuchElementException e) {
				continue;
			}
		}
	}
	
}
