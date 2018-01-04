package com.selenium.test.listener;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.selenium.test.capture.TakeScreenshot;

public class TestNGListener  implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCases start and details are" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCases success and details are" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases failed and details are" + result.getName());
		TakeScreenshot.captureScreenShot(result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases skipped and details are" + result.getName());
		TakeScreenshot.captureScreenShot(result.getName());
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

}
