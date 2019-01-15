package com.selenium.test.generalquery;

import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;
import com.selenium.test.utils.SqlReader;
import com.selenium.test.brower.Mis2Brower;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class GeneralQueryElements extends Mis2Brower{

	FirstClick fc = new FirstClick();
	
	DynamicVariables dv = new DynamicVariables();
	
	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
    //Holiday Management
    public String HM_CREATE = "btnHolidayCreate";
    public String HM_CREATE_DATE = "HolidayDate";
    public String HM_CREATE_NAME = "Save_HolidayName";
    public String HM_NAME = "HolidayName";
    public String HM_SEARCH = "btnHolidaySearch";
    public String HM_SEARCH_NAME = "//*[@id='div_Holiday_Grid']/div[2]/table/tbody/tr[1]/td[2]";
    public String HM_MODIFY = ".//*[@id='div_Holiday_Grid']/div[2]/table/tbody/tr[1]/td[4]/a[1]";
    public String HM_LOG = ".//*[@id='div_Holiday_Grid']/div[2]/table/tbody/tr[1]/td[4]/a[3]";
    public String HM_LOG_NAME = "//*[@id='HolidayLog']/table/tbody/tr[2]/td[1]";
    public String HM_DELETE = ".//*[@id='div_Holiday_Grid']/div[2]/table/tbody/tr[1]/td[4]/a[2]";
    public String HM_SEARCHYEAR = ".//*[@id='select-Holiday-Year']/option[@value='"+dv.getCurrentYear()+"']";
    
    //Key Dates
    public String KeyDatesSearchProduct = "KeyDates_ProductType";
    public String KeyDatesSearchExamsFormat = "KeyDates_Exams_Format";
    public String KeyDatesSearchYear = "KeyDates_Year";
    public String KeyDatesSearchStartMonth = "KeyDates_StartDate";
    public String KeyDatesSearchEndMonth = "KeyDates_EndDate";
    public String KeyDatesSearchButton = "KeyDates_Search";
    public String listOfKeyDatesText = ".//*[@id='SpreadSheetRoGetKeyDatesGrid']/div[2]/table/tbody/tr[1]/td[1]";
    public String KeyDatesEditButton = ".//*[@id='SpreadSheetRoGetKeyDatesGrid']/div[2]/table/tbody/tr[1]/td[4]/span";
    public String ChangeKeyDatesText = "KeyDatesChangeDate";
    public String viewPageKeyDatesText = ".//*[@id='SpreadSheetRoGetKeyDatesGrid']/div[2]/table/tbody/tr[1]/td[16]/input";
    
    //Key Dates Views
    public String KeyDatesViewSearchProduct = "KeyDates_ProductType_view";
    public String KeyDatesViewSearchExamsFormat = "KeyDates_Exams_Format_view";
    public String KeyDatesViewSearchYear = "KeyDates_Year_view";
    public String KeyDatesViewSearchStartMonth = "KeyDates_StartDate_view";
    public String KeyDatesViewSearchEndMonth = "KeyDates_EndDate_view";
    public String KeyDatesViewSearchButton = "KeyDates_Search_view";
    public String listOfKeyDatesViewText = ".//*[@id='SpreadSheetRoGetKeyDatesGrid_view']/div[2]/table/tbody/tr[1]/td[1]";

    //Registrations Number List
    public String RUL_REGION = "generalQuerySelectRegion";
    public String RUL_TC = "generalQuerySelectCenter";
    public String RUL_DATE_FROM = "txtRegStartDate-RegNum";
    public String RUL_DATE_TO = "txtRegEndDate-RegNum";
    public String RUL_SEARCH = "btnRegistrationsNumberSearch";
    public String RUL_ListOfRegistrationsNumberListViewText = ".//*[@id='spreadsheet-registrations-numberlist']/div[2]/table/tbody/tr[1]/td[2]";

    //Registrations Number List
    public String RUL_ListOfRegistrationsNumberListViewWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(RUL_ListOfRegistrationsNumberListViewText)).getText();
    }
    
    public void SearchRegistrationsNumberListRegion() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(RUL_REGION)));
		dropList.selectByValue("2");
    }
    
    public void SearchRegistrationsNumberListTC() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(RUL_TC)));
		dropList.selectByValue("100229");//dv.GetCZCZUValueOfCenterId()
    }
    
    public void SearchRegistrationsNumberListDateFrom() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(RUL_DATE_FROM)).clear();
		WaitElementVisible(driver, By.id(RUL_DATE_FROM)).sendKeys(dv.GetFirstDayOfThisMonth());
    }
    
    public void SearchRegistrationsNumberListDateTo() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(RUL_DATE_TO)).clear();
		WaitElementVisible(driver, By.id(RUL_DATE_TO)).sendKeys(dv.GetLastDayOfThisMonth());
    }
    
    public void SearchRegistrationsNumberList() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(RUL_SEARCH)).click();
	}
    
    //Key Dates Views
    public String ListOfKeyDatesViewsWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfKeyDatesViewText)).getText();
    }
    
    public void SearchKeyDatesViewClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(KeyDatesViewSearchButton)).click();
    }
    
    public void SearchProductKeyDatesView() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(KeyDatesViewSearchProduct)));
		dropList.selectByValue("1");
    }
    
    public void SearchExamsFormatKeyDatesView() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(KeyDatesViewSearchExamsFormat)));
		dropList.selectByValue("1");
    }
    
    public void SearchYearKeyDatesView() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(KeyDatesViewSearchYear)));
		dropList.selectByValue(dv.getCurrentYear());
    }
    
    public void SearchStartMonthKeyDatesView() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(KeyDatesViewSearchStartMonth)));
		dropList.selectByIndex(1);
    }
    
    public void SearchEndMonthKeyDatesView() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(KeyDatesViewSearchEndMonth)));
		dropList.selectByIndex(12);
    }
    
    //Key Dates
    public void ViewPageKeyDates() {
		String viewPageContents = WaitElementVisible(driver, By.xpath(viewPageKeyDatesText)).getAttribute("value");
		if (viewPageContents.equals("Shown On View Page")) {
			Wait(normalTime);
			WaitElementVisible(driver, By.xpath(viewPageKeyDatesText)).click();
		}else {
			Wait(normalTime);
			WaitElementVisible(driver, By.xpath(viewPageKeyDatesText)).click();
			Wait(normalTime);
			Wait(normalTime);
			WaitElementVisible(driver, By.xpath(viewPageKeyDatesText)).click();
		}
    }
    
    public void inputEditKeyDates() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(ChangeKeyDatesText)).clear();
		WaitElementVisible(driver, By.id(ChangeKeyDatesText)).sendKeys(dv.GetLastDayOfThisMonth());
    }
    
    public void EditKeyDatesClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(KeyDatesEditButton)).click();
    }
    
    public String ListOfKeyDatesWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfKeyDatesText)).getText();
    }
    
    public void SearchKeyDatesClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(KeyDatesSearchButton)).click();
    }
    
    public void SearchProductKeyDates() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(KeyDatesSearchProduct)));
		dropList.selectByValue("1");
    }
    
    public void SearchExamsFormatKeyDates() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(KeyDatesSearchExamsFormat)));
		dropList.selectByValue("1");
    }
    
    public void SearchYearKeyDates() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(KeyDatesSearchYear)));
		dropList.selectByValue(dv.getCurrentYear());
    }
    
    public void SearchStartMonthKeyDates() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(KeyDatesSearchStartMonth)));
		dropList.selectByIndex(1);
    }
    
    public void SearchEndMonthKeyDates() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(KeyDatesSearchEndMonth)));
		dropList.selectByIndex(12);
    }
    
    //Holiday Management
	public void ModifyFirstClick() {
		Wait(normalTime);
		fc.ModifyFirstClick(driver);
	}	
	
	public void DeleteHolidayManagement() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(HM_DELETE)).click();
	}
    
	public String HolidayManagementLogDetailWarning(){
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(HM_LOG_NAME)).getText();
	}
	
	public void LogHolidayManagement() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(HM_LOG)).click();
	}
    
	public void ModifyHolidayManagement() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(HM_MODIFY)).click();
	}
	
	public void SearchHolidayNameOfHolidayManagement(String elements) {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_NAME)).clear();
		WaitElementVisible(driver, By.id(HM_NAME)).sendKeys(elements);
	}
    
	public void SearchYearOfHolidayManagement() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(HM_SEARCHYEAR)).click();
	}
	
	public String HolidayManagementNameWarning(){
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(HM_SEARCH_NAME)).getText();
	}
	
	public void HolidayManagementSearchClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_SEARCH)).click();
	}
	
	public void InputHolidayManagementSearchName(){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_NAME)).click();
	}
	
	public void InputHolidayManagementCreateName(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_CREATE_NAME)).clear();
		WaitElementVisible(driver, By.id(HM_CREATE_NAME)).sendKeys(elements);
	}
	
	public void InputHolidayManagementCreateDate(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_CREATE_DATE)).clear();
		WaitElementVisible(driver, By.id(HM_CREATE_DATE)).sendKeys(elements);
	}
	
    
	public void HolidayManagementCreateClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_CREATE)).click();
	}
    
    public void WindowAlertConfirm(){
    	Wait(normalTime);
    	driver.switchTo().alert().accept();
    }
    	
	public void WaitTime(){
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
}
