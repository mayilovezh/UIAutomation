package com.selenium.test.testcenter;

import com.selenium.test.brower.Brower;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class CenterElements extends Brower{
		
	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
	public String searchCenterRegionButton =".//*[@id='div-datatable-testcenter']/p/input";

	public void SearchSelectCenterRegionClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCenterRegionButton)));
		dropList.selectByValue("2");
	} 	
	
		
}
