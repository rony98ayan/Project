
	package com.qa.test;



	import java.io.IOException;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	import com.qa.base.TestBase;
import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
	import com.qa.pages.LoginPage;
	import com.qa.util.UtilsPage;


	public class ContactsPageTest extends TestBase {
		
		LoginPage loginpage;
		HomePage homepage;
		ContactPage contactspage;
		UtilsPage utilspage;

		@BeforeMethod
		@Parameters({"url","un","pwd"})
		public void setUp(String url,String un,String pwd)
		{
			initialization(url);
	   	 utilspage=new UtilsPage(driver);
	   	 homepage=new HomePage(driver);
	   	 loginpage=new LoginPage(driver);
			contactspage=new ContactPage(driver);
	   	 homepage=loginpage.logIn(un, pwd);
	   	 utilspage.switchToFrame();
			
		}
		@DataProvider
		public String[][] getCRMTestData() throws IOException
		{
			String[][] data=UtilsPage.getData();
			return data;
		}
		@Test
		public void newContactView()
		{
			contactspage=homepage.clickOnNewContacts();
	
		}
		@Test(dataProvider="getCRMTestData")
		public void newContactsPageTest(String text,String name1,String name2,String name3)
		{
			contactspage=homepage.clickOnNewContacts();
	         contactspage.putTitle(text);
	         contactspage.putFirstName(name1);
	         contactspage.putLastName(name2);
	         contactspage.putCompanyName( name3);
	         contactspage.putAddressTitle( name4);
	         contactspage.selectType(name5);
	         contactspage.putCity( name6);
	         contactspage.putMobNo(name7);
	         
	         
	         contactspage.clickSave();
	         
		}
		@Test
		public void verifySave&createbuttonTest()
		{
			contactspage=homepage.clickOnCombinedCompany&Contacts();
	         contactspage.putTitle(text);
	         contactspage.putFirstName(name1);
	         contactspage.putLastName(name2);
	         contactspage.putCompanyName( name3);
	         contactspage.putAddressTitle( name4);
	         contactspage.selectType(name5);
	         contactspage.putCity( name6);
	         contactspage.putMobNo(name7);
	         
	         contactspage.clickSavecreateAnother();
		}
		
		@Test
		public void invalidSave&createbuttonTest()
		{
			contactspage=homepage.clickOnCombinedCompany&Contacts();
	         contactspage.putTitle(text);
	       
	         contactspage.putCompanyName( name3);
	         contactspage.putAddressTitle( name4);
	         contactspage.selectType(name5);
	         contactspage.putCity( name6);
	         contactspage.putMobNo(name7);
	         
	         contactspage.clickSavecreateAnother();
		}
		
		@Test
		public void invaliddatanewContactForm()
		{
			contactspage=homepage.clickOnNewContacts();
	         contactspage.putTitle(text);
	         
	         contactspage.putCompanyName( name3);
	         contactspage.putAddressTitle( name4);
	         contactspage.selectType(name5);
	         contactspage.putCity( name6);
	         contactspage.putMobNo(name7);
	         
	         
	         contactspage.clickSave();
		}
		
		@Test
		public void combinedCompanyContactView()
		{
			contactspage=homepage.clickOnCombinedCompanyContact();
	
		}
		
		public void combinedCompanyContactPageTest()
		{
			contactspage=homepage.clickOnCombinedCompanyContact();

			contactspage.putCompanyNameInCombinedForm(name3);
			putTitleInCombinedForm(String text)
	         contactspage.putFirstName(name1);
	         contactspage.putLastName(name2);
	         
	         contactspage.putAddressTitle( name4);
	         contactspage.selectType(name5);
	         contactspage.putCity( name6);
	         contactspage.putMobNo(name7);
	         
	         
	         contactspage.clickSave();
		}
		
	
		
		
		@AfterMethod
	 	public void tearDown()
	 	{
	 		driver.quit();
	 	}
		
		



	}


