package com.selenium.test.listener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class TestNGListener extends TestListenerAdapter {
	public static WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("TestCases start and details are" + " " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("TestCases success and details are" + " " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases failed and details are" + " " + result.getName());
		captureScreenShot(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases skipped and details are" + " " +  result.getName());
		captureScreenShot(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

	public static String captureScreenShot(ITestResult result) {

		String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String time = new SimpleDateFormat("HHmmss").format(new Date());
		String screenShotPath = "";
		String dir = "screenshot";

		screenShotPath = System.getProperty("user.dir") + File.separator + "ErrorScreenShot" + File.separator + dir
				+ File.separator + date + File.separator + time + ".png";
		System.out.println("screenShotPath=[" + screenShotPath + "]");
		String srcForDisplay = "screenshot/" + date + "/" + time + ".png";
		try {
			if (driver != null) {
				File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File(screenShotPath));
				screenShotPath = screenShotPath.substring(screenShotPath.indexOf("\\"));
				
				Reporter.log("<br/>" + "Test has failed due to below error:" + "<br/><br/>" + result.getThrowable().getMessage()
						+ "<br/><br/> For more details about error click 'Exception' column above.");
				Reporter.log("<a href=" + screenShotPath + " target=_blank>Failed Screen Shot</a>", true);
				Reporter.log("" + "< img width='1500px' src=" + srcForDisplay + " />", true);

				System.out.println("Take the capture sucessful!");
			}
		} catch (IOException e) {
			screenShotPath = "Failed to capture screenshot: " + e.getMessage();
			System.out.println("screenShotPathscreenShotPath==" + screenShotPath);
		}

		return screenShotPath;
	}

}
