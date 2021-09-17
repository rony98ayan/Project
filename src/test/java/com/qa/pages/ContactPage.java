
	package com.qa.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	import com.qa.base.TestBase;

	public class ContactPage extends TestBase {

		public ContactPage(WebDriver driver) {

			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}

		
		
		@FindBy(xpath="//select[@name='title']")
		   WebElement title;
		
		@FindBy(xpath="//input[@id='first_name']")
		WebElement firstname;
		
		@FindBy(xpath="//input[@id='surname']")
		WebElement surname;
		
		@FindBy(xpath="//tbody/tr[8]/td[2]/input[3]")
		WebElement company;
		
		@FindBy(xpath="//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[3]/td[1]/fieldset[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
          WebElement addresstitle;
		
		@FindBy(xpath="//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[3]/td[1]/fieldset[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/select[1]")
       WebElement type;
		
		@FindBy(xpath="//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[3]/td[1]/fieldset[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]")
         WebElement city;
		
		@FindBy(xpath="//input[@id='mobile']")
		WebElement mobno;
		
		
		@FindBy(xpath="//input[@type='submit']")
		 WebElement save;
		
		@FindBy(xpath="//tbody/tr[1]/td[1]/input[3]")
		WebElement save2;
		
		public void putTitle(String text)
		{
			Select s=new Select(title);
		   s.selectByVisibleText(text);
			
		}
		
		public void putFirstName(String name1)
		{
			firstname.sendKeys(name1);
		}
		
		public void putLastName(String name2)
		{
			surname.sendKeys(name2);
		}
		
		public void putCompanyName(String name3)
		{
			company.sendKeys(name3);
		}
		
		public void putAddressTitle(String name4)
		{
			addresstitle.sendKeys(name4);
		}
		
		public void selectType(String name5)
		{
			Select s=new Select(type);
			   s.selectByVisibleText(name5);
		}
		public void putCity(String name6)
		{
			city.sendKeys(name6);
		}
		
		public void putMobNo(String name7)
		{
			mobno.sendKeys(name7);
		}

		public void clickSave()
		{
			save.click();
		}
		public void clickSavecreateAnother()
		{
			save2.click();
		}
		
		@FindBy(xpath="//input[@id='company_name']")
		WebElement companyname;
		
		@FindBy(xpath="//tbody/tr[1]/td[2]/select[1]")
		WebElement titleincombinedform;
		
//		@FindBy(xpath="//input[@id='first_name']")

		public void putCompanyNameInCombinedForm(String name3)
		{
			companyname.sendKeys(name3);
		}
		
		public void putTitleInCombinedForm(String text)
		{
			Select s=new Select(title);
		   s.selectByVisibleText(text);
			
		}
		
	}


}
