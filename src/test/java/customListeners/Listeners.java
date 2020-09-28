package customListeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import TestCaseforTNG.BaseTest;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Listeners extends BaseTest implements ITestListener{
	

	public void onTestStart(ITestResult result) {

		System.out.println("Capturing Screenshot for passing cases " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
	
		System.out.println("Capturing Screenshot for passed cases " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		//String MethodName = result.getName().toString().trim();
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=.//Screenshot// target=/_blank/>Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=.//Screenshot// target=/_blank/><img height=200 width=200 src=.//Screenshot//></a>");
		System.out.println("Capturing Screenshot for failing cases " + result.getName());
//
//		try {
//			CaptureScreenshotbyAshot(MethodName);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			CaptureScreenshotbyAshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Capturing Screenshot for skipped cases " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
	}
	
	

}
