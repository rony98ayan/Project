package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

			public LoginPage(WebDriver driver)
			{
				this.driver=driver;
			   PageFactory.initElements(driver, this);
			}

}
