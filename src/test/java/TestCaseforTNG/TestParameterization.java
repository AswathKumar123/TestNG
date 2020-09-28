package TestCaseforTNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterization {
	
	public static ExcelReader excel =null;
	
	
	@Test (dataProvider="getData")
	public void testData(String Destination, String Date) {
		
		System.out.println(Destination +"---> "+ Date);
		
	}
	
	@DataProvider
	public static Object[][] getData() {
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Raman";
		data[0][1] = "raman@gmail.com";
		
		data[1][0] = "Gold";
		data[1][1] = "Goldenbow@gmail.com";
		return data;
		
	}

}
