package TestCaseforTNG;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterizationBrowser {
	
	@Parameters({"browser"})
	@Test (dataProvider="getData")
	public static void doLogin(String b) throws InterruptedException {
		
		Date d = new Date();
		System.out.println("Browser name ---->  "+ b + d);
		Thread.sleep(2000);
	}
	
	@DataProvider(parallel=true)
	public static Object getData() {
		
		Object[][] data = new Object[2][1];
		data [0][0] = "firefox";
		data [1][0] = "Chrome";
		
		return data;
		
	}
	

}
