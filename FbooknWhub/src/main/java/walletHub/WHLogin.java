package walletHub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class WHLogin {

	
	WebDriver driver;
	
	By loginid =By.xpath("//input[@placeholder='Email Address']");
	By loginpass = By.xpath("//input[@placeholder='Password']");
	By clicklogin = By.xpath("//button[@type='button'][contains(@class, 'blue')]");

	
	
	public WHLogin(WebDriver driver1) {
           this.driver = driver1;
           }
	
	
	public void login(String id, String pas) {

		driver.findElement(loginid).sendKeys(id);
		driver.findElement(loginpass).sendKeys(pas);
		driver.findElement(clicklogin).click();

	}
	
	
	
	
	
}
