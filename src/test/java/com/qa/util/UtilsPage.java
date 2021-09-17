
	package com.qa.util;



	import java.io.File;
	import java.io.IOException;
	import java.text.SimpleDateFormat;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.hpsf.Date;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

	import com.qa.base.TestBase;

	public class UtilsPage extends TestBase {
		
		
		public UtilsPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	      public void switchToFrame()
	      {
	    	  driver.switchTo().frame("mainpanel");
	      }

	      
	  	public static String[][] getData() throws IOException
	  	{
	  		String xFile="F:\\Exercise\\FreeCRMTestAutomtions\\src\\test\\java\\com\\qa\\testdata\\DataBook.xlsx";
	  		String xSheet="Sheet1";
	  		int rowcount=ExcelUtility.getRowCount(xFile, xSheet);
	  		int colcount=ExcelUtility.getCellCount(xFile, xSheet, rowcount);
	  		String data[][]=new String[rowcount][colcount];
	  		for(int i=1;i<=rowcount;i++)
	  		{
	  			for(int j=0;j<colcount;j++)
	  			{
	  				data[i-1][j]=ExcelUtility.getCellData(xFile, xSheet, i,j);
	  			}
	  		}
	  		return data;
	  	
	  	}
	  	public static String getScreenSot(WebDriver driver, String ScreenshotName) throws IOException {

//			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

			TakesScreenshot screenShot = (TakesScreenshot) driver;
			File Source = screenShot.getScreenshotAs(OutputType.FILE);

			String dest = System.getProperty("user.dir") + "/screenshot/" + ScreenshotName + ".png";

			File FileDestination = new File(dest);
			FileUtils.copyFile(Source, FileDestination);

			return dest;

		}
	}


