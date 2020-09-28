package TestCaseforTNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testcase1ng {
	
//	@Test (priority=3, dependsOnMethods = "UserReg", alwaysRun = true, groups="functional")
	@Test (priority=3, alwaysRun = true, groups="functional")

	public void asserttest() {
		
		SoftAssert softassert = new SoftAssert();
	String expected_Title = "Google.com",
		    actual_Title = "Apple.com" ;
	
	System.out.println("Validation titles");
	
		//Assert.assertEquals(actual_Title, expected_Title, "Test pass");
	softassert.assertEquals(actual_Title, expected_Title, "Test pass");
		
		System.out.println("Validating image");
		
		softassert.assertEquals(true, false, "Image presence");
		
		System.out.println("Validating text presence");
		
		softassert.assertEquals(true, false, "Text Presence");
		
		softassert.assertAll();	
		
		throw new SkipException("Forcefully Skipping case");
		
	}
	
	@BeforeMethod
	public void LaunchingBrowser() {
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void ClosingBrowser() {
		System.out.println("closing Browser");
	}
	
	@BeforeTest
	public void LaunchDB() {
		System.out.println("DB Launched");
	}
	
	@AfterTest
	public void CloseDB() {
		System.out.println("DB Closed");
	}
	
	@Test (priority =2, groups= {"functional","smoke"})
	public void doLogin() {
		
		System.out.println("Login Executed");
		
	}
	
	@Test (priority =1, groups="bvt")
	public void UserReg() {
		System.out.println("USer Registered");
		//Assert.fail("User reg failed");
	}
	
	
	
}

