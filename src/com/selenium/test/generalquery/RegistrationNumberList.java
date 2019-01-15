package com.selenium.test.generalquery;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.selenium.test.utils.DynamicVariables;

public class RegistrationNumberList {
	GeneralQueryElements gqe = new GeneralQueryElements();
	GeneralQueryInputData gqi = new GeneralQueryInputData();
	DynamicVariables dv = new DynamicVariables();
	
	@BeforeClass
	public void setUp(){
		gqe.OpenBrower("GeneralQuery", 1);
	}

	@AfterClass
	public void Close(){
		gqe.Close();
	}

	@Test
	public void step01_Search(){
		try {
			gqe.SearchRegistrationsNumberListRegion();
			gqe.SearchRegistrationsNumberListTC();
			gqe.SearchRegistrationsNumberListDateFrom();
			gqe.SearchRegistrationsNumberListDateTo();
			gqe.SearchRegistrationsNumberList();
			Assert.assertEquals(gqe.RUL_ListOfRegistrationsNumberListViewWarning(), gqe.RUL_ListOfRegistrationsNumberListViewWarning());
		}catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
			System.out.println("There is not data......");
		}catch(TimeoutException e) {
			System.out.println(e.getMessage());
			System.out.println("There is not data......");
		}
	}

}
