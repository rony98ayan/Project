package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase{
        
		public HomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[contains(text(),'Contacts2')]")
		WebElement contactsbutton;
		@FindBy(xpath="//a[contains(text(),'New Contact')]")
		WebElement newcontactsbutton;
		public ContactPage clickOnNewContacts()
		{
			Actions a=new Actions(driver);
			a.moveToElement(contactsbutton).build().perform();
			newcontactsbutton.click();
			return new ContactPage(driver);
			
		}

}
