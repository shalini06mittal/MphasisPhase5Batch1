package com.mphasis.testng.TestNgDemo.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on start");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		System.out.println("oin finish");
		System.out.println(context.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("on test failure");
		System.out.println(result.toString());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("on test success");
	}
	
}


