package com.selenium.test.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TakeScreenshot{

	public static String captureScreenShot(WebDriver driver,String StrProjectName){
		
		String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String time = new SimpleDateFormat("HHmmss").format(new Date());
		String screenShotPath = "";
		String dir = "screenshot";

		screenShotPath = System.getProperty("user.dir") + File.separator +  "ErrorScreenShot" + File.separator + dir + File.separator + date + File.separator + time + ".png";
		System.out.println("screenShotPath=[" + screenShotPath + "]");
		String srcForDisplay = "screenshot/" + date + "/" + time + ".png";
		try {
			if (driver != null) {
				File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File(screenShotPath));
				screenShotPath = screenShotPath.substring(screenShotPath.indexOf("\\"));
				Reporter.log("<a href="  + screenShotPath + " target=_blank>Failed Screen Shot</a>",true);
				Reporter.log("" + "< img width='1500px' src=" + srcForDisplay + " />",true);
				
				System.out.println("Take the capture for the failure!");
			}
		} catch (IOException e) {
			screenShotPath = "Failed to capture screenshot: " + e.getMessage();
			System.out.println("screenShotPathscreenShotPath=="+screenShotPath);
		}
		 
		return screenShotPath;
	}
	
}
