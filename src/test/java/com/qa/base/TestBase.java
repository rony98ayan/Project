
	package com.qa.base;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Parameters;









	public class TestBase {
		public static WebDriver driver;
		
		 
		@Parameters({"url"})
		
		public void initialization(String url)
		{
			System.setProperty("webdriver.chrome.driver","C://Users//Dell//Downloads//chromedriver_win32//chromedriver.exe");
			driver=new ChromeDriver();
			
			
			driver.manage().window().maximize();
			driver.get(url);
		}
	 
	}



