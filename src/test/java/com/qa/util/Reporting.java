package com.qa.util;
	
import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.base.TestBase;
	public class Reporting extends TestListenerAdapter {
		
		ExtentHtmlReporter htmlReporter;
		 
		  ExtentReports extent;
		  
		  ExtentTest xTest;


		  public void onStart(ITestContext testContext) {

//				String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				String RepName = testContext.getName()+"_" + ".html";
				String dest = System.getProperty("user.dir") + "/Report/" + RepName;

				htmlReporter = new ExtentHtmlReporter(dest);
				extent = new ExtentReports();
				extent.attachReporter(htmlReporter);

				// To add system or environment info by using the setSystemInfo method.

				// configuration items to change the look and feel
				// add content, manage tests etc
			
				htmlReporter.config().setDocumentTitle("Report");
				htmlReporter.config().setReportName("Report");
				htmlReporter.config().setTheme(Theme.STANDARD);
				htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

			}

			public void onFinish(ITestContext arg0) {
				extent.flush();

			}

			public void onTestFailure(ITestResult tr) {
				xTest = extent.createTest(tr.getName());
				xTest.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
				xTest.log(Status.FAIL, "Test is Fieled");
				xTest.log(Status.FAIL, tr.getThrowable());

				String screenSot;
				try {
					screenSot = UtilsPage.getScreenSot(TestBase.driver, tr.getName());
					xTest.addScreenCaptureFromPath(screenSot);

				} catch (IOException e) {
					e.printStackTrace();
				}

			}

			public void onTestSkipped(ITestResult tr) {
				xTest.log(Status.SKIP,"Skipped ");

			}

			public void onTestSuccess(ITestResult tr) {
				xTest = extent.createTest(tr.getName());
				xTest.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
				xTest.log(Status.PASS, "Test is Passed");

			}

			
			
		
		
	}

