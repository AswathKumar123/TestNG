package TestCaseforTNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeandAfter {
	
	@BeforeSuite
	public void setup() {
		System.out.println("Initalizing");
	}
	
	@AfterSuite
	public void exit() {
		System.out.println("Completed");
	}

}
