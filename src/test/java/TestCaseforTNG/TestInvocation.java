package TestCaseforTNG;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import customListeners.*;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestInvocation extends BaseTest {
	
	@Test (invocationCount=1, threadPoolSize = 1)
	public void executeTest() throws IOException {
		
		driver = getDriver("Chrome");
		driver.get("https://www.hilton.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("Where")).click();
	
		
		driver.quit();
		
	}
	
	
	
	
}
