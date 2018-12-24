package com.selenium.test.clericalmarker;


import com.selenium.test.brower.Mis2Brower;
import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class ClericalMarkerElements extends Mis2Brower{
	
	FirstClick fc = new FirstClick();
	
	DynamicVariables dv = new DynamicVariables();
	
	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
	//Clerical Marker Profile
	
	//Clerical Marker Profile
	
}
