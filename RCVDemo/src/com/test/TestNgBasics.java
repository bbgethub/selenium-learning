package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TestNgBasics {
	//Pre Condition starts with @Before
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Setup System prop");
	}
	
	@BeforeClass
	public void login()
	{
		System.out.println("login in the app");	
	
	}
	@BeforeMethod
	public void enterUrl()
	{
		System.out.println("EnterURL");
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launch the Browser");
	}
	
	@Test
	public void googleTiltleTest()
	{
		System.out.println("Google Tiltle Test");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("Search Test");
	}
	//Post condition annotations @After
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from google");
	}

	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("Delete all cookies");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close the Browser");
	}
	@AfterSuite
	public void generateReport()
	{
		System.out.println("Generate Report");
	}
	
}
