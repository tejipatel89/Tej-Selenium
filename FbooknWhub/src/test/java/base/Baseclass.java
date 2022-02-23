package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import configs.Environmenturls;

public class Baseclass extends Environmenturls {
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void initiatebrowser() {

		System.setProperty("webdriver.gecko.driver",
				"E:\\Selenium\\seleniumusefullcomponent\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
