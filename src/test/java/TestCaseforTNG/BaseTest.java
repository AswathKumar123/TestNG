package TestCaseforTNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BaseTest {
	
	public static WebDriver driver;
	
	
	public WebDriver getDriver(String browser) {
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if(browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}	
		
		return driver;
	}
	
public static void CaptureScreenshotbyAshot(String MethodName) throws IOException {
		
		Date d = new Date();
		
		String filename = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
		
		
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		ImageIO.write(screenshot.getImage(), "jpg", new File (".//Screenshot//"+MethodName+"_"+filename));
		
}

public static void CaptureScreenshotbyAshot() throws IOException {
	
	Date d = new Date();
	
	String filename = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
	
	
	
	Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	
	ImageIO.write(screenshot.getImage(), "jpg", new File (".//Screenshot//"+filename));
	
}
}
